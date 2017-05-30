package com.mycompany.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dto.Board;

@Component
public class Exam12DaoImpl implements Exam12Dao {
	private static final Logger LOGGER = LoggerFactory.getLogger(Exam12DaoImpl.class);

	@Override
	public void insert1(Board board) {
		Connection conn = null;
		try {
			/* JDBC Driver 클래스 로딩 */
			Class.forName("oracle.jdbc.OracleDriver");
			
			/* 연결 문자열 작성 */
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
			/* 연결 객체 얻기 */
			conn = DriverManager.getConnection(url, "iotuser", "iot12345");
			LOGGER.info("연결 성공");
			
			/* SQL문 작성 */
			String sql = "insert into board ";
			sql += "(bno, btitle, bcontent, bwriter, bdate, bpassword, bhitcount, boriginalfilename, bsavedfilename, bfilecontent) ";
			sql += "values ";
			sql += "(board_bno_seq.nextval, ?, ?, ?, sysdate, ?, 0, ?, ?, ?)";
			
			/* SQL문을 전송해서 실행*/
			//Statement stmt = conn.createStatement();
			//stmt.executeUpdate(sql);
			//stmt.close();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setString(4, board.getBpassword());
			pstmt.setString(5, board.getBoriginalfilename());
			pstmt.setString(6, board.getBsavedfilename());
			pstmt.setString(7, board.getBfilecontent());
			pstmt.executeUpdate();
			pstmt.close();
			LOGGER.info("행 추가 성공");	
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			/* 연결 끊기 */
			try {conn.close();} catch (SQLException e){}
			LOGGER.info("연결 끊김");
		}
	}


	public static void main(String[] args) {
		Exam12DaoImpl test = new Exam12DaoImpl();
		Board board = new Board();
		board.setBtitle("제목");
		board.setBcontent("내용");
		board.setBwriter("홍길동");
		board.setBpassword("12345");
		board.setBoriginalfilename("a.png");
		board.setBsavedfilename("a.png");
		board.setBfilecontent("image/png");
		test.insert1(board);
	}
}
