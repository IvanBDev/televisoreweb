<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Nuovo Televisore</title>
	</head>
	<body>
		<form action="ExecuteInsertTelevisoreServlet" method="post">
			<label for = "marcaInputId">MARCA:</label><br>
			<input type = "text" name = "marcaInput" id = "marcaInputId">
			<br>
			<label for = "modelloInputId">MODELLO:</label><br>
			<input type = "text" name = "modelloInput" id="modelloInputId">
			<br>
			<label for = "prezzoInputId">PREZZO:</label><br>
			<input type = "number" name = "prezzoInput" id = "prezzoInputId">
			<br>
			<label for = "numeroPolliciInputId">NUMERO POLLICI:</label><br>
			<input type = "number" name = "numeroPolliciInput" id = "numeroPolliciInputId">
			<br>
			<label for = "codiceInputId">CODICE:</label><br>
			<input type = "text" name = "codiceInput" id = "codiceInputId">
			<br><br>
			<input type="submit" value="INSERISCI">
		</form>	
	</body>
</html>