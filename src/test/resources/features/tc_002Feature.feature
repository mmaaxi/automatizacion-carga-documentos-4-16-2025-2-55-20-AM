Feature: Validar inicio de sesión con credenciales incorrectas

  Scenario: Intentar iniciar sesión con nombre de usuario y contraseña incorrectos
    Given el usuario está en la página de inicio de sesión
    When ingresa nombre de usuario "usuario_incorrecto" y contraseña "contrasena_incorrecta"
    And hace clic en el botón 'Iniciar sesión'
    Then se muestra un mensaje de error 'Credenciales incorrectas'