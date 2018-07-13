package service;

import java.util.List;

import dao.MemberServiceDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}

	@Override
	public void createMember(MemberBean member) {
		MemberServiceDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public MemberBean findById(MemberBean member) {
		
		return null;
	}

	@Override
	public String update(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MemberBean> findBySearch(String member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean login(MemberBean member) {
		return MemberServiceDAOImpl.getInstance().login(member);
	}
	@Override
	public List<MemberBean> selectAllMember() {
		List<MemberBean> lst = null;
		
		return lst;
	}
	

}
