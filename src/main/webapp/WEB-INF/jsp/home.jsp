<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>Clients</title>
    <!-- Access the bootstrap Css like this,
        Spring boot will handle the resource mapping automcatically -->
    <%--<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />--%>

    <!-- <spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" /> -->
    <link rel="stylesheet" href="/css/main.css">
    <%--<c:url value="/css/main.css" var="jstlCss" />--%>
    <link href="${springCss}" rel="stylesheet" />

</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Spring Boot</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">

    <div class="starter-template">
        <h1>Spring Boot Web JSP Example</h1>
        <h2>Message: ${message}</h2>
    </div>

</div>

<h1>Register</h1>
<form method="POST" action="clients">
    First Name: <input type="text" name="name" /><br/>
    Last Name: <input type="text" name="surname" /><br/>
    Username: <input type="text" name="email" /><br/>
    Password: <input type="password" name="password" /><br/>
    Instagram: <input type="text" name="igLink" /><br/>
    Vk.com: <input type="text" name="vkLink" /><br/>
    <input type="submit" value="Add" />
</form>


<%--<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
<%--<script type="text/javascript" src="http://mybootstrap.ru/wp-content/themes/clear-theme/js/bootstrap-affix.js"></script>--%>

</body>

</html>