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
        <form class="form" action="api/story/userStory" method="get">
            <div class="form-group">
                <label for="killChoice">Who should we kill?</label>
                <input type="text" class="form-control" name="killChoice" id="killChoice"/>
            </div>

            <div class="form-group">
                <label for="marryChoice">Who do you want to marry?</label>
                <input type="text" class="form-control" name="marryChoice" id="marryChoice"/>
            </div>

            <div class="form-group">
                <label for="loveChoice">Who are you going to Love?</label>
                <input type="text" class="form-control" name="loveChoice" id="loveChoice"/>
            </div>

            <input type="submit" class="btn btn-primary" value="Submit"/>
        </form>
    </div>
</body>
</html>
