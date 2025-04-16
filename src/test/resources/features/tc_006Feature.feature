Feature: Registro de nuevo usuario

  Scenario: Validar proceso de registro de nuevo usuario
    Given Navego a la página de registro
    When Ingreso datos obligatorios de registro
    And Hago clic en 'Registrarse'
    Then Se crea la nueva cuenta y se confirma vía mensaje