package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.MenuService;
import com.crowdar.examples.services.ProfileService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FichapSteps extends PageSteps {
    @Given("la aplicación es cargada correctamente")
    public void laAplicaciónFuncionaCorrectamenteYSoyUsuario() {
        LoginService.isViewLoaded();
    }

    @When("ingreso nombre de usuario (.*) y contraseña (.*)")
    public void ingresoNombreDeUsuarioUserNameYContraseñaPassword(String userEmail, String password) {
        LoginService.doLogin(userEmail, password);
    }

    @And("tomo foto del usuario")
    public void tomoFotoDelUsuario() {
        LoginService.shotPhoto();
    }

    @Then("la aplicación redirige a la pantalla de ingreso a cuenta de la aplicación")
    public void laAplicaciónRedirigeALaPantallaDeIngresoACuentaDeLaAplicación() {
        HomeService.isViewLoaded();
    }
//----------------------------------------------------------------------------------------------------------------------
    @Given("que el usuario se encuentra en la home view de la aplicación")
    public void queElUsuarioSeEncuentraEnLaHomeViewDeLaAplicación() {
        LoginService.isViewLoaded();
        LoginService.doLogin("andres_themaster@hotmail.com", "fichapAndres88");
        LoginService.shotPhoto();
        HomeService.isViewLoaded();
    }

    @When("presiona el menú hamburguesa y posteriormente la opcion Perfil")
    public void presionaElMenúHamburguesaYPosteriormenteLaOpcionPerfil() {
        MenuService.clickMenu();
        MenuService.clickProfileOption();
    }

    @And("ingresa el nuevo correo (.*) y ingresa el nuevo domicilio (.*)")
    public void ingresaElNuevoCorreoEmailYIngresaElNuevoDomicilioAddress(String email, String address) {
        ProfileService.addEmailAndAddress(email, address);
    }

    @And("presiona el botón Guardar")
    public void presionaElBotónGuardar() {
        ProfileService.clickAgregarButton();
    }

    @And("presiona Ok del Aviso")
    public void presionaOkDelAviso() {
        ProfileService.clickOkAviso();
    }

    @Then("la aplicación guarda el nuevo email (.*) y el nuevo domicilio (.*)")
    public void laAplicaciónGuardaElNuevoEmailEmailYElNuevoDomicilioAddress(String email, String address) {
        ProfileService.verifyChanges(email, address);
    }
}
