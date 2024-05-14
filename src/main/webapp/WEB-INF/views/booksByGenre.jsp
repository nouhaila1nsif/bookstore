<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Books by Genre</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Styles personnalisés pour les cartes de livre */
        .book-card {
            border: 1px solid #ddd;
            padding: 15px;
            margin-bottom: 20px;
            background-color: #f9f9f9;
            border-radius: 5px;
        }
        .book-card img {
            max-width: 100%;
            height: auto;
            margin-bottom: 10px;
            border-radius: 3px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
        }
        .book-card h4 {
            font-size: 18px;
            margin-bottom: 10px;
        }
        .book-card p {
            font-size: 14px;
            color: #666;
        }
    </style>
</head>
<body>
<div class="container">
    <h2 class="mt-4 mb-4">Books by Genre</h2>
    <div class="row">
        <c:forEach items="${books}" var="book">
            <div class="col-md-4">
                <div class="book-card">
                    <img src="${book.coverImage}" alt="Cover Image">
                    <h4>${book.title}</h4>
                    <p><strong>Author:</strong> ${book.author}</p>
                    <p><strong>Description:</strong> ${book.description}</p>
                    <!-- Autres détails du livre -->
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<!-- Bootstrap JS, jQuery, Popper.js (si nécessaire) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
