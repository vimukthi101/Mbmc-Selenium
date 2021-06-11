package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {
    //locators
    private static final By APPLICATION_DROP_DOWN_LOCATOR = By.linkText("Applications");
    private static final By PWD_APPLICATION_LOCATOR = By.linkText("PWD");
    private static final By APPLICATION_NO_LOCATOR = By.xpath("//table//tbody//tr[1]//td[2]");

    //methods
    public void isHomePageLoaded() {
        Assert.assertTrue(isVisible(APPLICATION_DROP_DOWN_LOCATOR));
    }

    public void clickApplications() {
        clickElement(APPLICATION_DROP_DOWN_LOCATOR);
    }

    public void clickPwdApplication() {
        clickElement(PWD_APPLICATION_LOCATOR);
    }

    public String checkApplicationNo() {
        return getText(APPLICATION_NO_LOCATOR);
    }
}
