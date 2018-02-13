<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link rel="stylesheet" href="/Company/node_modules/bootstrap/dist/css/bootstrap.css">
  		<script src="/Company/node_modules/jquery/dist/jquery.js"></script>
  		<script src="/Company/node_modules/bootstrap/dist/js/bootstrap.js"></script>
		<title>Firma Pocetna</title>
	</head>
	<body>
		<jsp:include page="/include/navigation.jsp"></jsp:include>
		<div class="container">
			<div class="row">
				<h2>Employees</h2>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Id</th>
							<th>Username</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${employees}" var="employee">
							<tr>
								<td><c:out value="${employee.id}"></c:out></td>
								<td><c:out value="${employee.username}"></c:out></td>
							</tr>
						</c:forEach>		
					</tbody>
				</table>
				<h2>Units of measurement</h2>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${units}" var="unit">
							<tr>
								<td><c:out value="${unit.id}"></c:out></td>
								<td><c:out value="${unit.name}"></c:out></td>
							</tr>
						</c:forEach>		
					</tbody>
				</table>
				<h2>Currencies</h2>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Id</th>
							<th>Designation</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${currencies}" var="currency">
							<tr>
								<td><c:out value="${currency.id}"></c:out></td>
								<td><c:out value="${currency.designation}"></c:out></td>
							</tr>
						</c:forEach>		
					</tbody>
				</table>
				<h2>Companies</h2>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Address</th>
							<th>Pib</th>
							<th>Currency</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${companies}" var="company">
							<tr>
								<td><c:out value="${company.id}"></c:out></td>
								<td><c:out value="${company.name}"></c:out></td>
								<td><c:out value="${company.address}"></c:out></td>
								<td><c:out value="${company.pibNumber}"></c:out></td>
								<td><c:out value="${company.currency.designation}"></c:out></td>
							</tr>
						</c:forEach>		
					</tbody>
				</table>
				<h2>Offering Groups</h2>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Tax</th>
							<th>Discount Percentage</th>
							<th>Discount Amount</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${offeringGroups}" var="offeringGroup">
							<tr>
								<td><c:out value="${offeringGroup.id}"></c:out></td>
								<td><c:out value="${offeringGroup.name}"></c:out></td>
								<td><c:out value="${offeringGroup.tax}"></c:out></td>
								<td><c:out value="${offeringGroup.discountPercentage}"></c:out></td>
								<td><c:out value="${offeringGroup.discountAmmount}"></c:out></td>
							</tr>
						</c:forEach>		
					</tbody>
				</table>
				<h2>Offerings</h2>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Type</th>
							<th>Unit Price</th>
							<th>discountPercentage</th>
							<th>discountAmmount</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${offerings}" var="offering">
							<tr>
								<td><c:out value="${offering.id}"></c:out></td>
								<td><c:out value="${offering.name}"></c:out></td>
								<td><c:out value="${offering.type}"></c:out></td>
								<td><c:out value="${offering.unitPrice}"></c:out></td>
								<td><c:out value="${offering.discountPercentage}"></c:out></td>
								<td><c:out value="${offering.discountAmmount}"></c:out></td>
							</tr>
						</c:forEach>		
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>