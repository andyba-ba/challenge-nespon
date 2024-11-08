package org.example.task;

import org.example.pages.JobOfferPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OfferJobTask implements Task {
    public static OfferJobTask now() {
        return instrumented(OfferJobTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JobOfferPage.OFFER_JOB_BUTTON),
                Click.on(JobOfferPage.SAVE_OFFER_BUTTON)
        );
    }
}