<%--
  Created by IntelliJ IDEA.
  User: jake-python
  Date: 10/28/17
  Time: 3:26 PM


  Simple form to send off data to the server. Right now as simple query strings.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple form to send information</title>
</head>
<body>
    <h1>Enter some information about a person</h1>
<form action="" method="get">
    <label for="firstName">First Name:</label>
    <input type="text" name="firstName" id="firstName"/>
    <br/>

    <label for="lastName">Last Name:</label>
    <input type="text" name="lastName" id="lastName"/>
    <br/>

    <label>Gender:</label>
    <input type="radio" name="gender" id="gender_male" value="male"/>
    <label for="gender_male">Male</label>
    <input type="radio" name="gender" value="female" id="gender_female"/>
    <label for="gender_female">Female</label>
    <br/>

    <input type="submit" value="Submit"/>
</form>

</body>
</html>
