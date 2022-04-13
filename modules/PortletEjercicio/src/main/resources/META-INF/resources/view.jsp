<%@ include file="/init.jsp"%>

<portlet:renderURL var='registro'>
	<portlet:param name='jspPage' value='/registro.jsp' />
</portlet:renderURL>

<portlet:renderURL var='listado'>
	<portlet:param name='jspPage' value='/listado.jsp' />
</portlet:renderURL>
<br>
<br>
<div class="container-fluid bg" id="menu">
	<c:set var="registro1">
		<liferay-ui:message key="ejercicio.viewreg" />
	</c:set>

	<c:set var="listado1">
		<liferay-ui:message key="ejercicio.viewlist" />
	</c:set>

	<div class="row">


		<div class="col-md-1"></div>
		<div class="col-md-1"></div>


		<div class="col-md-3">

			<button type="button" class="btn btn-md btn-outline-dark mb-2 mt-2">
				<a class="nav-link" href='${registro}'>${registro1}</a>
			</button>
		</div>
		<div class="col-md-3">

			<button type="button" class="btn btn-md btn-outline-dark mb-2 mt-2">
				<a class="nav-link" href='${listado}'>${listado1}</a>
			</button>
		</div>

		<div class="col-md-1"></div>
	</div>
</div>