package org.example.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage {
    public static final Target RECRUITMENT_TAB = Target.the("Recruitment tab")
            .located(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));
    public static final Target ADD_BUTTON = Target.the("Add button")
            .located(By.cssSelector("button.oxd-button--secondary"));
}