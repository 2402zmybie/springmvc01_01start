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

    <br/>
    <br/>
    <br/>
    <a href="anno/testPathVariable/1">testPathVariable</a>

    <br>
    <br>
    <br>
    <a href="anno/testRequestHeader">testRequestHeader</a>

    <br>
    <br>
    <br>
    <a href="anno/testCookieValue">testCookieValue</a>


    <br/>
    <br/>
    <br/>

    <form method="post" action="anno/testModelAttribute">
        姓名:<input name="uname" type="text">
        年龄:<input name="uage" type="text">
        <input type="submit" value="testModelAttribute">
    </form>

    <br/>
    <br/>
    <br/>
    <a href="anno/testSessionAttributes">testSessionAttributes</a>
    <a href="anno/getSessionAttributes">取出SessionAttributes中存放的msg的值</a>
    <a href="anno/deleteSessionAttributes">清除session</a>



</body>
</html>
