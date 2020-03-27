<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<head>
    <title>Student confirmation page</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favorite language: ${student.favoriteLanguage}

<br><br>

Known OS:

<ul>
    <c:forEach var="temp" items="${student.knownOS}">
    <li>${temp}</li>
    </c:forEach>
</ul>

</body>

</html>