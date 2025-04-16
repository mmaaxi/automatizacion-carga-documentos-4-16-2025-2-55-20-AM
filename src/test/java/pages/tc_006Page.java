package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    private WebDriver driver;

    private By registrationForm = By.id("registrationForm");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By registerButton = By.id("registerButton");
    private By successMessage = By.id("successMessage");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openRegistrationPage() {
        driver.get("https://example.com/register");
    }

    public boolean isRegistrationFormDisplayed() {
        return driver.findElement(registrationForm).isDisplayed();
    }

    public void enterRegistrationDetails(String email, String password, String firstName, String lastName) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public boolean areDetailsAccepted() {
        return true; // Replace with actual validation logic
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public boolean isRegistrationSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}