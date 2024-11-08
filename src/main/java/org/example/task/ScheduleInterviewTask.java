package org.example.task;

import org.example.pages.InterviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScheduleInterviewTask implements Task {
    private final String interviewTitle;
    private final String interviewerHint;
    private final String interviewDate;

    public ScheduleInterviewTask(String interviewTitle, String interviewerHint, String interviewDate) {
        this.interviewTitle = interviewTitle;
        this.interviewerHint = interviewerHint;
        this.interviewDate = interviewDate;
    }

    public static ScheduleInterviewTask withDetails(String interviewTitle, String interviewerHint, String interviewDate) {
        return instrumented(ScheduleInterviewTask.class, interviewTitle, interviewerHint, interviewDate);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InterviewPage.SCHEDULE_INTERVIEW_BUTTON),
                Enter.theValue(interviewTitle).into(InterviewPage.INTERVIEW_TITLE),
                Enter.theValue(interviewerHint).into(InterviewPage.INTERVIEWER_FIELD),
                Click.on(InterviewPage.FIRST_INTERVIEWER)
        );

        // Entra la fecha actual en el formato "MM/dd/yyyy"
        String todayDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        actor.attemptsTo(Enter.theValue(todayDate).into(InterviewPage.DATE_PICKER));

        actor.attemptsTo(Click.on(InterviewPage.SAVE_INTERVIEW_BUTTON));
    }
}