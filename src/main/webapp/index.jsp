<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Management System</title>
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
</head>
<body>
<header>
    <h1>Welcome to the Library Management System</h1>
    <nav>
        <ul>
            <li><a href="addLocation.jsp">Add Location</a></li>
            <li><a href="register.jsp">Register User</a></li>
            <li><a href="borrowBook.jsp">Borrow Book</a></li>
            <li><a href="viewBooks.jsp">View Books</a></li>
        </ul>
    </nav>
</header>

<main>
    <section>
        <h2>Library Management Features</h2>
        <p>Welcome to the Library Management System. You can manage locations, register new users, borrow books, and more.</p>
    </section>

    <section>
        <h3>Quick Actions</h3>
        <form action="addLocation" method="get">
            <button type="submit">Add a New Location</button>
        </form>

        <form action="register" method="get">
            <button type="submit">Register New User</button>
        </form>

        <form action="viewBooks" method="get">
            <button type="submit">View All Books</button>
        </form>
    </section>
</main>

<footer>
    <p>&copy; 2024 Library Management System. All rights reserved.</p>
</footer>
</body>
</html>
