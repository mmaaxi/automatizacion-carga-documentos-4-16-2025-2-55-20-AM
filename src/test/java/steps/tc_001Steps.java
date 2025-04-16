package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page loginPage;

    @Given("que el usuario está en la página de inicio de sesión")
    public void que_el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ejemplo.com/login");
        loginPage = new tc_001Page(driver);
    }

    @When("el usuario ingresa {string} en el campo nombre de usuario")
    public void el_usuario_ingresa_en_el_campo_nombre_de_usuario(String username) {
        loginPage.enterUsername(username);
    }

    @And("el usuario ingresa {string} en el campo contraseña")
    public void el_usuario_ingresa_en_el_campo_contrasena(String password) {
        loginPage.enterPassword(password);
    }

    @And("el usuario hace clic en el botón {string}")
    public void el_usuario_hace_clic_en_el_boton_iniciar_sesion(String button) {
        loginPage.clickLoginButton();
    }

    @Then("el usuario debería ser redirigido a la página principal")
    public void el_usuario_deberia_ser_redirigido_a_la_pagina_principal() {
        loginPage.verifyHomePage();
        driver.quit();
    }
}