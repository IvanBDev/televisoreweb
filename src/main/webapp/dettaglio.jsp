<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Risultato del dettaglio</h1>
		<% Televisore risultatoDettaglio = (Televisore)request.getAttribute("televisoreDaInviareAPaginaDettalio"); %>
		<p> <%= risultatoDettaglio.getIdTelevisore() %> </p>
		<p> <%= risultatoDettaglio.getMarca() %> </p>
		<p> <%= risultatoDettaglio.getModello() %> </p>
		<p> <%= risultatoDettaglio.getPrezzo() %> </p>
		<p> <%= risultatoDettaglio.getNumeroPollici() %> </p>
		<p> <%= risultatoDettaglio.getCodice() %> </p>	
		
		<a href="searchForm.jsp">Home</a>
	</body>
</html>