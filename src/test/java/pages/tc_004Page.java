package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("login");
    By failedAttemptsMessage = By.id("failedAttemptsMessage");
    By accountBlockedMessage = By.id("accountBlockedMessage");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void enterIncorrectCredentials() {
        driver.findElement(usernameField).sendKeys("incorrectUser");
        driver.findElement(passwordField).sendKeys("incorrectPassword");
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void verifyFailedAttemptsRecorded() {
        // Code to verify that the failed attempts are recorded
        assert driver.findElement(failedAttemptsMessage).isDisplayed();
    }

    public void ensureThreeFailedAttempts() {
        // Assume this ensures the context of 3 consecutive failed attempts is set
    }

    public void attemptLoginAgain() {
        clickLoginButton();
    }

    public void verifyAccountTemporarilyBlocked() {
        assert driver.findElement(accountBlockedMessage).isDisplayed();
    }
}