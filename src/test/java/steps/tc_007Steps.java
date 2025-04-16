package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page formPage;

    public tc_007Steps() {
        this.driver = Hooks.driver;
        formPage = new tc_007Page(driver);
    }

    @Given("El usuario navega al formulario con campos obligatorios")
    public void navegarAlFormulario() {
        formPage.navigateToForm();
        Assert.assertTrue(formPage.areRequiredFieldsDisplayed());
    }

    @When("El usuario deja un campo obligatorio vacío y envía el formulario")
    public void dejarCampoObligatorioVacio() {
        formPage.leaveRequiredFieldEmptyAndSubmit();
    }

    @Then("El sistema muestra un mensaje de error indicando que el campo es obligatorio")
    public void verificaMensajeDeError() {
        Assert.assertTrue(formPage.isErrorMessageDisplayed());
    }
}