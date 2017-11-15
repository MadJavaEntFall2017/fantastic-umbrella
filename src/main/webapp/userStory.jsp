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

    <c:import url="jsp_snippets/navbar.jsp"/>

    <div class="container">
        <form class="form" action="api/person" method="get">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" name="firstName" id="firstName"/>
            </div>

            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" name="lastName" id="lastName"/>
            </div>

            <div class="form-group">
                <label class="radio-inline">
                    <input type="radio" name="gender" id="gender_male" value="male"/>
                    Male
                </label>

                <label class="radio-inline">
                    <input type="radio" name="gender" id="gender_female" value="female"/>
                    Female
                </label>
            </div>

            <input type="submit" class="btn btn-primary" value="Submit"/>
        </form>
    </div>
</body>
</html>
