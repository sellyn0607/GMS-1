<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- userid,password,age,name,roll,teamId; -->

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입</title>
	<style>#user{margin: 150px auto;width:250px;}</style>
</head>
<body>
<div id="user">
	<h2> 회원 가입 </h2>
	<form action="joinResult.jsp" style="border:1px solid black">
	아이디 : <input type="text" name="userid" size="9">  <br>
	비밀번호 : <input type="password" name="pw" size="12"> <br>
	이름 : <input type="text" name="name" maxlength="5" size="8"><br>
	생년 월일 : <input type="text" name="ssn1" maxlength= "7" size="7"> - <input type="text" name="ssn2" maxlength="1" size="1"><br>
	<input type="submit" value="회원가입" >
	
	</form></div>
	
</body>
</html>