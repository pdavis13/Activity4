<%-- 
    Document   : response
    Created on : Sep 7, 2017, 3:12:10 AM
    Author     : Peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greeting Response</title>
    </head>
    <body>
        <h1>Greeting Response</h1>
        <%
            Object msgObj = request.getAttribute("greetMsg");
            String msg = "Undefined";
            if(msgObj != null){
                msg = msgObj.toString();
            }
            out.println("<p>" + msg + "</p>");
        %>
    </body>
</html>
