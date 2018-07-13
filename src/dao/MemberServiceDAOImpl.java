package dao;

import java.sql.*;
import java.util.List;

import domain.MemberBean;
import enums.MemberQuery;
import enums.Vendor;
import factory.*;

import pool.DBConstant;
import service.MemberServiceImpl;

public class MemberServiceDAOImpl implements MemberServiceDAO{
	private static MemberServiceDAO instance = new MemberServiceDAOImpl();
	public static MemberServiceDAO getInstance() {return instance;}
	Connection conn;
	Statement stmt;
	private MemberServiceDAOImpl() {}
	@Override
	public void insertMember(MemberBean member) {
		try {
			
			DatabaseFactory.createDatabase(Vendor.ORACLE, DBConstant.USERID, DBConstant.USERPW).getConnection().
			createStatement().executeUpdate(String.format(MemberQuery.INSERT_MEMBAER.toString(),member.getUserid(),
					member.getPassword(),member.getName(),member.getSsn()));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
	public List<MemberBean>  selectAllMember() {
		List<MemberBean> lst=null;
		
		return lst;
	}
	@Override
	public MemberBean login(MemberBean member) {
		MemberBean m = null;
		try {
			
			ResultSet rs =DatabaseFactory.createDatabase(
					Vendor.ORACLE,DBConstant.USERID, DBConstant.USERPW).getConnection().
					createStatement().
					executeQuery(String.format(MemberQuery.LOGIN.toString(),member.getUserid(),member.getPassword()));
			
			while(rs.next()) {
				m=new MemberBean();
				m.setUserid(rs.getString("userid"));
				m.setName(rs.getString("NAME"));
				m.setSsn(rs.getString("SSN"));
				m.setPassword(rs.getString("PASSWORD"));
			}
			if(m.getName()==null) {
				m=new MemberBean();
				m.setSsn("999");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return m;
	}



}
