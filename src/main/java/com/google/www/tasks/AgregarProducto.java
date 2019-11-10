package com.google.www.tasks;


import static com.google.www.userinterfaces.HomeTottusPage.*;

import com.google.www.interactions.Seleccionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarProducto implements Task {

    private String producto;
    private String referencia;


    public AgregarProducto(String producto, String referencia){
        this.producto = producto;
        this.referencia = referencia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_BUSCAR),
                Enter.theValue(producto).into(LBL_BUSCAR),
                Click.on(BTN_BUSCAR)

        );
        actor.attemptsTo( Seleccionar.producto(referencia)
        );

    }

    public static AgregarProducto alCarrito(String producto, String referencia) {
        return Tasks.instrumented( AgregarProducto.class, producto, referencia );
    }
}
