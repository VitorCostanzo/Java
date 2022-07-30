<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<c:url value="/cadastrando" var="linkServletNovaEmpresa"/> <!-- define a url a partir do root do projeto e guarda numa variavel-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar nova empresa</title>
</head>
<body>
	
	<form action="${linkServletNovaEmpresa}" method="post"> <!-- Para onde os parametros serÃ£o enviados -->
	<!-- chama a variavel com o caminha, definida no começo do documento -->
	
	Nome: <input type="text" name="nome" /> <br><br>
	CNPJ: <input type="text" name="cnpj" /> <br><br>
	Data: <input type="date" name="data" /> <br><br>

	<input type="submit" value="Cadastrar" />
</form>

</body>
</html>