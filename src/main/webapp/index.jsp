<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: liuzhengyang
  Date: 2/10/16
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> images = (List<String>) request.getAttribute("images");
    for (String imgPath : images) {
        %> <img src="/images/<%=imgPath%>"/>
    <%}

%>
</body>
</html>
