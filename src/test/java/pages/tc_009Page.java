package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;

    By loginField = By.id("login");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By profileSectionLink = By.id("profileSection");
    By nameField = By.id("name");
    By emailField = By.id("email");
    By updateProfileButton = By.id("updateProfile");
    By successMessage = By.id("successMessage");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToApplication() {
        driver.findElement(loginField).sendKeys("usuario");
        driver.findElement(passwordField).sendKeys("contraseña");
        driver.findElement(loginButton).click();
    }

    public void navigateToProfileSection() {
        driver.findElement(profileSectionLink).click();
    }

    public void updateProfileDetails(String newName, String newEmail) {
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(newName);
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(newEmail);
    }

    public void clickUpdateProfileButton() {
        driver.findElement(updateProfileButton).click();
    }

    public void verifyProfileUpdated() {
        String message = driver.findElement(successMessage).getText();
        if (!message.contains("Perfil actualizado exitosamente")) {
            throw new AssertionError("Error: el perfil no fue actualizado correctamente.");
        }
    }
}