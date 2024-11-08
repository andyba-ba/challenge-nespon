package org.example.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CandidateFormPage {
    public static final Target FIRST_NAME = Target.the("First name field")
            .located(By.cssSelector("input[name='firstName']"));
    public static final Target LAST_NAME = Target.the("Last name field")
            .located(By.cssSelector("input[name='lastName']"));
    public static final Target VACANCY_DROPDOWN = Target.the("Vacancy dropdown")
            .located(By.cssSelector("div.oxd-select-text"));
    public static final Target RANDOM_VACANCY = Target.the("First option in vacancy dropdown")
            .located(By.cssSelector("div.oxd-select-dropdown > div:nth-child(1)"));
    public static final Target EMAIL = Target.the("Email field")
            .located(By.cssSelector("input[type='email']"));
    public static final Target SAVE_BUTTON = Target.the("Save button")
            .located(By.cssSelector("button[type='submit']"));
}
