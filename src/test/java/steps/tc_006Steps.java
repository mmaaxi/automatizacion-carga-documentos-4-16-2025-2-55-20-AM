package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_006Page;

public class tc_006Steps {
    private WebDriver driver;
    private tc_006Page registrationPage;

    public tc_006Steps() {
        // Assume driver is initialized elsewhere
        this.registrationPage = PageFactory.initElements(driver, tc_006Page.class);
    }

    @Given("Navego a la página de registro")
    public void navigateToRegistrationPage() {
        registrationPage.openRegistrationPage();
        Assert.assertTrue(registrationPage.isRegistrationFormDisplayed());
    }

    @When("Ingreso datos obligatorios de registro")
    public void enterMandatoryRegistrationData() {
        registrationPage.enterRegistrationDetails("user@example.com", "password", "firstName", "lastName");
        Assert.assertTrue(registrationPage.areDetailsAccepted());
    }

    @When("Hago clic en 'Registrarse'")
    public void clickRegisterButton() {
        registrationPage.clickRegister();
    }

    @Then("Se crea la nueva cuenta y se confirma vía mensaje")
    public void verifyAccountCreation() {
        Assert.assertTrue(registrationPage.isRegistrationSuccessMessageDisplayed());
    }
}