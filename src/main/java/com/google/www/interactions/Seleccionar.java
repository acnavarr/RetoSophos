package com.google.www.interactions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

import static com.google.www.userinterfaces.HomeTottusPage.*;

public class Seleccionar implements Interaction {

    private String referencia;

    public Seleccionar(String referencia){
        this.referencia = referencia;
    }

    public static Seleccionar producto(String referencia) {
        return Tasks.instrumented( Seleccionar.class, referencia );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaProductos =  LIST_PRODUCTOS.resolveAllFor( actor );
        List<WebElementFacade> listaBotonAgregar = BTN_AGREGAR.resolveAllFor( actor );

        for (int i=1; i<listaProductos.size(); i++){

            String nombre = listaProductos.get( i ).getText();

            if (nombre.contains( referencia )){
                listaBotonAgregar.get( i-1 ).click();
                actor.remember( "referencia", referencia);
                break;
            }
        }
    }
}
