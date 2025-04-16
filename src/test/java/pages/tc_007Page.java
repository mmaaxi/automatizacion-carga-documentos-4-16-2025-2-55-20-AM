package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {

    WebDriver driver;

    By requiredFieldIndicator = By.cssSelector(".required-field-indicator");
    By submitButton = By.id("submitForm");
    By errorMessage = By.id("errorMessage");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToForm() {
        driver.get("http://example.com/form");
    }

    public boolean areRequiredFieldsDisplayed() {
        return !driver.findElements(requiredFieldIndicator).isEmpty();
    }

    public void leaveRequiredFieldEmptyAndSubmit() {
        // Assuming there's a input field we need to leave empty
        WebElement submit = driver.findElement(submitButton);
        submit.click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}