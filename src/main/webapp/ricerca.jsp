<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca</title>
</head>
<body>
	<h1 align="center">Lista automobili della ricerca effettuata</h1>
	<br>
	<div align="center">
	  	<ul style="list-style-position:inside">
		<c:forEach var="elementoLista" items="${lista}">
			<li>${elementoLista}</li>	
		</c:forEach>  
		</ul>
	</div>
	<h3 style="color: red;" align="center">${message}</h3>
	<br>
	<div align="center">
		<a href='index.jsp'><button>Torna alla ricerca</button></a> 
	</div>
	
</body>
</html>