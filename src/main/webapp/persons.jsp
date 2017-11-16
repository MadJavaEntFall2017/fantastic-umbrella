<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: brookeswanson
  Date: 11/15/17
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:set var="pageTitle" value="See everyone in the database" scope="session" />
<c:import url="jsp_snippets/header-tag.jsp" />
<body>
<c:import url="jsp_snippets/navbar.jsp" />
<div class="container">
    <table class="table-hover table">
        <tr><th>Id</th><th>Name</th><th>Gender</th><th>Description</th><th>Image</th></tr>
        <c:forEach var="person" items="${people}">
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.gender}</td>
                <td>${person.description}</td>
                <td><img src="${person.getImageUrl()}" alt="${Person.name} image"></td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
