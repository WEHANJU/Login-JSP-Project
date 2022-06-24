<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login-JSP-Project</title>
</head>
<body>
<%@include file="./components/header.jsp" %>
<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form method="post" action="../login">
					<h3 style="text-align: center;">로그인 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디"
						 name="employeeId" maxlength="20" />
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호"
						 name="employeePasswd" maxlength="20" />
					</div>
					<input type="submit" class="btn btn-primary form-control" value="로그인" />
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>
</body>  
</html>