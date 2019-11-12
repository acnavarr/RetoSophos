package com.google.www.stepdefinitions.comprar;

import com.google.www.questions.Verificar;
import com.google.www.tasks.AgregarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComprarProductosStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor andres = Actor.named( "Andres" );

    @Before
    public void configuracionInicial(){
        andres.can( BrowseTheWeb.with( hisBrowser ) );
    }

    @When("^agrega un (.*) de refencia (.*)$")
    public void agregaUnProductoDeRefencia(String producto, String referecia){
        andres.attemptsTo(AgregarProducto.alCarrito(producto,referecia));
    }

    @Then("^Valida carrito de compras$")
    public void validaCarritoDeCompras() {
        andres.should(seeThat(Verificar.elProducto()));

    }
}
