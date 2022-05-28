<%@page import="it.prova.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Pagina di eliminazione del televisore</title>
	</head>
	<body>
		<h1>Televisore da eliminare:</h1><br>
		
		<% Televisore televisoreDaEliminare = (Televisore)request.getAttribute("televisoreDaInviareAPaginaDelete"); %>
		<p> <%= televisoreDaEliminare.getIdTelevisore() %> </p>
		<p> <%= televisoreDaEliminare.getMarca() %> </p>
		<p> <%= televisoreDaEliminare.getModello() %> </p>
		<p> <%= televisoreDaEliminare.getPrezzo() %> </p>
		<p> <%= televisoreDaEliminare.getNumeroPollici() %> </p>
		<p> <%= televisoreDaEliminare.getCodice() %> </p>
		
		<form action="ExecuteDeleteTelevisoreServlet" method="post">
			<input type = "submit" value = "CANCELLA">
			<input type = "hidden" name = "idDaEliminare" value = "<%= televisoreDaEliminare.getIdTelevisore() %>">
		</form>
	</body>
</html>