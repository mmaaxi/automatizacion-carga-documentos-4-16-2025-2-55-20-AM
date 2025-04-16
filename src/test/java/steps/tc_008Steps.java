package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_008Page;

public class tc_008Steps {

    WebDriver driver;
    tc_008Page searchPage = PageFactory.initElements(driver, tc_008Page.class);

    @Given("el usuario está en la página de búsqueda")
    public void el_usuario_está_en_la_página_de_búsqueda() {
        driver.get("https://www.ejemplo.com");
    }

    @When("el usuario ingresa el término {string} en el campo de búsqueda")
    public void el_usuario_ingresa_el_término_en_el_campo_de_búsqueda(String termino) {
        searchPage.enterSearchTerm(termino);
    }

    @Then("el autocompletado despliega sugerencias relevantes")
    public void el_autocompletado_despliega_sugerencias_relevantes() {
        assert(searchPage.isAutocompleteDisplayed());
    }

    @When("el usuario hace clic en el botón 'Buscar'")
    public void el_usuario_hace_clic_en_el_botón_Buscar() {
        searchPage.clickSearchButton();
    }

    @Then("el sistema muestra resultados relevantes de la búsqueda")
    public void el_sistema_muestra_resultados_relevantes_de_la_búsqueda() {
        assert(searchPage.isSearchResultsDisplayed());
    }
}