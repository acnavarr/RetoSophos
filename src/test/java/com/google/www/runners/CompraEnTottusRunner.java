package com.google.www.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_en_tottus.feature",
        tags = "@AgregarProducto",
        glue = "com.google.www.stepdefinitions",
        snippets = SnippetType.CAMELCASE)



public class CompraEnTottusRunner {


}
