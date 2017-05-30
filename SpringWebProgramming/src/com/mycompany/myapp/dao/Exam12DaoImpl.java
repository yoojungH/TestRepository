package com.mycompany.myapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dto.Exam12Board;
import com.mycompany.myapp.dto.Exam12Member;

@Component
public class Exam12DaoImpl implements Exam12Dao {
	private static final Logger LOGGER = LoggerFactory.getLogger(Exam12DaoImpl.class);

	@Override
	public int insert1(Exam12Board board) {
		int bno = -1;
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

			/* SQL문을 전송해서 실행 */
			/* 테이블 정의시 칼럼의 속성으로 자동 증가를 지정할 수 있는 DB일 경우(MySQL, MS SQL) */
			// PreparedStatement pstmt = conn.prepareStatement(sql,
			// Statement.RETURN_GENERATED_KEYS);
			/* 오라클일 경우 Sequence 외부 객체로 자동 증가값을 얻기 때문에 다음과 같이 지정 */
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] { "bno" });
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setString(4, board.getBpassword());
			pstmt.setString(5, board.getBoriginalfilename());
			pstmt.setString(6, board.getBsavedfilename());
			pstmt.setString(7, board.getBfilecontent());
			pstmt.executeUpdate();
	
			ResultSet rs = pstmt.getGeneratedKeys();
			rs.next();
			bno = rs.getInt(1);

			pstmt.close();
			LOGGER.info("행 추가 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			/* 연결 끊기 */
			try {
				conn.close();
			} catch (SQLException e) {
			}
			LOGGER.info("연결 끊김");
		}
		return bno;
	}

	@Override
	public String insert2(Exam12Member member) {
		String mid = null;

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
			String sql = "insert into member ";
			sql += "(mid, mname, mpassword, mdate, mtel, memail, mage, maddress, moriginalfilename, msavedfilename, mfilecontent) ";
			sql += "values ";
			sql += "(?, ?, ?, sysdate, ?, ?, ?, ?, ?, ?, ?)";

			/* SQL문을 전송해서 실행 */
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMname());
			pstmt.setString(3, member.getMpassword());
			pstmt.setString(4, member.getMtel());
			pstmt.setString(5, member.getMemail());
			pstmt.setInt(6, member.getMage());
			pstmt.setString(7, member.getMaddress());
			pstmt.setString(8, member.getMoriginalfilename());
			pstmt.setString(9, member.getMsavedfilename());
			pstmt.setString(10, member.getMfilecontent());			
			pstmt.executeUpdate();
		
			ResultSet rs = pstmt.getGeneratedKeys();
			rs.next();
			mid = rs.getString(1);
			pstmt.close();
			LOGGER.info("행 추가 성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			/* 연결 끊기 */
			try {
				conn.close();
			} catch (SQLException e) {
			}
			LOGGER.info("연결 끊김");
		}
		return mid;
	}

	public static void main(String[] args) {
		Exam12DaoImpl test1 = new Exam12DaoImpl();
		Exam12Board board = new Exam12Board();
		board.setBtitle("제목");
		board.setBcontent("내용");
		board.setBwriter("홍길동");
		board.setBpassword("12345");
		board.setBoriginalfilename("a.png");
		board.setBsavedfilename("a.png");
		board.setBfilecontent("image/png");

		int bno = test1.insert1(board);
		LOGGER.info("추가된 행의 bno:" + bno);
		test1.insert1(board);
		
		
		Exam12DaoImpl test2 = new Exam12DaoImpl();
		Exam12Member member = new Exam12Member();
		member.setMid("아이디");
		member.setMname("이름");
		member.setMpassword("비밀번호");
		member.setMtel("전화번호");
		member.setMemail("이메일 주소");
		member.setMage(25);
		member.setMaddress("주소");
		member.setMoriginalfilename("a.png");
		member.setMsavedfilename("a.png");
		member.setMfilecontent("image/png");
		
		String mid = test2.insert2(member);
		LOGGER.info("추가된 행의 mid:" + mid);
		test2.insert2(member);
	}
}
