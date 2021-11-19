<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>MongoDb Servlet</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
        <h1 align="center" >Ricerca automobili</h1>
        <br>
            <form method="post" action="ricercaMarca">
                    <input type="text" placeholder="Inserisci la marca" name="marca">
                <button type="submit">Ricerca marca</button>
            </form>
  		<br>
            <form method="post" action="ricercaModello">
                    <input type="text" placeholder="Inserisci il modello" name="modello">
                <button type="submit">Ricerca modello</button>
            </form>
  		<br>
            <form method="post" action="ricercaColore">
                    <input type="text" placeholder="Inserisci il colore" name="colore">
                <button type="submit">Ricerca colore</button>
            </form>
  		<br>

        <h4 id="errMsg" class="text-danger" align="center">${error_message}</h4>
    
</body>
</html>