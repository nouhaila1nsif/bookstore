<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="com.example.book.entities.Book" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Book</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Edit Book</h2>
    <form action="/books/update" method="post">
        <input type="hidden" name="id" value="${book.id}">
        <div class="form-group">
            <label for="title">Title:</label>
            <input type="text" class="form-control" id="title" name="title" value="${book.title}" required>
        </div>
        <div class="form-group">
            <label for="author">Author:</label>
            <input type="text" class="form-control" id="author" name="author" value="${book.author}" required>
        </div>
        <div class="form-group">
            <label for="publicationYear">Publication Year:</label>
            <input type="number" class="form-control" id="publicationYear" name="publicationYear" value="${book.publicationYear}">
        </div>
        <div class="form-group">
            <label for="language">Language:</label>
            <input type="text" class="form-control" id="language" name="language" value="${book.language}">
        </div>
        <div class="form-group">
            <label for="coverImage">Cover Image URL:</label>
            <input type="text" class="form-control" id="coverImage" name="coverImage" value="${book.coverImage}">
        </div>
        <div class="form-group">
            <label for="description">Description:</label>
            <textarea class="form-control" id="description" name="description" rows="4">${book.description}</textarea>
        </div>
        <div class="form-group">
            <label for="content">Content:</label>
            <textarea class="form-control" id="content" name="content" rows="6">${book.content}</textarea>
        </div>
        <button type="submit" class="btn btn-primary">Save Changes</button>
    </form>

    <!-- Bouton pour retourner à la liste des livres ajoutés -->
    <a href="/books/added" class="btn btn-secondary mt-3">Back to Added Books</a>
</div>
</body>
</html>
