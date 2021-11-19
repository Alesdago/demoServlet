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
	<h1>Lista automobili della ricerca effettuata</h1>
	<ul>
		<c:forEach var="elementoLista" items="${lista}">
			<li>${elementoLista}</li>	
		</c:forEach>  
	</ul>
	<h3 style="color: red;">${message}</h3>
	<br>
	<a href='index.jsp'><button>Torna alla ricerca</button></a> 
</body>
</html>