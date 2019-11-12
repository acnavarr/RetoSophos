package com.google.www.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.List;
import static com.google.www.userinterfaces.HomeTottusPage.LIST_CARRITO;

public class Verificar implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> listaProductos =  LIST_CARRITO.resolveAllFor( actor );
        return (listaProductos.size()>0);
    }

    public static Verificar elProducto() {
        return new Verificar();
    }
}
