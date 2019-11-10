package com.google.www.tasks;


import com.google.www.userinterfaces.HomeTottusPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirNavegador implements Task {

    HomeTottusPage homeTottusPge;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Open.browserOn(homeTottusPge) );
    }

    public static AbrirNavegador sitioWebTOTTUS() {
        return Tasks.instrumented( AbrirNavegador.class );
    }
}
