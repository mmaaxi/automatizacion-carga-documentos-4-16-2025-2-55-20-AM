package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;
import pages.tc_009Page;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page profilePage;

    public tc_009Steps(WebDriver driver) {
        this.driver = driver;
        profilePage = PageFactory.initElements(driver, tc_009Page.class);
    }

    @Given("que el usuario ha iniciado sesión y navega a la sección de perfil")
    public void navegarSeccionPerfil() {
        profilePage.loginToApplication();
        profilePage.navigateToProfileSection();
    }

    @When("el usuario modifica los datos del perfil")
    public void modificarDatosPerfil() {
        profilePage.updateProfileDetails("Nuevo Nombre", "nuevoemail@example.com");
    }

    @And("hace clic en 'Actualizar perfil'")
    public void clicActualizarPerfil() {
        profilePage.clickUpdateProfileButton();
    }

    @Then("el sistema guarda los cambios y muestra mensaje de éxito")
    public void validarActualizacionExitosa() {
        profilePage.verifyProfileUpdated();
    }
}