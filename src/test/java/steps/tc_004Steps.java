package steps;

import pages.tc_004Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_004Steps {
    tc_004Page page = new tc_004Page();

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        page.navigateToLoginPage();
    }

    @When("el usuario intenta iniciar sesión con credenciales incorrectas {int} veces")
    public void el_usuario_intenta_iniciar_sesion_con_credenciales_incorrectas_veces(int intentos){
        for(int i = 0; i < intentos; i++) {
            page.enterIncorrectCredentials();
            page.clickLoginButton();
        }
    }

    @Then("el sistema registra los intentos fallidos")
    public void el_sistema_registra_los_intentos_fallidos() {
        page.verifyFailedAttemptsRecorded();
    }

    @Given("el usuario ha realizado 3 intentos fallidos de inicio de sesión consecutivos")
    public void el_usuario_ha_realizado_3_intentos_fallidos_de_inicio_de_sesion_consecutivos() {
        page.ensureThreeFailedAttempts();
    }

    @When("el usuario intenta iniciar sesión de nuevo")
    public void el_usuario_intenta_iniciar_sesion_de_nuevo() {
        page.attemptLoginAgain();
    }

    @Then("el sistema bloquea temporalmente la cuenta y muestra un mensaje de bloqueo")
    public void el_sistema_bloquea_temporalmente_la_cuenta_y_muestra_un_mensaje_de_bloqueo() {
        page.verifyAccountTemporarilyBlocked();
    }
}