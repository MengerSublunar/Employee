<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>员工信息列表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<style type="text/css">
	table {
		border-collapse: collapse;
	}
	
	caption {
		font-size: 25px;
		margin: 10px;
	}
	
	tr {
		height: 30px;
	}
	
	td {
		text-align: center;
		padding: 5px;
	}
	
	tr:hover {
		background-color: lightblue;
	}
	
	th {
		background-color: lightgray;
	}
	
	a {
		text-decoration: none;
	}
	
	a:hover {
		color: red;
	}
	
	#pageSize {
		width: 20px;
		text-align: center;
	}
</style>
</head>

<body>
	<table border="1" align="center">
		<caption>员工信息列表</caption>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>职位</td>
			<td>电话</td>
			<td>邮箱</td>
		</tr>
		<c:forEach items="${pb.data}" var="emp" varStatus="row">
			<tr>
				<td>${(pb.currentPage-1)* pb.pageSize + row.count}</td>
				<td>${emp.name}</td>
				<td>${emp.gender}</td>
				<td>${emp.age}</td>
				<td>${emp.title}</td>
				<td>${emp.phone}</td>
				<td>${emp.email}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7">
				<c:choose>
    			<c:when test="${pb.currentPage==1}">
    				首页
    				上页
    			</c:when>
    			<c:otherwise>
	    			<a href="emp?currentPage=${pb.firstPage}&pageSize=${pb.pageSize}">首页</a>
	    			<a href="emp?currentPage=${pb.previousPage}&pageSize=${pb.pageSize}">上页</a>
    			</c:otherwise>
    		</c:choose>
    		<c:choose>
    			<c:when test="${pb.currentPage == pb.lastPage}">
    				下页
    				末页
    			</c:when>
    			<c:otherwise>
    				<a href="emp?currentPage=${pb.nextPage}&pageSize=${pb.pageSize}">下页</a>
    				<a href="emp?currentPage=${pb.lastPage}&pageSize=${pb.pageSize}">末页</a>
    			</c:otherwise>
    		</c:choose>
    			
    			第
    			<select id="currentPage" onchange="jump(this.value, ${pb.pageSize})">
    				<c:forEach begin="1" end="${pb.lastPage}" var="page">
    					<option value="${page}"  ${page==pb.currentPage?'selected="selected"':''}>${page}</option>
    				</c:forEach>
    			</select>
    			页/共${pb.lastPage}页
    			共${pb.totalCount}条
    			每页显示<input type="text"  id="pageSize" value="${pb.pageSize}" onchange="jump(1, this.value)"/>条
			</td>
		</tr>

	</table>
</body>
</html>
