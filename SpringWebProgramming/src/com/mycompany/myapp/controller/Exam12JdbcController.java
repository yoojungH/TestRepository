package com.mycompany.myapp.controller;

import java.io.File;
import java.util.Date;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.dto.Board;
import com.mycompany.myapp.service.Exam12Service;

@Controller
public class Exam12JdbcController {
	private static final Logger LOGGER = LoggerFactory.getLogger(Exam12JdbcController.class);
	@Autowired
	private Exam12Service service;
	
	@Autowired
	private ServletContext servletContext;
	
	@RequestMapping("/jdbc/exam01")
	public String exam01() {
		Board board = new Board();
		board.setBtitle("제목");
		board.setBcontent("내용");
		board.setBwriter("홍길동");
		board.setBpassword("12345");
		board.setBoriginalfilename("a.png");
		board.setBsavedfilename("a.png");
		board.setBfilecontent("image/png");
		service.write(board);
		return "redirect:/";
	}
	
	@RequestMapping(value="/jdbc/exam02",method=RequestMethod.GET)
	public String exam02Get() {		
		return "jdbc/exam02";
	}
	
//	@RequestMapping(value="/jdbc/exam02",method=RequestMethod.POST)
//	public String exam02Post(String btitle, String bwriter, String bpassword, String bcontent, MultipartFile battach) {
//		LOGGER.info("실행됨");
//		LOGGER.info("btitle: "+btitle);
//		LOGGER.info("파일 사이즈: " +battach.getOriginalFilename());
//		return "redirect:/";
//	}
	
	@RequestMapping(value="/jdbc/exam02",method=RequestMethod.POST)
	public String exam02Post(Board board) throws Exception {
		/* 첨부 파일에 대한 정보를 칼럼값으로 저장 */
		board.setBoriginalfilename(board.getBattach().getOriginalFilename());
		board.setBfilecontent(board.getBattach().getContentType());
		String fileName = new Date().getTime() + "-" + board.getBoriginalfilename();
		board.setBsavedfilename(fileName);
		
		/* 첨부 파일을 서버 로컬 시스템에 저장 */
		String realPath = servletContext.getRealPath("/WEB-INF/upload/");
		LOGGER.info(realPath);
		File file = new File(realPath + fileName);
		board.getBattach().transferTo(file);
		
		/* 서비스 객체에 요청 처리 요청 */
		service.write(board);
	
		return "redirect:/";
	}
}
