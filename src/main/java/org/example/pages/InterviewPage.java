package org.example.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterviewPage {
    public static final Target SHORTLIST_BUTTON = Target.the("Shortlist button")
            .located(By.xpath("//button[contains(text(), 'Shortlist')]"));
    public static final Target SCHEDULE_INTERVIEW_BUTTON = Target.the("Schedule Interview button")
            .located(By.xpath("//button[contains(text(), 'Schedule Interview')]"));
    public static final Target INTERVIEW_TITLE = Target.the("Interview title field")
            .located(By.cssSelector("input[name='interviewTitle']"));
    public static final Target INTERVIEWER_FIELD = Target.the("Interviewer field")
            .located(By.cssSelector("input[placeholder='Type for hints...']"));
    public static final Target FIRST_INTERVIEWER = Target.the("First interviewer option")
            .located(By.cssSelector("div.oxd-autocomplete-dropdown > div:nth-child(1)"));
    public static final Target DATE_PICKER = Target.the("Date picker")
            .located(By.cssSelector("input[placeholder='Select Date']"));
    public static final Target SAVE_INTERVIEW_BUTTON = Target.the("Save interview button")
            .located(By.xpath("//button[contains(text(), 'Save')]"));
    public static final Target MARK_PASSED_BUTTON = Target.the("Mark Interview Passed button")
            .located(By.xpath("//button[contains(text(), 'Mark Interview Passed')]"));
}
