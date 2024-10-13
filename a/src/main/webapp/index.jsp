<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ingresar al Sistema</title>
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
        .login-box {
            background-color: #c9dbc5;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
        }
        input[type="text"], input[type="password"] {
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
    </style>
</head>
<body>
    <div class="login-box">
        <h2>Ingresar al Sistema</h2>
          <form action="SvUsuario" method="post">
            <label for="usuario">usuario</label><br>
            <input type="text" id="usuario" name="usuario" required><br>

            <label for="password">password</label><br>
            <input type="password" id="password" name="password" required><br>

            <input type="submit" value="Registrar">
        </form>
    </div>
</body>
</html>
