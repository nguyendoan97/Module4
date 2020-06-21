<%--
  Created by IntelliJ IDEA.
  User: NguyenDoan
  Date: 6/21/2020
  Time: 9:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form method="post" action="/result">
        <fieldset style="width: 300px">
            <legend><h3>Simple Calculator</h3></legend>
            <table>
                <tr>
                    <td>
                        First Number :
                    </td>
                    <td>
                        <input type="number" name="first"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Last Number :
                    </td>
                    <td>
                        <input type="number" name="last"/>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <select name="calculation" id="calculation">
                            <option value="+">+Add</option>
                            <option value="-">-Minus</option>
                            <option value="*">*Multi</option>
                            <option value="/">/Devide</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Submit"/>
                    </td>
                </tr>
            </table>
        </fieldset>

    </form>
</div>
<div>
    <span><b style="font-size: 20px">Result</b> : <strong>${result}</strong></span>
</div>
</body>
</html>
