<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
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
            width: 80%; /* Set width to 80% of the viewport */
            max-width: 600px; /* Maximum width */
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }
        .profile-info {
            text-align: center;
            margin-bottom: 20px;
        }
        .profile-info h1 {
            margin-bottom: 10px;
            color: #333;
        }
        .profile-info p {
            color: #666;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .form-group input {
            width: 100%;
            padding: 15px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            margin-bottom: 10px;
        }
        .form-group input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }
        .skip-link {
            text-align: center;
            margin-top: 20px;
        }
        .skip-link a {
            color: #007bff;
            text-decoration: none;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="profile-info">
        <h1>Registration</h1>
        <p>Welcome! Please fill out the form to sign up.</p>
    </div>

    <!-- Sign Up Section -->
    <form action="/signup" method="post">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" placeholder="Enter your username">
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email address">
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password">
        </div>
        <div class="form-group">
            <label for="confirmPassword">Confirm Password:</label>
            <input type="password" id="confirmPassword" name="confirmPassword" placeholder="Confirm your password">
        </div>
        <div class="form-group">
            <label for="dateOfBirth">Date of Birth:</label>
            <input type="date" id="dateOfBirth" name="dateOfBirth">
        </div>
        <div class="form-group">
            <input type="submit" value="Sign Up">
        </div>
    </form>

    <!-- Sign In Section -->
    <div class="profile-info">
        <h1>Sign In</h1>
        <p>Already have an account? Sign in below.</p>
    </div>
    <form action="/signin" method="post">
        <div class="form-group">
            <label for="signInUsername">Username:</label>
            <input type="text" id="signInUsername" name="signInUsername" placeholder="Enter your username">
        </div>
        <div class="form-group">
            <label for="signInPassword">Password:</label>
            <input type="password" id="signInPassword" name="signInPassword" placeholder="Enter your password">
        </div>
        <div class="form-group">
            <input type="submit" value="Sign In">
        </div>
    </form>

    <!-- Skip Link -->
    <div class="skip-link">
        <p>Don't have an account yet? <a href="#">Sign up here</a></p>
    </div>
</div>

</body>
</html>
