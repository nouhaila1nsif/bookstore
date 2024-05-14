<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center; /* Center horizontally */
            align-items: center;
            height: 100vh;
            background-color: #f8f9fa;
        }
        .container {
            text-align: center;
        }
        h1 {
            color: #333;
            margin-bottom: 20px;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            margin-right: 10px;
        }
        .btn:last-child {
            margin-right: 0;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Welcome to Our Bookstore</h1>
    <a href="/signin" class="btn">Sign In</a>
    <a href="/signup" class="btn">Sign Up</a>
    <a href="/books/added" class="btn">Browse</a>
    <a href="/books/create" class="btn">Add New Book</a> <!-- Ajouter ce lien -->



</div>

</body>
</html>
