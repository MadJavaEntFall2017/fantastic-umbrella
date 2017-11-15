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

    <nav id="header" class="navbar navbar-inverse">
        <div id="header-container" class="container navbar-container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a id="brand" class="navbar-brand" href="/kmf">KMF</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
            </div><!-- /.nav-collapse -->
        </div><!-- /.container -->
    </nav><!-- /.navbar -->

    <div class="container">
        <form class="form" method="get">
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
