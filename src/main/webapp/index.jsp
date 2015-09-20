<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.container{
		margin: 20px auto;
		width: 400px;
		height:400px;
		padding-left: 10px;
		padding-right: 10px;
		padding-bottom: 10px;
		background-color: #ccffff;
	}
	a{
		text-decoration: none;
	}
	a:HOVER {
		background-color: green;
		color: white;
	}
</style>
</head>
<body>
	<div class="container">
	<h2 align="center">首页</h2>
	<hr/>
	<h4>组员：</h4>
	<p>林免冲（负责第一个模块）</p>
	<p>廖声民（负责第二个模块）</p>
	<p>何振扬（负责第三个模块）</p>
	<br/><a href="select_cust.jsp" target="_self">客户管理</a><br/>
	<hr/>
	<br/><a href="om_price.jsp" target="_self">价格管理</a><br/><br/>
	<a href="http://localhost:8080/omSSH/PriceConfig_pcShow" target="_self">Excel表配置与管理</a><br/>
	<hr/>
	<br/><a href="normalDiscount_findAll.jsp" target="_self">折扣管理</a><br/><br/>
	</div>
</body>
</html>