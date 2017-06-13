package com.mycompany.myapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exam14AopController {
//	/* 로그인 필요 없이 작동하는 메소드 */
//	@RequestMapping("/aop/exam01")
//	public String exam01() {
//		return "aop/exam01";
//	}
	
	/* 로그인 필요 없이 작동하는 메소드 */
	@RequestMapping("/aop/exam01")
	public String exam01(HttpSession session) {
		session.setAttribute("mid", "안녕");
		return "aop/exam02";
	}
	
	/* 로그인 해야만 작동하는 메소드 */
	@RequestMapping("/aop/exam02Write")
	public String exam02Write() {
		return "aop/exam02";
	}
	
	@RequestMapping("/aop/exam02Update")
	public String exam02Update() {
		return "aop/exam02";
	}
	
	
}
