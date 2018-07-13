<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import=" domain.* " %>
<%@ page import=" service.* "%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입 결과창</title>
</head>
<%
	MemberBean m = new MemberBean();
	m.setUserid(request.getParameter("userid"));
	m.setPassword(request.getParameter("pw"));
	m.setName(request.getParameter("name"));
	m.setSsn(request.getParameter("ssn1"));
  	MemberServiceImpl.getInstance().createMember(m);
  
 
 %>
 <h2><a href="../login/userLoginForm.jsp">로그인에 성공하셨습니다.</a></h2>
</html>