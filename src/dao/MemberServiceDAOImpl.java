package dao;

import java.sql.*;
import java.util.List;

import domain.MemberBean;

public class MemberServiceDAOImpl implements MemberServiceDAO{
	private static MemberServiceDAO instance = new MemberServiceDAOImpl();
	public static MemberServiceDAO getInstance() {return instance;}
	private MemberServiceDAOImpl() {}
	@Override
	public void insertMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public MemberBean findById(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateMember(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteMember(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean login(MemberBean member) {
		MemberBean m = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","KJ","2654");
			Statement stmt = conn.createStatement();
			String sql=String.format("SELECT MEM_ID userid, TEAM_ID, NAME, AGE,ROLL"+
					"  ,PASSWORD FROM MEMBER WHERE MEM_ID LIKE '%s' and PASSWORD LIKE '%s'",member.getUserid(),member.getPaaword()); 
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				m=new MemberBean();
				m.setUserid(rs.getString("userid"));
				m.setName(rs.getString("NAME"));
				m.setAge(rs.getString("AGE"));
				m.setPaaword(rs.getString("PASSWORD"));
			}
			if(m==null) {
				m=new MemberBean();
				m.setAge("999");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return m;
	}



}
