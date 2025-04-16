Feature: Validar bloqueo de cuenta tras múltiples intentos fallidos

  Scenario: Realizar 3 intentos fallidos consecutivos de inicio de sesión
    Given el usuario está en la página de inicio de sesión
    When el usuario intenta iniciar sesión con credenciales incorrectas 3 veces
    Then el sistema registra los intentos fallidos

  Scenario: Intentar iniciar sesión nuevamente después de intentos fallidos
    Given el usuario ha realizado 3 intentos fallidos de inicio de sesión consecutivos
    When el usuario intenta iniciar sesión de nuevo
    Then el sistema bloquea temporalmente la cuenta y muestra un mensaje de bloqueo