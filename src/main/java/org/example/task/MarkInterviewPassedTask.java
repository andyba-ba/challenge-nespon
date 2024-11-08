package org.example.task;

import org.example.pages.InterviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MarkInterviewPassedTask implements Task {
    public static MarkInterviewPassedTask now() {
        return instrumented(MarkInterviewPassedTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InterviewPage.MARK_PASSED_BUTTON),
                Click.on(InterviewPage.SAVE_INTERVIEW_BUTTON)
        );
    }
}