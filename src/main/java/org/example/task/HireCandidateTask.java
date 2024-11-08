package org.example.task;

import org.example.pages.JobOfferPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HireCandidateTask implements Task {
    public static HireCandidateTask now() {
        return instrumented(HireCandidateTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JobOfferPage.HIRE_BUTTON),
                Click.on(JobOfferPage.SAVE_OFFER_BUTTON)
        );
    }
}