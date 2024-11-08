package org.example.task;

import org.example.pages.InterviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ShortlistCandidateTask implements Task {
    public static ShortlistCandidateTask now() {
        return instrumented(ShortlistCandidateTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InterviewPage.SHORTLIST_BUTTON));
    }
}