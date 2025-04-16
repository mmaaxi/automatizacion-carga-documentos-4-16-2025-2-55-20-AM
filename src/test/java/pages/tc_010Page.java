package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    public void navigateToAccountSettings() {
        driver.findElement(By.id("account-settings")).click();
    }

    public void selectDeleteAccount() {
        driver.findElement(By.id("delete-account")).click();
    }

    public void confirmDeletion() {
        driver.findElement(By.id("confirm-delete")).click();
    }

    public boolean isAccountDeleted() {
        // This is a placeholder method; actual implementation may vary
        // For example, checking if the user is logged out or unable to log in again
        return driver.findElements(By.id("login-username")).size() > 0;
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(By.id("confirmation-message")).isDisplayed();
    }
}