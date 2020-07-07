<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/7
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--springmvc常用注解--%>
    <a href="anno/testRequestParam?username=laohe">RequestParam</a>

    <br/>
    <br/>
    <br/>

    <form method="post" action="anno/testRequestBody">
        姓名:<input name="username" type="text">
        年龄:<input name="age" type="text">
        <input type="submit" value="提交RequestBody">
    </form>


</body>
</html>
