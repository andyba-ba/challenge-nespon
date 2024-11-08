package org.example.steps;

import org.example.task.*;
import org.example.questions.CandidateStatusQuestion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static org.hamcrest.Matchers.is;

public class RecruitmentSteps {
    private final Actor user = Actor.named("User");

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("the user logs in with username {string} and password {string}")
    public void userLogsIn(String username, String password) {
        user.attemptsTo(LoginTask.withCredentials(username, password));
    }

    @When("the user navigates to Recruitment and clicks on Add")
    public void navigateToRecruitmentAndAdd() {
        user.attemptsTo(NavigateToRecruitmentPage.now(), ClickOnAddButton.now());
    }

    @When("the user fills in candidate details:")
    public void userFillsInCandidateDetails(Map<String, String> candidateData) {
        user.attemptsTo(AddCandidateTask.withDetails(
                candidateData.get("firstName"),
                candidateData.get("lastName"),
                candidateData.get("email")
        ));
    }

    @When("the user selects a random vacancy")
    public void userSelectsRandomVacancy() {
        user.attemptsTo(SelectRandomVacancy.now());
    }

    @When("the user clicks on Save")
    public void userClicksOnSave() {
        user.attemptsTo(ClickOnSaveButton.now());
    }

    @When("the user shortlists the candidate")
    public void userShortlistsCandidate() {
        user.attemptsTo(ShortlistCandidateTask.now());
    }

    @When("the user schedules an interview with:")
    public void userSchedulesInterview(Map<String, String> interviewData) {
        user.attemptsTo(ScheduleInterviewTask.withDetails(
                interviewData.get("interviewTitle"),
                interviewData.get("interviewerHint"),
                interviewData.get("interviewDate")
        ));
    }

    @When("the user marks the interview as passed")
    public void userMarksInterviewAsPassed() {
        user.attemptsTo(MarkInterviewPassedTask.now());
    }

    @When("the user offers the job")
    public void userOffersJob() {
        user.attemptsTo(OfferJobTask.now());
    }

    @When("the user hires the candidate")
    public void userHiresCandidate() {
        user.attemptsTo(HireCandidateTask.now());
    }

    @Then("the candidate with name {string} should have status {string}")
    public void verifyCandidateStatus(String candidateName, String expectedStatus) {
        user.should(GivenWhenThen.seeThat(
                "Candidate status is displayed as " + expectedStatus,
                CandidateStatusQuestion.forCandidate(candidateName, expectedStatus),
                is(true)
        ));
    }
}