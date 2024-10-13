<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registrar Proveedor</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e0ebd8;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background-color: #c9dbc5;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
        }
        input[type="text"], input[type="email"], input[type="date"] {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #333;
            border-radius: 4px;
        }
        input[type="submit"] {
            padding: 10px 20px;
            background-color: #ddd;
            border: 1px solid #333;
            cursor: pointer;
            border-radius: 4px;
            margin-top: 10px;
        }
        h2 {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Registrar Proveedor</h2>
        <form action="SvProveedor" method="post">
            <label for="nomproveecl2">Nombre del Proveedor:</label><br>
            <input type="text" id="nomproveecl2" name="nomproveecl2" required><br>

            <label for="rucproveecl2">RUC:</label><br>
            <input type="text" id="rucproveecl2" name="rucproveecl2" required><br>

            <label for="rsocialproveecl2">Razón Social:</label><br>
            <input type="text" id="rsocialproveecl2" name="rsocialproveecl2" required><br>

            <label for="emailproveecl2">Email:</label><br>
            <input type="email" id="emailproveecl2" name="emailproveecl2" required><br>

            <label for="feingproveecl2">Fecha de Ingreso:</label><br>
            <input type="date" id="feingproveecl2" name="feingproveecl2" ><br>

            <input type="submit" value="Registrar">
        </form>

        <c:if test="${not empty error}">
            <p style="color: red;">${error}</p>
        </c:if>

        <c:if test="${not empty mensaje}">
            <p style="color: green;">${mensaje}</p>
        </c:if>
    </div>
</body>
</html>
