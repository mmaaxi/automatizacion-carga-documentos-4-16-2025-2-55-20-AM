package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_008Page {

    WebDriver driver;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(name = "q")  // ejemplo locator
    WebElement searchInputField;

    @FindBy(id = "autocomplete")  // ejemplo locator
    WebElement autocompleteBox;

    @FindBy(name = "btnK")  // ejemplo locator
    WebElement searchButton;

    public void enterSearchTerm(String term) {
        searchInputField.sendKeys(term);
    }

    public boolean isAutocompleteDisplayed() {
        return autocompleteBox.isDisplayed();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public boolean isSearchResultsDisplayed() {
        // Implementar verificación de resultados de búsqueda
        // Retornar true si los resultados son mostrados
        return true; // Pseudocódigo para simplificar
    }
}