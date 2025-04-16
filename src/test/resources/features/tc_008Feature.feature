Feature: Validar funcionalidad de búsqueda

  Scenario: Término de búsqueda con autocompletado
    Given el usuario está en la página de búsqueda
    When el usuario ingresa el término "Selenium" en el campo de búsqueda
    Then el autocompletado despliega sugerencias relevantes
    When el usuario hace clic en el botón 'Buscar'
    Then el sistema muestra resultados relevantes de la búsqueda