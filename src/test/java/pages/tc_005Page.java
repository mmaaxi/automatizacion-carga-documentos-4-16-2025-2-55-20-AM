package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;

    By logoutButton = By.id("logoutButton");
    By homePageIdentifier = By.id("homePageElement");
    By loginPageIdentifier = By.id("loginPageElement");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithValidCredentials() {
        // Code for logging in with valid credentials
    }

    public boolean isUserLoggedIn() {
        // Code to verify the user is logged in
        return true;
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public boolean isRedirectedToHomePage() {
        return driver.findElement(homePageIdentifier).isDisplayed();
    }

    public void attemptAccessProtectedURL() {
        driver.navigate().to("protectedURL");
    }

    public boolean isRedirectedToLoginPage() {
        return driver.findElement(loginPageIdentifier).isDisplayed();
    }
}