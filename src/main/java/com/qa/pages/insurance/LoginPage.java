package com.qa.pages.insurance;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private static final By SIGNIN_PAGE_TITLE_LOCATOR = By.linkText("Life Insurance - Proposal Form");
    private static final By SIGNIN_BUTTON_LOCATOR = By.cssSelector("#Google");
    private static final By INPUT_EMAIL_LOCATOR = By.xpath("//*[@id=\"identifierId\"]");
    private static final By INPUT_PASSWORD_LOCATOR = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    private static final By NEXT_BUTTON_LOCATOR = By.xpath("//*[@id=\"identifierNext\"]/div/button");
    private static final By SECOND_NEXT_BUTTON_LOCATOR = By.xpath("//*[@id=\"passwordNext\"]/div/button");

    //methods
    public void isLoginPageLoaded() {
        Assert.assertTrue(isVisible(SIGNIN_PAGE_TITLE_LOCATOR));
    }

    public void clickSignInButton() {
        Assert.assertTrue(clickElement(SIGNIN_BUTTON_LOCATOR));
    }

    public void inputEmail(String email) {
        Assert.assertTrue(typeText(INPUT_EMAIL_LOCATOR, email));
    }

    public void clickNextButton() {
        Assert.assertTrue(clickElement(NEXT_BUTTON_LOCATOR));
    }

    public void inputPassword(String password) {
        Assert.assertTrue(typeText(INPUT_PASSWORD_LOCATOR, password));
    }

    public void clickSecondNextButton() {
        Assert.assertTrue(clickElement(SECOND_NEXT_BUTTON_LOCATOR));
    }
}
