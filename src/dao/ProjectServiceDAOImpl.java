package dao;

import java.util.ArrayList;
import java.util.List;


import domain.ProjectBean;

public class ProjectServiceDAOImpl implements ProjectServiceDAO{
	private static ProjectServiceDAO instance = new ProjectServiceDAOImpl();
	public static ProjectServiceDAO getInstance() {return instance;}
	private ProjectServiceDAOImpl() {}
	@Override
	public void insertProject(ProjectBean project) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void score(ProjectBean project) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ProjectBean findById(ProjectBean project) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String updateProject(ProjectBean project) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteProject(ProjectBean project) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProjectBean> list() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	
	

	
}
