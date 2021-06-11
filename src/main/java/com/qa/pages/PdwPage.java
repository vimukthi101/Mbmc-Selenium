package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PdwPage extends BasePage {
    private static final By APPLICATION_NO_LOCATOR = By.xpath("//*[@id=\"application_no\"]");
    private static final By APPLICANT_NAME_LOCATOR = By.id("applicant_name");
    private static final By APPLICANT_EMAIL_LOCATOR = By.id("applicant_email_id");
    private static final By APPLICANT_MOBILE_LOCATOR = By.id("applicant_mobile_no");
    private static final By APPLICANT_ALT_MOBILE_LOCATOR = By.id("applicant_alternate_no");
    private static final By APPLICANT_ADDRESS_LOCATOR = By.id("applicant_address");
    private static final By LETTER_NO_LOCATOR = By.id("letter_no");
    private static final By COMPANY_NAME_LOCATOR = By.xpath("//*[@id=\"pwd-form\"]/div[4]/div/div[3]/div/div[1]/button");
    private static final By LETTER_DATE_LOCATOR = By.id("letter_date");
    private static final By DATE_FOR_LETTER_DATE_LOCATOR = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a");
    private static final By COMPANY_ADDRESS_LOCATOR = By.xpath("//*[@id=\"pwd-form\"]/div[4]/div/div[4]/div/div/button");
    private static final By NAME_CONTACT_PERSON_LOCATOR = By.xpath("//input[@id='contact_person']");
    private static final By MOBILE_CONTACT_PERSON_LOCATOR = By.id("landline_no");
    private static final By NAME_HEAD_LOCATOR = By.xpath("//*[@id=\"name_company_head\"]");
    private static final By MOBILE_HEAD_LOCATOR = By.id("company_head_number");
    private static final By DESIGNATION_HEAD_LOCATOR = By.id("company_head_designation");
    private static final By NAME_ASSISTANT_LOCATOR = By.xpath("//*[@id=\"assistant_name\"]");
    private static final By MOBILE_ASSISTANT_LOCATOR = By.id("assistant_number");
    private static final By DESIGNATION_ASSISTANT_LOCATOR = By.id("assistant_designation");
    private static final By ROAD_LOCATOR = By.id("road_name");
    private static final By LANDMARK_LOCATOR = By.id("landmark");
    private static final By WORK_START_DAY_LOCATOR = By.xpath("//input[@id='work_start_date']");
    private static final By DATE_FOR_WORK_START_DAY_LOCATOR = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a");
    private static final By WORK_END_DAY_LOCATOR = By.id("work_end_date");
    private static final By DATE_FOR_WORK_END_DAY_LOCATOR = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a");
    private static final By ROAD_TYPE_LOCATOR = By.name("road_type[]");
    private static final By START_POINT_LOCATOR = By.name("start_point[]");
    private static final By END_POINT_LOCATOR = By.name("end_point[]");
    private static final By LENGTH_LOCATOR = By.name("total_length[]");
    private static final By PERMISSION_TYPE_LOCATOR = By.xpath("//*[@id=\"pwd-form\"]/div[9]/div/div/div/div/div/div[1]/button");
    private static final By REQUEST_LETTER_LOCATOR = By.xpath("//div[@class='custom-file']//input[@name='request_letter_name']");
    private static final By MAP_LOCATOR = By.xpath("//div[@class='custom-file']//input[@name='geo_location_map']");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("//button[@type='submit'][text()='Submit']");
    private static final By CONFIRM_BUTTON_LOCATOR = By.xpath("//div[@class='swal-footer']//div[@class='swal-button-container']//button[text()='OK']");
    private static final By SUCCESS_MESSAGE_TITLE_LOCATOR = By.xpath("//div[@class='swal-modal'][@role='dialog']//div[@class='swal-title']");
    private static final By SUCCESS_MESSAGE_BODY_LOCATOR = By.xpath("//div[@class='swal-modal'][@role='dialog']//div[@class='swal-text']");
    private static final By SUCCESS_MESSAGE_POPUP_BUTTON_LOCATOR = By.xpath("//div[@class='swal-footer']//div[@class='swal-button-container']//button[text()='OK']");
    private static final By APPLICANT_NAME_ERROR = By.id("applicant_name-error");
    private static final By APPLICANT_EMAIL_ERROR = By.id("applicant_email_id-error");
    private static final By APPLICANT_MOBILE_ERROR = By.id("applicant_mobile_no-error");
    private static final By APPLICANT_ADDRESS_ERROR = By.id("applicant_address-error");
    private static final By COMPANY_NAME_ERROR = By.id("company_name_select-error");
    private static final By COMPANY_ADDRESS_ERROR = By.id("company_address-error");
    private static final By CONTACT_PERSON_NAME_ERROR = By.id("contact_person-error");
    private static final By CONTACT_PERSON_MOBILE_ERROR = By.id("landline_no-error");
    private static final By COMPANY_HEAD_NAME_ERROR = By.id("name_company_head-error");
    private static final By COMPANY_HEAD_MOBILE_ERROR = By.id("company_head_number-error");
    private static final By COMPANY_HEAD_DESIGNATION_ERROR = By.id("company_head_designation-error");
    private static final By ASSISTANT_NAME_ERROR = By.id("assistant_name-error");
    private static final By ASSISTANT_CONTACT_ERROR = By.id("assistant_number-error");
    private static final By ASSISTANT_DESIGNATION_ERROR = By.id("assistant_designation-error");
    private static final By ROAD_NAME_ERROR = By.id("road_name-error");
    private static final By LANDMARK_ERROR = By.id("landmark-error");
    private static final By WORK_START_DATE_ERROR = By.id("work_start_date-error");
    private static final By WORK_END_DATE_ERROR = By.id("work_end_date-error");
    private static final By TOTAL_ERROR = By.id("total_days_of_work-error");
    private static final By ROAD_TYPE_ERROR = By.id("road_type[]-error");
    private static final By START_POINT_ERROR = By.id("start_point[]-error");
    private static final By END_POINT_ERROR = By.id("end_point[]-error");
    private static final By TOTAL_LENGTH_ERROR = By.id("total_length[]-error");
    private static final By PREMISSION_TYPE_ERROR = By.id("permission_type_select-error");

    //methods
    public String getApplicantNameError(){
        return getText(APPLICANT_NAME_ERROR);
    }

    public String getApplicantEmailError(){
        return getText(APPLICANT_EMAIL_ERROR);
    }

    public String getApplicantMobileError(){
        return getText(APPLICANT_MOBILE_ERROR);
    }

    public String getApplicantAddressError(){
        return getText(APPLICANT_ADDRESS_ERROR);
    }

    public String getCompanyNameError(){
        return getText(COMPANY_NAME_ERROR);
    }

    public String getCompanyAddressError(){
        return getText(COMPANY_ADDRESS_ERROR);
    }

    public String getContactPersonNameError(){
        return getText(CONTACT_PERSON_NAME_ERROR);
    }

    public String getContactPersonMobileError(){
        return getText(CONTACT_PERSON_MOBILE_ERROR);
    }

    public String getCompanyHeadNameError(){
        return getText(COMPANY_HEAD_NAME_ERROR);
    }

    public String getCompanyHeadMobileError(){
        return getText(COMPANY_HEAD_MOBILE_ERROR);
    }

    public String getCompanyHeadDesignationError(){
        return getText(COMPANY_HEAD_DESIGNATION_ERROR);
    }

    public String getAssistantNameError(){
        return getText(ASSISTANT_NAME_ERROR);
    }

    public String getAssistantContactError(){
        return getText(ASSISTANT_CONTACT_ERROR);
    }

    public String getAssistantDesignationError(){
        return getText(ASSISTANT_DESIGNATION_ERROR);
    }

    public String getRoadNameError(){
        return getText(ROAD_NAME_ERROR);
    }

    public String getLandMarkError(){
        return getText(LANDMARK_ERROR);
    }

    public String getWorkStartDateError(){
        return getText(WORK_START_DATE_ERROR);
    }

    public String getWorkEndDateError(){
        return getText(WORK_END_DATE_ERROR);
    }

    public String getTotalError(){
        return getText(TOTAL_ERROR);
    }

    public String getRoadTypeError(){
        return getText(ROAD_TYPE_ERROR);
    }

    public String getStartPointError(){
        return getText(START_POINT_ERROR);
    }

    public String getEndPointError(){
        return getText(END_POINT_ERROR);
    }

    public String getTotalLengthError(){
        return getText(TOTAL_LENGTH_ERROR);
    }

    public String getPermissionTypeError(){
        return getText(PREMISSION_TYPE_ERROR);
    }

    public void isPdwPageLoaded() {
        Assert.assertTrue(isVisible(APPLICANT_NAME_LOCATOR));
    }

    public String getApplicantNo(){
        return getValue(APPLICATION_NO_LOCATOR);
    }

    public void enterApplicantName(String txt){
        Assert.assertTrue(typeText(APPLICANT_NAME_LOCATOR, txt));
    }

    public void enterApplicantEmail(String txt){
        Assert.assertTrue(typeText(APPLICANT_EMAIL_LOCATOR, txt));
    }

    public void enterMobile(String txt){
        Assert.assertTrue(typeText(APPLICANT_MOBILE_LOCATOR, txt));
    }

    public void enterAltMobile(String txt){
        Assert.assertTrue(typeText(APPLICANT_ALT_MOBILE_LOCATOR, txt));
    }

    public void enterAddress(String txt){
        Assert.assertTrue(typeTextUsingJavaScript(APPLICANT_ADDRESS_LOCATOR, txt));
    }

    public void enterLetterNo(String txt){
        Assert.assertTrue(typeText(LETTER_NO_LOCATOR, txt));
    }

    public void enterNameOfContactPerson(String txt){
        Assert.assertTrue(typeTextUsingJavaScript(NAME_CONTACT_PERSON_LOCATOR, txt));
    }

    public void enterContactOfContactPerson(String txt){
        Assert.assertTrue(typeText(MOBILE_CONTACT_PERSON_LOCATOR, txt));
    }

    public void enterNameOfHead(String txt){
        Assert.assertTrue(typeText(NAME_HEAD_LOCATOR, txt));
    }

    public void enterContactOfOfHead(String txt){
        Assert.assertTrue(typeText(MOBILE_HEAD_LOCATOR, txt));
    }

    public void enterDesignationOfHead(String txt){
        Assert.assertTrue(typeText(DESIGNATION_HEAD_LOCATOR, txt));
    }

    public void enterNameOfAssistant(String txt){
        Assert.assertTrue(typeText(NAME_ASSISTANT_LOCATOR, txt));
    }

    public void enterContactOfAssistant(String txt){
        Assert.assertTrue(typeText(MOBILE_ASSISTANT_LOCATOR, txt));
    }

    public void enterDesignationOfAssistant(String txt){
        Assert.assertTrue(typeText(DESIGNATION_ASSISTANT_LOCATOR, txt));
    }

    public void enterNameOfRoad(String txt){
        Assert.assertTrue(typeText(ROAD_LOCATOR, txt));
    }

    public void enterLandMark(String txt){
        Assert.assertTrue(typeText(LANDMARK_LOCATOR, txt));
    }

    public void enterStartPoint(String txt){
        Assert.assertTrue(typeText(START_POINT_LOCATOR, txt));
    }

    public void enterEndPoint(String txt){
        Assert.assertTrue(typeText(END_POINT_LOCATOR, txt));
    }

    public void enterTotalLength(String txt){
        Assert.assertTrue(typeText(LENGTH_LOCATOR, txt));
    }

    public void selectCompanyName(String txt){
        Assert.assertTrue(clickElement(COMPANY_NAME_LOCATOR));
        Assert.assertTrue(clickElement(By.linkText(txt)));
    }

    public void selectCompanyAddress(String txt){
        Assert.assertTrue(clickUsingJavaScript(COMPANY_ADDRESS_LOCATOR));
        Assert.assertTrue(clickElement(By.linkText(txt)));
    }

    public void selectTypeOfRoad(String txt){
        selectFromList(ROAD_TYPE_LOCATOR, txt);
    }

    public void selectPermissionType(String txt){
        Assert.assertTrue(clickUsingJavaScript(PERMISSION_TYPE_LOCATOR));
        Assert.assertTrue(clickUsingJavaScript(By.linkText(txt)));
    }

    public void selectDateOnLetter(){
        Assert.assertTrue(clickElement(LETTER_DATE_LOCATOR));
        Assert.assertTrue(clickElement(DATE_FOR_LETTER_DATE_LOCATOR));
    }

    public void selectDateForWorkStartDate(){
        typeText(WORK_START_DAY_LOCATOR, "2021-06-11");
        clickUsingJavaScript(DATE_FOR_WORK_START_DAY_LOCATOR);
    }

    public void selectDateForWorkEndDate(){
        typeText(WORK_END_DAY_LOCATOR, "2021-06-24");
        clickUsingJavaScript(DATE_FOR_WORK_END_DAY_LOCATOR);
    }

    public void uploadRequestLetter(String path){
        uploadFile(REQUEST_LETTER_LOCATOR, path);
    }

    public void uploadGeoLocationMap(String path){
        uploadFile(MAP_LOCATOR, path);
    }

    public void clickSubmitButton(){
        Assert.assertTrue(clickUsingJavaScript(SUBMIT_BUTTON_LOCATOR));
    }

    public void clickConfirmButton(){
        Assert.assertTrue(clickUsingJavaScript(CONFIRM_BUTTON_LOCATOR));
    }

    public void getConfirmTitleMessage(String txt){
        Assert.assertEquals(getText(SUCCESS_MESSAGE_TITLE_LOCATOR), txt);
    }

    public void getConfirmBodyMessage(String txt){
        Assert.assertEquals(getText(SUCCESS_MESSAGE_BODY_LOCATOR), txt);
    }

    public void clickConfirmOkButton(){
        Assert.assertTrue(clickUsingJavaScript(SUCCESS_MESSAGE_POPUP_BUTTON_LOCATOR));
    }
}
