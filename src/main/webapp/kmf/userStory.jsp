<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: J-stoff
  Date: 10/28/17
  Time: 3:26 PM


  Simple form to send off data to the server. Right now as simple query strings.
--%>
<html>
    <c:set var="pageTitle" value="Search the database" scope="session" />
    <c:import url="jsp_snippets/header-tag.jsp"/>
<body>
    <div class="container-fluid">
        <div class="jumbotron">
            <h1>Enter some information about a person</h1>
        </div>
    </div>

    <div class="container">
        <form action="" method="get">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" name="firstName" id="firstName"/>
            </div>

            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" name="lastName" id="lastName"/>
            </div>

            <label>Gender:</label>
            <input type="radio" name="gender" id="gender_male" value="male"/>
            <label for="gender_male">Male</label>
            <input type="radio" name="gender" value="female" id="gender_female"/>
            <label for="gender_female">Female</label>
            <br/>

            <input type="submit" value="Submit"/>
        </form>
    </div>
</body>
</html>
