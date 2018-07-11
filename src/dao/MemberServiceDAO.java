package dao;

import java.util.List;

import domain.*;

public interface MemberServiceDAO {
	public void insertMember(MemberBean member);
	public MemberBean findById(MemberBean member);
	public String updateMember(MemberBean member);
	public String deleteMember(MemberBean member);
	public List<MemberBean> list();
	public MemberBean login(MemberBean member);
	
}
