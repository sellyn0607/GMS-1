package dao;

import java.util.ArrayList;
import java.util.List;

import domain.*;


public class ExamServiceDAOImpl implements ExamServiceDAO{
	private static ExamServiceDAO instance = new ExamServiceDAOImpl();
	public static ExamServiceDAO getInstance() {return instance;}
	private ExamServiceDAOImpl() {}
	@Override
	public void insertExam(ExamBean exam) {
		
		
	}
	@Override
	public ExamBean findById(ExamBean exam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateExam(ExamBean exam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteExam(ExamBean exam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ExamBean> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void score(MemberBean exam) {
		// TODO Auto-generated method stub
		
	}


	
	

}
