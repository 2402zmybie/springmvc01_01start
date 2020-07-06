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

    <h2>提交封装成javaBean,javaBean中带list或者map</h2>
    <form action="param/saveAccountOfListOrMap" method="post">
        姓名: <input type="text" name="username"><br/>
        密码: <input type="text" name="password"><br/>
        金额: <input type="text" name="money"><br/>
        <h3>list集合数据</h3>
        用户的姓名: <input type="text" name="list[0].uname"><br/>
        用户的年龄: <input type="text" name="list[0].uage"><br/>
        <h3>map集合数据</h3>
        用户的姓名: <input type="text" name="map['one'].uname"><br/>
        用户的年龄: <input type="text" name="map['one'].uage"><br/>
        <input type="submit" value="提交">
    </form>

</body>
</html>
