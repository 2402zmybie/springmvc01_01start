<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/6
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--请求参数绑定--%>
    <a href="param/testParam?username=老何">请求参数绑定</a>
    <br>
    <br>

    <h2>提交封装成javaBean</h2>
    <form action="param/saveAccount" method="post">
        姓名: <input type="text" name="username"><br/>
        密码: <input type="text" name="password"><br/>
        金额: <input type="text" name="money"><br/>
        用户的姓名: <input type="text" name="user.uname"><br/>
        用户的年龄: <input type="text" name="user.uage"><br/>
        <input type="submit" value="提交">
    </form>
    <br>
    <br>

    <h2>自定义类型转换器</h2>
    <form action="param/saveUser" method="post">
        用户姓名: <input type="text" name="uname"><br/>
        用户年龄: <input type="text" name="uage"><br/>
        用户生日: <input type="text" name="date"><br/>
        <input type="submit" value="提交">
    </form>


</body>
</html>
