package com.qa.pages.insurance;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {
    private static final By CANCEL_BUTTON_LOCATOR = By.xpath("//div[@id='FormPage']//div[@class='FormView__footer-buttonWrapper']//span[@class='ASTappable FormView__footer-button FormView__footer-cancelButton ASTappable--pointer']");
    private static final By PROPOSAL_FORM_BUTTON_LOCATOR = By.xpath("//*[@id=\"bottomNav-Proposal Form\"]");
    private static final By ADD_BUTTON_LOCATOR = By.xpath("//div[@id='Proposal Form']//button[@class='MuiButtonBase-root MuiFab-root circle-button-fab button-position-0 MuiFab-primary']");

    //methods
    public void clickCancelButton() {
        Assert.assertTrue(clickElement(CANCEL_BUTTON_LOCATOR));
    }

    public void clickProposalForm() {
        Assert.assertTrue(clickElement(PROPOSAL_FORM_BUTTON_LOCATOR));
    }

    public void clickAddButton() {
        Assert.assertTrue(clickElement(ADD_BUTTON_LOCATOR));
    }

    public void isInwardNumberDisplayed(String str1) {
        Assert.assertTrue(isVisible(By.xpath("//div[@class='TextTypeDisplay BaseTypeDisplay BaseTypeDisplay--disallow-taps']//span[text()='"+str1+"']")));
    }

    public void isProposalNumberDisplayed(String str2) {
        Assert.assertTrue(isVisible(By.xpath("//div[@class='TextTypeDisplay BaseTypeDisplay BaseTypeDisplay--disallow-taps']//span[text()='"+str2+"']")));
    }
}
