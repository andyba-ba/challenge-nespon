package org.example.task;

import org.example.pages.CandidateFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddCandidateTask implements Task {
    private final String firstName;
    private final String lastName;
    private final String email;

    public AddCandidateTask(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static AddCandidateTask withDetails(String firstName, String lastName, String email) {
        return new AddCandidateTask(firstName, lastName, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(CandidateFormPage.FIRST_NAME),
                Enter.theValue(lastName).into(CandidateFormPage.LAST_NAME),
                Enter.theValue(email).into(CandidateFormPage.EMAIL),
                Click.on(CandidateFormPage.VACANCY_DROPDOWN),
                Click.on(CandidateFormPage.RANDOM_VACANCY),
                Click.on(CandidateFormPage.SAVE_BUTTON)
        );
    }
}