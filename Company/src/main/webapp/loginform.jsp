<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link rel="stylesheet" href="/Company/node_modules/bootstrap/dist/css/bootstrap.css">
  		<script src="/Company/node_modules/jquery/dist/jquery.js"></script>
  		<script src="/Company/node_modules/bootstrap/dist/js/bootstrap.js"></script>
  		<link rel="stylesheet" href="/Company/css/login.css">
		<title>Firma Prijava</title>
	</head>
	<body>
		<div class="container" style="margin-top: 10%;">
			<div class="row">
				<div class="loginform col-sm-4 col-sm-offset-4">
					<h2 class="text-primary text-center">Login</h2>
					<form name='f' action='/Company/loginform' method='POST'>
						<c:if test="${param.logout != null}">
							<p class="text-info">You have successfully logged out</p>
						</c:if>
						<input name='username' type="text" class="form-control" placeholder="Username" required autofocus>
                		<input name='password' type="password" class="form-control" placeholder="Password" required>
                		<c:if test="${param.error != null}">
							<p class="text-danger">Unknown user name or non matching password</p>
						</c:if>
						<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                	</form>
				</div>
			</div>
		</div>
	</body>
</html>