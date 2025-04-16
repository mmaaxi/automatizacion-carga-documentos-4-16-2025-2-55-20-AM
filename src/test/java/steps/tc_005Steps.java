package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;
import utils.DriverFactory;

public class tc_005Steps {

    tc_005Page page = new tc_005Page(DriverFactory.getDriver());

    @Given("the user is logged in with valid credentials")
    public void theUserIsLoggedInWithValidCredentials() {
        page.loginWithValidCredentials();
        Assert.assertTrue(page.isUserLoggedIn());
    }

    @When("the user clicks on the 'Logout' button")
    public void theUserClicksOnTheLogoutButton() {
        page.clickLogoutButton();
    }

    @Then("the session should be closed and the user should be redirected to the homepage")
    public void theSessionShouldBeClosedAndUserRedirectedToHomepage() {
        Assert.assertTrue(page.isRedirectedToHomePage());
    }

    @When("the user attempts to access a protected URL")
    public void theUserAttemptsToAccessProtectedURL() {
        page.attemptAccessProtectedURL();
    }

    @Then("the user should be redirected to the login page")
    public void theUserShouldBeRedirectedToLoginPage() {
        Assert.assertTrue(page.isRedirectedToLoginPage());
    }
}