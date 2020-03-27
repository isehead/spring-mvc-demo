<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<head>
    <title>Student registration form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName" />
    <br><br>

    Last name: <form:input path="lastName" />
    <br><br>

    Country: 
    <form:select path="country">
        <form:options items="${theCountryOptions}" />
    </form:select>
    <br><br>

    Java <form:radiobutton path="favoriteLanguage" value="Java" />
    Python <form:radiobutton path="favoriteLanguage" value="Python" />
    C# <form:radiobutton path="favoriteLanguage" value="C#" />
    Haskell <form:radiobutton path="favoriteLanguage" value="Haskell" />
    <br><br>

    Operating systems experience:
    Windows<form:checkbox path="knownOS" value="Windows" />
    Linux<form:checkbox path="knownOS" value="Linux" />
    macOS<form:checkbox path="knownOS" value="macOS" />
    Android<form:checkbox path="knownOS" value="Android" />
    <br><br>

    <input type="submit" value="Submit" />
</form:form>


</body>

</html>