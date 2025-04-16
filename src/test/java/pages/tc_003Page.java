package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class tc_003Page {

    private WebDriver driver;

    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By emailField = By.id("email");
    private By submitButton = By.id("submit");
    private By confirmationMessage = By.id("confirmationMessage");

    public tc_003Page() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public boolean isOnPasswordRecoveryPage() {
        return driver.getCurrentUrl().contains("password-recovery");
    }

    public void enterEmailAddress(String email) {
        WebElement emailInput = driver.findElement(emailField);
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }

    public void checkEmail() {
        // Implement email check logic using a mock email interface
    }

    public boolean isRecoveryEmailReceived() {
        // Add logic to verify email receipt using a mock email system
        return true; // Placeholder for actual check
    }
}