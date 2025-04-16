Feature: Validar validación de campos obligatorios en formulario

  Scenario: Verificar mensaje de error al dejar campo obligatorio vacío
    Given El usuario navega al formulario con campos obligatorios
    When El usuario deja un campo obligatorio vacío y envía el formulario
    Then El sistema muestra un mensaje de error indicando que el campo es obligatorio