<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Browse Books</title>
    <!-- Bootstrap CSS CDN -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Styles CSS */
        .navbar-nav .nav-link {
            color: #333;
            margin-right: 10px;
        }
        .navbar-nav .nav-link:hover {
            color: #007bff;
        }
        .form-inline input {
            width: 300px;
        }
        .books-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            margin-top: 20px;
        }
        .book {
            width: 200px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 8px;
            padding: 20px;
            text-align: center;
            background-color: #fff;
        }
        .book img {
            width: 100%;
            border-radius: 8px;
            margin-bottom: 20px;
        }
        .book h2 {
            font-size: 18px;
            margin-bottom: 10px;
        }
        .book p {
            font-size: 14px;
            color: #666;
            margin: 0;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="/images/book_logo.png" alt="Logo" style="height: 30px;">
            Bookstore
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">
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
                    <a class="dropdown-item" href="#">Fantasy</a>
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
    <div class="books-container">
        <!-- Book 1 -->
        <a href="details" class="book">
            <img src="/images/book1.png" alt="Book Cover">
            <h2>The Great Gatsby</h2>
            <p>F. Scott Fitzgerald</p>
        </a>
        <!-- Book 2 -->
        <a href="book2-details.html" class="book">
            <img src="/images/book2.png" alt="Book Cover">
            <h2>To Kill a Mockingbird</h2>
            <p>Harper Lee</p>
        </a>
        <!-- Book 3 -->
        <a href="book3-details.html" class="book">
            <img src="/images/book3.png" alt="Book Cover">
            <h2>1984</h2>
            <p>George Orwell</p>
        </a>
        <!-- Book 4 -->
        <a href="book4-details.html" class="book">
            <img src="/images/book4.png" alt="Book Cover">
            <h2>The Catcher in the Rye</h2>
            <p>J.D. Salinger</p>
        </a>
        <!-- Book 5 -->
        <a href="book5-details.html" class="book">
            <img src="/images/book5.png" alt="Book Cover">
            <h2>Pride and Prejudice</h2>
            <p>Jane Austen</p>
        </a>
        <!-- Add more books as needed -->
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
