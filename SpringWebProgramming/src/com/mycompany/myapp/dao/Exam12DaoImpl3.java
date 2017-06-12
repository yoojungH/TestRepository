package com.mycompany.myapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.dto.Exam12Board;
import com.mycompany.myapp.dto.Exam12Member;

@Component
public class Exam12DaoImpl3 implements Exam12Dao {
	private static final Logger LOGGER = LoggerFactory.getLogger(Exam12DaoImpl3.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	///////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public int boardInsert(Exam12Board board) {
		sqlSessionTemplate.insert("board.insert", board);
		return board.getBno();	
	}

	@Override
	public List<Exam12Board> boardSelectAll() {
		List<Exam12Board> list = sqlSessionTemplate.selectList("board.selectAll");
		return list;
	}

	@Override
	public List<Exam12Board> boardSelectPage(int pageNo, int rowsPerPage) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startNum", (pageNo-1) * rowsPerPage + 1);
		map.put("endNum", pageNo * rowsPerPage);
		List<Exam12Board> list = sqlSessionTemplate.selectList("board.selectByPage", map);
		return list;
	}

	@Override
	public int boardCountAll() {
		int count = sqlSessionTemplate.selectOne("board.countAll");
		return count;
	}

	@Override
	public Exam12Board boardSelectByBno(int bno) {	
		Exam12Board board = sqlSessionTemplate.selectOne("board.selectByBno", bno);
		return board;
	}

	@Override
	public void boardUpdateBhitcount(int bno, int bhitcount) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bhitcount", bhitcount);
		map.put("bno", bno);
		sqlSessionTemplate.update("board.updateBhitcount", map);
	}

	@Override
	public void boardUpdate(Exam12Board board) {
		sqlSessionTemplate.update("board.update",board);
	}

	@Override
	public void boardDelete(int bno) {
		sqlSessionTemplate.delete("board.delete",bno);
	}

	/*--------------------------Member------------------------------*/
	@Override
	public String memberInsert(Exam12Member member) {
		// 매개 변수화된 SQL 작성
		String sql = "insert into member ";
		sql += "(mid, mname, mpassword, mdate, mtel, memail, mage, maddress, moriginalfilename, msavedfilename, mfilecontent) ";
		sql += "values ";
		sql += "(?, ?, ?, sysdate, ?, ?, ?, ?, ?, ?, ?) ";

		jdbcTemplate.update(sql, member.getMid(), member.getMname(), member.getMpassword(), member.getMtel(),
				member.getMemail(), member.getMage(), member.getMaddress(), member.getMoriginalfilename(),
				member.getMsavedfilename(), member.getMfilecontent());
		return member.getMid();
	}

	@Override
	public List<Exam12Member> memberSelectAll() {
		// 매개 변수화된 SQL 작성
		String sql = "select mid, mname, mpassword, mdate, mtel, memail, mage, maddress ";
		sql += "from member ";
		sql += "order by bno asc ";

		RowMapper<Exam12Member> rowMapper = new RowMapper<Exam12Member>() {
			@Override
			public Exam12Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Exam12Member member = new Exam12Member();
				member.setMid(rs.getString("mid"));
				member.setMname(rs.getString("mname"));
				member.setMpassword(rs.getString("mpassword"));
				member.setMdate(rs.getDate("mdate"));
				member.setMtel(rs.getString("mtel"));
				member.setMemail(rs.getString("memail"));
				member.setMage(rs.getInt("mage"));
				member.setMaddress(rs.getString("maddress"));
				return member;
			}
		};

		List<Exam12Member> list = jdbcTemplate.query(sql, rowMapper);
		return list;
	}

	@Override
	public List<Exam12Member> memberSelectPage(int pageNo, int rowsPerPage) {
		/* SQL문 작성 */
		String sql = "select * ";
		sql += "from( ";
		sql += "  select rownum as r, mid, mname, mpassword, mdate, mtel, memail, mage, maddress ";
		sql += "  from( ";
		sql += "    select mid, mname, mpassword, mdate, mtel, memail, mage, maddress from member order by mid asc ";
		sql += "  ) ";
		sql += "  where rownum<=? ";
		sql += "  ) ";
		sql += "where r>=? ";

		Object[] args = { (pageNo * rowsPerPage), ((pageNo - 1) * rowsPerPage + 1) };

		RowMapper<Exam12Member> rowMapper = new RowMapper<Exam12Member>() {
			@Override
			public Exam12Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Exam12Member member = new Exam12Member();
				member.setMid(rs.getString("mid"));
				member.setMname(rs.getString("mname"));
				member.setMpassword(rs.getString("mpassword"));
				member.setMdate(rs.getDate("mdate"));
				member.setMtel(rs.getString("mtel"));
				member.setMemail(rs.getString("memail"));
				member.setMage(rs.getInt("mage"));
				member.setMaddress(rs.getString("maddress"));
				return member;
			}
		};

		List<Exam12Member> list = jdbcTemplate.query(sql, args, rowMapper);

		return list;
	}

	@Override
	public int memberCountAll() {
		/* SQL문 작성 */
		String sql = "select count(*) from member ";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public Exam12Member memberSelectByMid(String mid) {
		/* SQL문 작성 */
		String sql = "select * from member where mid=? ";

		RowMapper<Exam12Member> rowMapper = new RowMapper<Exam12Member>() {
			@Override
			public Exam12Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Exam12Member member = new Exam12Member();
				member.setMid(rs.getString("mid"));
				member.setMname(rs.getString("mname"));
				member.setMpassword(rs.getString("mpassword"));
				member.setMdate(rs.getDate("mdate"));
				member.setMtel(rs.getString("mtel"));
				member.setMemail(rs.getString("memail"));
				member.setMage(rs.getInt("mage"));
				member.setMaddress(rs.getString("maddress"));
				member.setMoriginalfilename(rs.getString("moriginalfilename"));
				member.setMsavedfilename(rs.getString("msavedfilename"));
				member.setMfilecontent(rs.getString("mfilecontent"));

				return member;
			}
		};
		Exam12Member member = jdbcTemplate.queryForObject(sql, rowMapper, mid);
		return member;
	}

	@Override
	public void memberUpdateMhitcount(String mid, int mhitcount) {
		/* SQL문 작성 */
		String sql = "update member set mhitcount=? where mid=? ";
		jdbcTemplate.update(sql, mhitcount, mid);
	}

	@Override
	public void memberUpdate(Exam12Member member) {
		/* SQL문 작성 */
		String sql;
		if (member.getMoriginalfilename() != null) {
			sql = "update member set mname=?, mtel=?, mpassword=?, mdate=sysdate, memail=?, maddress=?, "
					+ "moriginalfilename=?, msavedfilename=?, mfilecontent=? where mid=? ";
			jdbcTemplate.update(sql, member.getMname(), member.getMtel(), member.getMpassword(), member.getMemail(), member.getMaddress(),
					member.getMoriginalfilename(), member.getMsavedfilename(),	member.getMfilecontent(), member.getMid());
		
		} else {
			sql = "update member set mname=?, mtel=?, mpassword=?, mdate=sysdate where mid=? ";
			jdbcTemplate.update(sql, member.getMname(), member.getMtel(), member.getMpassword(), member.getMdate(),member.getMid());
		}

	}

	public void memberDelete(String mid) {
		/* SQL문 작성 */
		String sql = "delete from member where mid=? ";
		jdbcTemplate.update(sql, mid);
	}

	/////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {

		/*---------------ㅡBoard----------------*/
		/* DB에 Board 객체 100개 생성 */
		// Exam12DaoImpl test1 = new Exam12DaoImpl();
		// for (int i = 1; i <= 100; i++) {
		// Exam12Board board = new Exam12Board();
		// board.setBtitle("제목" + i);
		// board.setBcontent("내용" + i);
		// board.setBwriter("홍길동");
		// board.setBpassword("12345");
		// board.setBoriginalfilename("a.png");
		// board.setBsavedfilename("a.png");
		// board.setBfilecontent("image/png");
		//
		// int bno = test1.boardInsert(board);
		// LOGGER.info("추가된 행의 bno:" + bno);
		// }

		// Exam12DaoImpl test = new Exam12DaoImpl();
		// List<Exam12Board> list = test.boardSelectPage(2, 10);
		// for (Exam12Board board : list) {
		// LOGGER.info(board.getBtitle());
		// }

		/*---------------ㅡMember----------------*/
		/* DB에 Member 객체 100개 생성 */
//		 Exam12DaoImpl test2 = new Exam12DaoImpl();
//		 for (int i = 1; i <= 100; i++) {
//		 Exam12Member member = new Exam12Member();
//		 member.setMid("lily" + i);
//		 member.setMname("유정");
//		 member.setMpassword("0000");
//		 member.setMtel("010-1234-5678");
//		 member.setMemail("hello@world.com");
//		 member.setMage(25);
//		 member.setMaddress("한국");
//		 member.setMoriginalfilename("a.png");
//		 member.setMsavedfilename("a.png");
//		 member.setMfilecontent("image/png");
//		
//		 String mid = test2.memberInsert(member);
//		 LOGGER.info("추가된 행의 mid:" + mid);
//		 }

		Exam12DaoImpl test2 = new Exam12DaoImpl();
		List<Exam12Member> list = test2.memberSelectPage(2, 5);
		for (Exam12Member member : list) {
			LOGGER.info(member.getMid());
		}
	}

}
