<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<head>
    <title>Customer confirmation page</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br>

Free passes: ${customer.freePasses}

<br>

Postal code: ${customer.postalCode}

<br>

Postal code: ${customer.courseCode}

</body>

</html>