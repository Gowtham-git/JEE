<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

@font-face {
font-family: 'Averia Serif Libre', cursive;
url:'https://fonts.googleapis.com/css2?family=Averia+Serif+Libre:wght@300&display=swap';
}
body{
background-image:radial-gradient(circle,rgba(0,0,10,0.8),rgba(0,0,10,0.9));
display:grid;
place-items:center;
min-height:100vh;
color:#FFEBA0;
font-size:1.5rem;
}

</style>
</head>
<body>
<%
session.getAttribute("answer");
%>
 hi ,you are ${answer} person.
</body>
</html>