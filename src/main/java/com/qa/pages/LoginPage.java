package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class LoginPage extends BasePage {
    //locators
    private static final By EMAIL_INPUT_LOCATOR = By.id("email_id");
    private static final By PASSWORD_INPUT_LOCATOR = By.id("password");
    private static final By ADMIN_RADIO_LOCATOR = By.xpath("//*[@id=\"login-form\"]/div[3]/div[2]/label/input");
    private static final By SIGNIN_BUTTON_LOCATOR = By.xpath("//*[@id=\"login-form\"]/div[5]/div[2]");

    //methods
    public void isLoginPageLoaded() {
        Assert.assertTrue(isVisible(EMAIL_INPUT_LOCATOR));
    }

    public void enterEmail(String email) {
        typeText(EMAIL_INPUT_LOCATOR, email);
    }

    public void enterPassword(String pwd) {
        typeText(PASSWORD_INPUT_LOCATOR, pwd);
    }

    public void selectAdmin() {
        clickElement(ADMIN_RADIO_LOCATOR);
    }

    public void clickSignIn() {
        clickElement(SIGNIN_BUTTON_LOCATOR);
//        clickUsingJavaScript(SIGNIN_BUTTON_LOCATOR);
    }

    public void loginAsUser(String email, String password){
        isLoginPageLoaded();
        enterEmail(email);
        enterPassword(password);
        clickSignIn();
    }
}
