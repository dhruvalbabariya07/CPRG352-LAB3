<%-- 
    Document   : agecalculator
    Created on : 2 Jun, 2022, 1:45:39 AM
    Author     : Dhruval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="post" action="agecalculator">
    <center>
        <h1>Age Calculator</h1>
        <label>Enter your age:</label>
        <input type="text" name="current_age" value="">
        <br>
        <input type="Submit" value="Age next Birthday">
        <br>
        <p> ${message}</p>
        <a href="arithmeticcalcualator">Arithmetic Calculator</a>

    </center>
     </form>
    </body>
</html>
