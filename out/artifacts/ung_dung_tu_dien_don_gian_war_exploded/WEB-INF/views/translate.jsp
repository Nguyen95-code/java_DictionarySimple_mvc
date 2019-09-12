<%--
  Created by IntelliJ IDEA.
  User: Nguyen's PC
  Date: 11/09/2019
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<h1>Simple Dictionary</h1>
<form method="get" action="/translate">
    English: <input type="text" name="engWord"><br/>
    <input type="submit" value="Translate">
</form>
<div>
    English: ${engWord}
    <br/>
    VietNamese: ${vietWord}
</div>
</body>
</html>
