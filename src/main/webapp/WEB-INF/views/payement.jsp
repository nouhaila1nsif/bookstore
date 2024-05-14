<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des Paiements</title>

    <!-- Liens vers Bootstrap (CSS) -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

    <!-- Styles personnalisés -->
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
        }

        h1 {
            color: #007bff; /* Bleu Bootstrap */
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #007bff; /* Bleu Bootstrap */
            color: white;
        }

        td {
            border: 1px solid #ddd;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Liste des Paiements</h1>

    <table class="table table-bordered">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Payment Method</th>
            <th>Amount</th>
            <th>Timestamp</th>
        </tr>
        </thead>
        <tbody>
        <!-- Utilisation de la balise c:forEach pour itérer sur la liste des paiements -->
        <c:forEach var="payment" items="${payement}">
            <tr>
                <td><c:out value="${payment.id}" /></td>
                <td><c:out value="${payment.paymentMethod}" /></td>
                <td><c:out value="${payment.amount}" /></td>
                <td><c:out value="${payment.timestamp}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!-- Liens vers Bootstrap (JS) et jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
</body>
</html>
