<%--
  Created by IntelliJ IDEA.
  User: tya
  Date: 2025/9/15
  Time: 下午5:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
   <form action="/upload" method="POST" enctype="multipart/form-data">
     <input type="file" name="file">
     <input type="submit" value="提交">
   </form>
  </body>
</html>
