<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/Company/">Firma</a>
		</div>
		<ul class="nav navbar-nav">
			<c:choose>
				<c:when test="${param.viewName eq 'purchaseInvoices'}">
					<li class="active"><a href="#">Ulazne fakture</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="#">Ulazne fakture</a></li>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${param.viewName eq 'salesInvoices'}">
					<li class="active"><a href="#">Izlazne fakture</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="#">Izlazne fakture</a></li>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${param.viewName eq 'newInvoice'}">
					<li class="active"><a href="/Company/NewInvoice">Nova faktura</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="/Company/NewInvoice">Nova faktura</a></li>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${param.viewName eq 'accountStatement'}">
					<li class="active"><a href="#">Preuzmi izvod</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="#">Preuzmi izvod</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#"><span class="glyphicon glyphicon-user"></span> Signed As:  <c:out value="${currentUser.username}"></c:out></a></li>
			<li><a href="/Company/logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
		</ul>
	</div>
</nav>
