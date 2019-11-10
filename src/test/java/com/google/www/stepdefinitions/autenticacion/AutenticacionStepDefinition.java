package com.google.www.stepdefinitions.autenticacion;

import com.google.www.tasks.AbrirNavegador;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class AutenticacionStepDefinition {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor andres = Actor.named( "Andres" );

    @Before
    public void configuracionInicial(){
        andres.can( BrowseTheWeb.with( hisBrowser ) );
    }




    @Given("^que Andres ingresa a la pagina TOTTUS$")
    public void queUsuarioIngresaALaPaginaTOTTUS() {
        andres.wasAbleTo( AbrirNavegador.sitioWebTOTTUS());
    }





}
