<%--
  Created by IntelliJ IDEA.
  User: oushile
  Date: 2019/9/6
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form name="form1" method="post" action="messageAction">
        用户名<input type="text" name="loginName"/><br/>
        密&nbsp;&nbsp;码<input type="password" name="loginPwd"/><br/>
        <input type="submit" value="登录"/>
        <input type="reset" value="取消"/>
    </form>
</body>
</html>
