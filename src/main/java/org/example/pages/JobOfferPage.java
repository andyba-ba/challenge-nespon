package org.example.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JobOfferPage {
    public static final Target OFFER_JOB_BUTTON = Target.the("Offer Job button")
            .located(By.xpath("//button[contains(text(), 'Offer Job')]"));
    public static final Target SAVE_OFFER_BUTTON = Target.the("Save offer button")
            .located(By.xpath("//button[contains(text(), 'Save')]"));
    public static final Target HIRE_BUTTON = Target.the("Hire button")
            .located(By.xpath("//button[contains(text(), 'Hire')]"));
}
