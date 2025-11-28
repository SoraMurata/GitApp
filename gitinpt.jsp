<!--importとファイル形式-->
<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.util.*" %>
<%@ page import = "java.text.*" %>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8" />
        <title>姓と名</title>
    </head>

    <body>
        <form action="GitInputServlet" method = "post">
                <p>姓</p>
                <input type="text" name="myoji"/>
                <p>名</p>
                <input type="text" name="namae" />
                <input type="submit" value="送信"/>
        </form>
    </body>
</html>