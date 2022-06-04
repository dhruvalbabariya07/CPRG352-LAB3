<%-- 
    Document   : arithmeticcalculator
    Created on : 2 Jun, 2022, 1:46:53 AM
    Author     : Dhruval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form method="post" action="arithmeticcalcualator">
    <center>
        <h1>Arithmetic Calculator</h1>
        <label>First:</label>
        <input type="text" name="num1" value="">
         <br>
        <label>Second:</label>
        <input type="text" name="num2" value="">
        <br> 
        <input type="submit" value="+" name="ac_calculate">
        <input type="submit" value="-" name="ac_calculate">
        <input type="submit" value="*" name="ac_calculate">
        <input type="submit" value="%" name="ac_calculate">
        <p>
            Result: ${result}
        </p>
        <a href="agecalculator">Age Calculator</a>
        </center>
        </form>
    </body>
</html>
