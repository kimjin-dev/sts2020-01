<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/j\bootstrap.min.js"></script>
	<script type="text/javascript">
	</script>
</head>
<body>
	<div class="container">
		<div class="row" >
			<div class="col-md-12">
				<nav class="navbar navbar-inverse">
				  <div class="container-fluid">
				    <div class="navbar-header">
				      <a class="navbar-brand" href=" ${pageContext.request.contextPath }/index.bit">
				        	<div>비트교육센터</div>
				      </a>
				    </div>
				    	<p  class="navbar-text">
					    	<a href="${pageContext.request.contextPath }/emp/list.bit" class="navbar-link">E M P</a>
					    	<a href="${pageContext.request.contextPath }/dept/list.bit" class="navbar-link">DEPT</a>
					    	<a href="${pageContext.request.contextPath }/login/login.bit" class="navbar-link">LOGIN</a>
				    	</p>
				  </div>
				</nav>
				<!-- end navbar -->
			</div>
		</div>
		<div class="row" >
			<div class="col-md-12" id="content">
				<div class="page-header">
	 				 <h1>LIST PAGE <small>DEPT TABLE</small></h1>
				</div>
				<table class="table">
					<thead>
						<tr>
							<th>deptno</th>
							<th>dname</th>
							<th>loc</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list }" var="bean">
						<tr>
							<td><a href="#">${bean.deptno }</a></td>
							<td><a href="#">${bean.dname }</a></td>
							<td><a href="#">${bean.loc }</a></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row" id="footer">
			<div class="col-md-12">
			<address>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
			Copyright &copy; 비트캠프 All rights reserved.
			</div>
		</div>
	</div>


</body>
</html>
