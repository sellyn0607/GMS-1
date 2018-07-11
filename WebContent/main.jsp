
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*" %>
<%!
	
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    %>
    <%
   
    String now = sdf.format(date);
    %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<link rel="stylesheet" href="css/style.css" />
	<title>Document</title>

	
</head>

<body>
	
	<table id="tb" >
		<tr class="he-50">
			<th colspan="2">GMS</th>
		</tr>
		<tr class="height-500px">
			<td><img src="img/mypage/img_girl.jpg" alt="" /></td>
			<td id="wt">
			<ul>
				<li><a href="jsp/login/userLoginForm.jsp">사용자 로그인</a></li>
				<li><a href="jsp/login/admin_login.jsp">관리자로그인</a></li>
				<li><%=now %></li>
			</ul>
		
			</td>
		</tr>
		<tr class="he-50">
			<td colspan="2 ">주소</td>
		</tr>
	</table>
</body>
</html>