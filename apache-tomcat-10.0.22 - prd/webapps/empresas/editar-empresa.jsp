<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<c:url value="/editarEmpresa" var="linkServletEditarEmpresa"/> <!-- define a url a partir do root do projeto e guarda numa variavel-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar empresa</title>
</head>
<body>
	
	<form action="${linkServletEditarEmpresa}" method="post"> <!-- Para onde os parametros serÃ£o enviados -->
	<!-- chama a variavel com o caminha, definida no começo do documento -->
	
	<input type="hidden" name="id" value="${empresa.id}" />
	Nome: <input type="text" name="nome" value="${empresa.nome}"/> <br><br>
	CNPJ: <input type="text" name="cnpj" value="${empresa.cnpj}"/> <br><br>
	Data: <input type="date" name="data" value="${empresa.data}"/> <br><br>
	<input type="submit" value="Salvar" />
</form>

</body>
</html>