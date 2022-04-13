<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha"%>
<%@ page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%><%@
taglib
	uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%><%@
taglib
	uri="http://liferay.com/tld/theme" prefix="liferay-theme"%><%@
taglib
	uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<div class="container-fluid">
	<div class="row">
		<div class="col-md-2">
		</div>
		<div class="col-md-8">
		<h1>Formulario Registro</h1>
		</div>
		<div class="col-md-2">
		</div>
	</div>
</div>



<p>
	<portlet:actionURL name="registroPersona" var="registroPersonaURL" />
	<portlet:resourceURL id="captcha" var="captchaResourceURL" />
<div class="container-fluid">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<form method="post" action="${registroPersonaURL}">
				<div class="col-8">
					<label for="nombre" class="form-label">Nombre</label> <input
						name="<portlet:namespace/>nombre" type="text" class="form-control"
						id="nombre">
				</div>
				<div class="col-8">
					<label for="apellido" class="form-label">Apellido</label> <input
						name="<portlet:namespace/>apellido" type="text"
						class="form-control" id="apellido">
				</div>
				<div class="col-8">
					<label for="nacimiento" class="form-label">Fecha de
						Nacimiento</label> <input type="date" class="form-control" id="date"
						name="<portlet:namespace/>nacimiento" required />
				</div>
				<div class="col-8">
					<label for="email" class="form-label">Email</label> <input
						name="<portlet:namespace/>correo" type="email"
						class="form-control" id="email">
				</div>
				<br>
				<div class="col-8">
					<liferay-captcha:captcha url="<%=captchaResourceURL%>" />
				</div>
				<br>
				<div>
					<button type="submit" class="btn btn-primary" name="action"
						value="Enviar">Save</button>
					<a class="btn btn-primary" href='<portlet:renderURL />'>Volver</a>
				</div>
			</form>
		</div>
		<div class="col-md-2"></div>
	</div>
</div>
