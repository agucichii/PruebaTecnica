<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registros</title>
</head>
<body>


<h1 class="text-center">Listado Registros</h1>




<div class="mx-auto" style="width: 50%">
	<table class="table table-striped">
		<thead>
			<tr>
				<th><strong>Nombre</strong></th>
				<th><strong>Apellido</strong></th>
				<th><strong>Nacimiento</strong></th>
				<th><strong>Correo</strong></th>
			</tr>
			 </thead>
			<c:forEach var='r' items='${registros}'>
				<tr>
					<td>${r.nombre}</td>
					<td>${r.apellido}</td>
					<td>${r.nacimiento}</td>
					<td>${r.correo}</td>					
				</tr>
			</c:forEach>
	</table>
	<br>
	<a class="btn btn-primary" href='<portlet:renderURL />'>Volver</a>
</div>
</div>
</body>
</html>	

