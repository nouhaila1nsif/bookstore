<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Details</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            padding: 50px;
        }
        .container {
            max-width: 800px;
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #007bff;
        }
        .book-details {
            margin-top: 20px;
        }
        .book-details img {
            width: 30%;
            height: auto;
            border-radius: 8px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Book Details</h2>
    <div class="book-details">
        <img src="${book.coverImage}" alt="Cover Image">
        <h4>${book.title}</h4>
        <p><strong>Author:</strong> ${book.author}</p>
        <p><strong>Publication Year:</strong> ${book.publicationYear}</p>
        <p><strong>Description:</strong> ${book.description}</p>
        <hr>
        <h3>Content</h3>
        <p>${book.content}</p>
        <!-- Ajoutez d'autres détails du livre selon vos besoins -->
    </div>
    <!-- Bouton pour retourner à la liste des livres ajoutés -->
    <a href="/books/added" class="btn btn-secondary mt-3">Back to Added Books</a>

</div>
</body>
</html>
