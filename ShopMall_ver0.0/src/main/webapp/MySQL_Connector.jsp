<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String jdbcURL="jdbc:mysql://localhost:3306/world";
		String dbId ="root";
		String dbPwd="datacentric";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(jdbcURL, dbId, dbPwd);
			out.println("MySQL 연결 성공");
		}catch(Exception e){
			out.println("연결 오류 : "+e.getMessage());
		}
	%>

</body>
</html>