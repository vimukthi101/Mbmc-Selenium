package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WidgetsPage extends BasePage {
    //locators
    private static final By FORM_DIV_LOCATOR = By.xpath("//div[text()='Forms']");
    private static final By PRACTICE_FORM_LOCATOR = By.xpath("//span[text()='Practice Form']");
    private static final By STUDENT_REGISTRATION_FORM_LOCATOR = By.xpath("//h5[text()='Student Registration Form']");
    private static final By FIRST_NAME_LOCATOR = By.id("firstName");
    private static final By LAST_NAME_LOCATOR = By.id("lastName");
    private static final By EMAIL_LOCATOR = By.id("userEmail");
    private static final By GENDER_LOCATOR = By.xpath("//div[@class='col-md-9 col-sm-12']//div");
    private static final By MOBILE_NUMBER_LOCATOR = By.id("userNumber");
    private static final By BIRTH_DAY_LOCATOR = By.id("dateOfBirthInput");
    private static final By SPORTS_LOCATOR = By.xpath("//div[contains(@class,'custom-control custom-checkbox')][1]");
    private static final By PROFILE_IMAGE_UPLOADER_LOCATOR = By.id("uploadPicture");
    private static final By FRMHEADR_LOCATOR = By.id("example-modal-sizes-title-lg");
    private static final By CLOSE_BUTTON_LOCATOR = By.id("closeLargeModal");
    private static final By SUBMIT_BUTTON_LOCATOR = By.id("submit");
    private static final By YEAR_SELECT_FROM_DATE_PICKER_LOCATOR = By.className("react-datepicker__year-select");
    private static final By WEEK_SELECT_FROM_DATE_PICKER_LOCATOR = By.xpath("//div[@class='react-datepicker__week'][2]/div[3]");
    //values for inputs
    private static final String FIRST_NAME = "Test1";
    private static final String LAST_NAME = "LastTest";
    private static final String EMAIL_ADDRESS = "testemail@test.com";
    private static final String MOBILE_NUMBER = "0711790372";
    private static final String BIRTH_YEAR = "1993";
    private static final String PROFILE_PIC_PATH = "/Users/vsaranga/Downloads/DSC_0847.jpg";

    //methods
    public boolean isFormClicked() {
        return clickElement(FORM_DIV_LOCATOR);
    }

    public  boolean isPracticeFormClicked() {
        return clickElement(PRACTICE_FORM_LOCATOR);
    }

    public boolean isStudentFormLoaded() {
        return isVisible(STUDENT_REGISTRATION_FORM_LOCATOR);
    }

    public boolean addNames() {
        return typeText(FIRST_NAME_LOCATOR, FIRST_NAME) && typeText(LAST_NAME_LOCATOR, LAST_NAME);
    }

    public boolean addEmail() {
        return typeText(EMAIL_LOCATOR, EMAIL_ADDRESS);
    }

    public boolean selectGender() {
        return clickElement(GENDER_LOCATOR);
    }

    public boolean isMobNum() {
        return typeText(MOBILE_NUMBER_LOCATOR, MOBILE_NUMBER);
    }

    public boolean addBirthDay() {
        clickElement(BIRTH_DAY_LOCATOR);
        selectFromList(YEAR_SELECT_FROM_DATE_PICKER_LOCATOR, BIRTH_YEAR);
        return clickElement(WEEK_SELECT_FROM_DATE_PICKER_LOCATOR);
    }

    public boolean addHobbies() {
        return clickElement(SPORTS_LOCATOR);
    }

    public boolean addImage() {
        try {
            WebElement el = getElement(PROFILE_IMAGE_UPLOADER_LOCATOR);
            el.sendKeys(PROFILE_PIC_PATH);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean isFormSubmitted() {
        scrollDown();
        return clickElement(SUBMIT_BUTTON_LOCATOR);
    }

    public boolean isFormSent() {
        return isVisible(FRMHEADR_LOCATOR);
    }

    public boolean isPopUpClosed() {
        return clickElement(CLOSE_BUTTON_LOCATOR);
    }
}
