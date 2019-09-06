<%--
  Created by IntelliJ IDEA.
  User: oushile
  Date: 2019/9/6
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome,${sessionScope.LOGIN_USER}~
<p align="center">${requestScope.success}</p>
<p align="center">${requestScope.messageAware}</p>

</body>
</html>
