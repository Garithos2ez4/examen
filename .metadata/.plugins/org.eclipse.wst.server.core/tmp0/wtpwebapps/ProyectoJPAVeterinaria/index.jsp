<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario Din�mico</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .form-container {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: auto;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="email"],
        select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            background-color: #5cb85c;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }
        button:hover {
            background-color: #4cae4c;
        }
        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>

</head>
<body>
    
<div class="form-container">
    <h2>Formulario de Registro</h2>
    <form action="gestionCliente?menu=Cliente&accion=Registrar" method="post" id="registroForm">
        <div class="form-group">
            <label for="nombre">Nombre</label>
            <input type="text" id="nombre" name="nombre" required>
            <span class="error" id="errorNombre"></span>
        </div>
        <div class="form-group">
            <label for="apellido">Apellido</label>
            <input type="text" id="apellido" name="apellido" required>
            <span class="error" id="errorApellido"></span>
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>
            <span class="error" id="errorEmail"></span>
        </div>
        <div class="form-group">
            <label for="sexo">Sexo</label>
            <input type="text" id="sexo" name="sexo" required>
            <span class="error" id="errorSexo"></span>
        </div>
        <div class="form-group">
            <label for="dni">DNI</label>
            <input type="text" id="dni" name="dni" required>
            <span class="error" id="errorDNI"></span>
        </div>
        <div class="form-group">
            <label for="telefono">Tel�fono</label>
            <input type="text" id="telefono" name="telefono" required>
            <span class="error" id="errorTelefono"></span>
        </div>
        <button type="submit">Registrar</button>
        
    </form>
</div>

<script>
    document.getElementById('registroForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Evita el env�o del formulario

    // Limpiar errores
    document.querySelectorAll('.error').forEach(el => el.textContent = '');

    // Obtener valores
    const nombre = document.getElementById('nombre').value;
    const apellido = document.getElementById('apellido').value;
    const email = document.getElementById('email').value;
    const sexo = document.getElementById('sexo').value;
    const dni = document.getElementById('dni').value;
    const telefono = document.getElementById('telefono').value;

    // Validaciones
    let hasError = false;

    if (!nombre) {
        document.getElementById('errorNombre').textContent = 'Nombre es requerido.';
        hasError = true;
    }
    if (!apellido) {
        document.getElementById('errorApellido').textContent = 'Apellido es requerido.';
        hasError = true;
    }
    if (!email) {
        document.getElementById('errorEmail').textContent = 'Email es requerido.';
        hasError = true;
    }
    if (sexo === '') {
        document.getElementById('errorSexo').textContent = 'Selecciona un sexo.';
        hasError = true;
    }
    if (!dni) {
        document.getElementById('errorDNI').textContent = 'DNI es requerido.';
        hasError = true;
    }
    if (!telefono) {
        document.getElementById('errorTelefono').textContent = 'Tel�fono es requerido.';
        hasError = true;
    }

    if (!hasError) {
        // Aqu� puedes enviar los datos al servidor
        console.log({ nombre, apellido, email, sexo, dni, telefono });

        // Limpiar los campos del formulario
        document.getElementById('registroForm').reset();
        
        // Aqu� puedes agregar la l�gica para enviar el formulario
    }
});

</script>


</body>
</html>