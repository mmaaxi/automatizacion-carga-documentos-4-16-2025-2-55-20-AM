Feature: Validar inicio de sesión con credenciales correctas

  Scenario: El usuario inicia sesión exitosamente en la página principal 
    Given que el usuario está en la página de inicio de sesión
    When el usuario ingresa "usuario_registrado" en el campo nombre de usuario
    And el usuario ingresa "contrasena_correcta" en el campo contraseña
    And el usuario hace clic en el botón "Iniciar sesión"
    Then el usuario debería ser redirigido a la página principal