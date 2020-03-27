<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<head>
    <title>Customer registration form</title>

    <style>
        .error {color:red}
    </style>
</head>

<body>

<i>Fill out the form, "*" means required.</i>

<br><br>

<form:form action="/processForm" modelAttribute="customer">
    First name: <form:input path="firstName"/>
    Last name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <input type="submit" value="Submit"/>
</form:form>


</body>

</html>