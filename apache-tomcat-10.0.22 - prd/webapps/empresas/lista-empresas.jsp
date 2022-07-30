<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.List, br.com.cursojavaweb.empresas.servlet.Empresa" %>
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Lista de empresas:</h3>
	<ul>
	
		<c:forEach items="${empresas }" var="empresa">
			<li>
				${empresa.id} : ${empresa.nome}, ${empresa.cnpj}, ${empresa.data}
				<a href="/empresas/excluirEmpresa?id=${empresa.id}">excluir</a>
				<a href="/empresas/mostrarEmpresa?id=${empresa.id}">editar</a>
			</li>
		</c:forEach>
	
	</ul>
</body>
</html>