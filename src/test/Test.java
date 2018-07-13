package test;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.MemberBean;
import enums.MemberQuery;
import enums.Vendor;
import factory.DatabaseFactory;
import javafx.scene.chart.PieChart.Data;
import pool.DBConstant;

public class Test {
	
	public static void main(String[] args) {
		
		try{
			
			ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE,DBConstant.USERID,DBConstant.USERPW).getConnection().createStatement()
					.executeQuery(MemberQuery.SSN_LIST.toString());
			List<String> list = new ArrayList<>();
			List<String> list2 = new ArrayList<>();
			
			while(rs.next()){
				list.add(rs.getString("mem_age"));
				}
				
			System.out.println(list);
			
			Date d = new Date();
			SimpleDateFormat sdf= new SimpleDateFormat("yyyy");
			System.out.println(sdf.format(d));
			for(int i=0; i<list.size();i++) {
				String a = String.valueOf(Integer.parseInt(sdf.format(d))-Integer.parseInt(list.get(i))+1);
				String b=String.valueOf((int)(Math.random()*12)+1);
				String c = String.valueOf((int)(Math.random()*31)+1);
				if(Integer.parseInt(b)<10) {
					b="0"+b;
				}
				if(Integer.parseInt(c)<10) {
					c="0"+c;
				}
				String ssn = a.substring(2,4);
				
				list2.add(ssn+b+c);
			}
			System.out.println(list2);
			String[] team_id = {"A1","A2","A3","A4","A5","C1","C2","C3","C4","C5","H1","H2","H3","H4","H5","S1","S2","S3","S4","S5"};
			
			for (int i=0; i<20; i++) {
				DatabaseFactory.createDatabase(Vendor.ORACLE,DBConstant.USERID,DBConstant.USERPW).getConnection().createStatement()
						.executeUpdate(String.format(MemberQuery.TEST2.toString(),list.get(i),team_id[i]));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} // a[i+1], list
		
	}

}
	
