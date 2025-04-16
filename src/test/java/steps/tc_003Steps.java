package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        page.navigateToLoginPage();
    }

    @When("they click on the 'Forgot Password' link")
    public void theyClickOnTheForgotPasswordLink() {
        page.clickForgotPasswordLink();
    }

    @Then("they are redirected to the password recovery page")
    public void theyAreRedirectedToThePasswordRecoveryPage() {
        assertTrue(page.isOnPasswordRecoveryPage());
    }

    @When("the user enters a registered email address")
    public void theUserEntersARegisteredEmailAddress() {
        page.enterEmailAddress("registered@example.com");
    }

    @And("clicks on the 'Submit' button")
    public void clicksOnTheSubmitButton() {
        page.clickSubmitButton();
    }

    @Then("the system shows a confirmation message")
    public void theSystemShowsAConfirmationMessage() {
        assertTrue(page.isConfirmationMessageDisplayed());
    }

    @When("the user checks their email")
    public void theUserChecksTheirEmail() {
        page.checkEmail();
    }

    @Then("they receive a password recovery email")
    public void theyReceiveAPasswordRecoveryEmail() {
        assertTrue(page.isRecoveryEmailReceived());
    }
}