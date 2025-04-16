package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page loginPage;

    public tc_002Steps() {
        driver = Hooks.getDriver();
        loginPage = PageFactory.initElements(driver, tc_002Page.class);
    }

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        driver.get("http://tusitio.com/login");
    }

    @When("ingresa nombre de usuario {string} y contraseña {string}")
    public void ingresa_nombre_de_usuario_y_contraseña(String username, String password) {
        loginPage.ingresarUsername(username);
        loginPage.ingresarPassword(password);
    }

    @When("hace clic en el botón 'Iniciar sesión'")
    public void hace_clic_en_el_botón_iniciar_sesión() {
        loginPage.clickLoginButton();
    }

    @Then("se muestra un mensaje de error 'Credenciales incorrectas'")
    public void se_muestra_un_mensaje_de_error_credenciales_incorrectas() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }
}