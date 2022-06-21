<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignIn-JSP-Project</title>
</head>
<body>
<%@include file="./components/header.jsp" %>
<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form method="post" action="#">
					<h3 style="text-align: center;">회원가입 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="사원번호"
						 name="employeeId" maxlength="20" />
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호"
						 name="employeePasswd" maxlength="20" />
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="이름"
						 name="employeeName" maxlength="20" />
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="주소"
						 name="employeeAddr" maxlength="20" />
					</div>
					<div class="form-group">
						<input type="email" class="form-control" placeholder="이메일"
						 name="employeeEmail" maxlength="20" />
					</div>
					<div class="form-group">
						<input type="tel" class="form-control" placeholder="전화번호"
						 name="employeePhone" maxlength="20" />
					</div>
					<div class="form-group">
						<input type="date" class="form-control" placeholder="입사일"
						 name="employeePhone" maxlength="20" />
					</div>
					<input type="submit" class="btn btn-primary form-control" value="회원가입" />
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>
</body>
</html>