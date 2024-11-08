package org.example.questions;

import org.example.pages.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import org.example.pages.*;

public class CandidateStatusQuestion implements Question<Boolean> {
    private final String candidateName;
    private final String expectedStatus;

    public CandidateStatusQuestion(String candidateName, String expectedStatus) {
        this.candidateName = candidateName;
        this.expectedStatus = expectedStatus;
    }

    public static CandidateStatusQuestion forCandidate(String candidateName, String status) {
        return new CandidateStatusQuestion(candidateName, status);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Target CANDIDATE_STATUS_FIELD = Target.the("Status field for candidate " + candidateName)
                .locatedBy("//table//td[contains(text(), '{0}')]/following-sibling::td[contains(text(), '{1}')]")
                .of(candidateName, expectedStatus);

        return CANDIDATE_STATUS_FIELD.resolveFor(actor).isVisible();
    }
}