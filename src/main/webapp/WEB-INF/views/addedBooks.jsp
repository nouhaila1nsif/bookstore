<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Added Books</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Définition des variables de couleur */
        :root {
            --primary-color: #007bff;
            --secondary-color: #0056b3;
            --bg-color: #f8f9fa;
            --card-bg-color: #f9f9f9;
            --card-border-color: #ddd;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: var(--bg-color);
            padding: 50px;
        }

        .container {
            max-width: 1000px;
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: var(--primary-color);
        }

        .book-card {
            max-width: 100%;
            margin-bottom: 40px;
            padding: 20px;
            border: 1px solid var(--card-border-color);
            border-radius: 8px;
            background-color: var(--card-bg-color);
        }

        .book-card img {
            width: 100%;
            border-radius: 8px;
            margin-bottom: 10px;
        }

        .btn-group-action {
            display: flex;
            justify-content: space-between;
            margin-top: 15px;
        }

        .btn-action {
            flex-grow: 1;
            margin-right: 10px;
        }

        /* Styles spécifiques au bouton de suppression */
        .btn-danger .fas {
            font-size: 16px;
            margin-right: 5px;
        }

        /* Styles des boutons personnalisés */
        .btn-custom {
            color: #fff;
            background-color: var(--primary-color);
            border: 1px solid var(--primary-color);
            border-radius: 5px;
            padding: 8px 16px;
            margin-right: 10px;
        }

        .btn-custom:hover {
            background-color: var(--secondary-color);
            border-color: var(--secondary-color);
        }

    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="/images/book_logo.png" alt="Logo" style="height: 30px;">
            Bookstore
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="payement">Payment</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="browse">Browse</a>
                </li>
            </ul>
            <div class="dropdown ml-2">
                <button class="btn btn-secondary dropdown-toggle" type="button" id="genreDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Genres
                </button>
                <div class="dropdown-menu" aria-labelledby="genreDropdown">
                    <a class="dropdown-item" href="booksByGenre">Fantasy</a>
                    <a class="dropdown-item" href="#">Science Fiction</a>
                    <a class="dropdown-item" href="#">Mystery</a>
                    <a class="dropdown-item" href="#">Romance</a>
                    <a class="dropdown-item" href="#">Thriller</a>
                </div>
            </div>
        </div>
    </div>
</nav>
<div class="container">
    <div class="row">
        <c:forEach items="${addedBooks}" var="book">
            <div class="col-md-4">
                <div class="book-card">
                    <img src="${book.coverImage}" alt="Cover Image">
                    <h4>${book.title}</h4>
                    <p><strong>Author:</strong> ${book.author}</p>
                    <p><strong>Description:</strong> <c:out value="${book.description}" /></p>
                    <!-- Boutons d'action -->
                    <div class="btn-group-action">
                        <a href="edit?id=${book.id}" class="btn btn-warning ">
                            <i class="fas fa-edit"></i> Modifier
                        </a>
                        <a href="showBookDetails?id=${book.id}" class="btn btn-primary">
                            Voir Détails
                        </a>
                        <a href="delete?id=${book.id}" class="btn btn-danger" onclick="return confirmDelete();">
                            <i class="fas fa-trash-alt"></i> Supprimer
                        </a>

                        <script>
                            function confirmDelete() {
                                return confirm("Êtes-vous sûr de vouloir supprimer ce livre ?");
                            }
                        </script>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
