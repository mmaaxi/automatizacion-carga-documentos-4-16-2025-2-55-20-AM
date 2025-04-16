Feature: Validar actualización de perfil de usuario

  Scenario: Usuario actualiza su perfil exitosamente
    Given que el usuario ha iniciado sesión y navega a la sección de perfil
    When el usuario modifica los datos del perfil
    And hace clic en 'Actualizar perfil'
    Then el sistema guarda los cambios y muestra mensaje de éxito