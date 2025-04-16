package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_010Page;
import io.cucumber.java.en.*;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page;

    public tc_010Steps(WebDriver driver) {
        this.driver = driver;
        page = new tc_010Page(driver);
    }

    @Given("the user logs in with a test account")
    public void the_user_logs_in_with_a_test_account() {
        page.login("testUser", "testPassword");
    }

    @When("the user navigates to account settings")
    public void the_user_navigates_to_account_settings() {
        page.navigateToAccountSettings();
    }

    @When("the user selects 'Delete Account'")
    public void the_user_selects_delete_account() {
        page.selectDeleteAccount();
    }

    @When("confirms the deletion")
    public void confirms_the_deletion() {
        page.confirmDeletion();
    }

    @Then("the account should be deleted")
    public void the_account_should_be_deleted() {
        assert page.isAccountDeleted();
    }

    @Then("a confirmation message is displayed")
    public void a_confirmation_message_is_displayed() {
        assert page.isConfirmationMessageDisplayed();
    }
}