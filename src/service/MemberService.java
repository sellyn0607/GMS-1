package service;

import java.util.List;

import domain.*;

public interface MemberService {
	public void createMember(MemberBean member);
	public MemberBean findById(MemberBean member);
	public List<MemberBean> findBySearch(String member);
	public String update(MemberBean member);
	public String delete(MemberBean member);
	public List<MemberBean> selectAllMember();
	public List<MemberBean> list();
	public MemberBean login(MemberBean member);
	
}
