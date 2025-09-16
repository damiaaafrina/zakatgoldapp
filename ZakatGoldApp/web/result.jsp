<%@ page import="com.zakatapp.GoldDetails" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Zakat Result</title>
    <style>
        body {
            background-color: #e8f5e9;
            font-family: Arial;
            color: #1b5e20;
        }
        .container {
            width: 60%;
            margin: auto;
            border: 2px solid #1b5e20;
            border-radius: 10px;
            background-color: #f1f8e9;
            padding: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Zakat Calculation Summary</h2>
    <%
        GoldDetails gold = (GoldDetails) session.getAttribute("goldDetails");
        double totalValue = (double) session.getAttribute("totalValue");
        double zakatValue = (double) session.getAttribute("zakatValue");
        double zakat = (double) session.getAttribute("zakat");
    %>
    <p><strong>Gold Info:</strong> <%= gold.toString() %></p>
    <p><strong>Total Gold Value:</strong> RM<%= totalValue %></p>
    <p><strong>Zakat Payable Gold Value:</strong> RM<%= zakatValue %></p>
    <p><strong>Total Zakat Amount (2.5%):</strong> RM<%= zakat %></p>

    <form action="ZakatTracking" method="post">
        <input type="submit" value="Track Session Data">
    </form>
</div>
</body>
</html>
