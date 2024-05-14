<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Book</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            padding: 50px;
        }
        .container {
            max-width: 600px;
            background-color: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #007bff;
        }
        label {
            font-weight: bold;
        }
        .form-group {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Add New Book</h2>
    <form action="saveBook" method="post">
        <div class="form-group">
            <label for="title">Title:</label>
            <input type="text" class="form-control" id="title" name="title" required>
        </div>
        <div class="form-group">
            <label for="author">Author:</label>
            <input type="text" class="form-control" id="author" name="author" required>
        </div>
        <div class="form-group">
            <label for="publicationYear">Publication Year:</label>
            <input type="number" class="form-control" id="publicationYear" name="publicationYear">
        </div>
        <div class="form-group">
            <label for="language">Language:</label>
            <input type="text" class="form-control" id="language" name="language">
        </div>
        <div class="form-group">
            <label for="coverImage">Cover Image URL:</label>
            <input type="text" class="form-control" id="coverImage" name="coverImage" placeholder="Enter cover image URL">
        </div>

        <div class="form-group">
            <label for="description">Description:</label>
            <textarea class="form-control" id="description" name="description"></textarea>
        </div>


        <div class="form-group">
            <label for="content">Content:</label>
            <textarea class="form-control" id="content" name="content"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Save</button>
    </form>
</div>
</body>
</html>
