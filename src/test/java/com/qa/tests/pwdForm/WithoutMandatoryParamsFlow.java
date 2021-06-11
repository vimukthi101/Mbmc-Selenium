package com.qa.tests.pwdForm;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PdwPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WithoutMandatoryParamsFlow extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    PdwPage pdwPage = new PdwPage();
    String email = "smn101296@gmail.com";
    String password = "1234";
    String appNo;

    @Test
    public void login() {
        openPage();
        maximizeWindow();
        loginPage.loginAsUser(email, password);
        waitSomeSeconds(10);
        homePage.isHomePageLoaded();
        homePage.clickApplications();
        homePage.clickPwdApplication();
        fillPwdForm();
    }

    private void fillPwdForm() {
        pdwPage.clickSubmitButton();
        Assert.assertEquals(pdwPage.getApplicantNameError(), "Please Enter Name");
        Assert.assertEquals(pdwPage.getApplicantEmailError(), "Please Enter Email");
        Assert.assertEquals(pdwPage.getApplicantMobileError(), "Please Enter Mobile Number");
        Assert.assertEquals(pdwPage.getApplicantAddressError(), "Please Enter Address");
        Assert.assertEquals(pdwPage.getCompanyNameError(), "Please Select Name Of Company");
        Assert.assertEquals(pdwPage.getCompanyAddressError(), "Please Select Address Of Company");
        Assert.assertEquals(pdwPage.getContactPersonNameError(), "Please Enter Name Of Contact Person");
        Assert.assertEquals(pdwPage.getContactPersonMobileError(), "Please Enter Number Of Company Head");
        Assert.assertEquals(pdwPage.getCompanyHeadNameError(), "Please Enter Name Of Company Head");
        Assert.assertEquals(pdwPage.getCompanyHeadMobileError(), "Please Enter Number of Company Head");
        Assert.assertEquals(pdwPage.getCompanyHeadDesignationError(), "Please Enter Designation Of Company Head");
        Assert.assertEquals(pdwPage.getAssistantNameError(), "Please Enter Name Of Assistant");
        Assert.assertEquals(pdwPage.getAssistantContactError(), "Please Enter Number Of Assistant");
        Assert.assertEquals(pdwPage.getAssistantDesignationError(), "Please Enter Designation Of Assistant");
        Assert.assertEquals(pdwPage.getRoadNameError(), "Please Enter Name Of Road (max 230 characters allowed)");
        Assert.assertEquals(pdwPage.getLandMarkError(), "Please Enter landmark");
        Assert.assertEquals(pdwPage.getWorkStartDateError(), "Please Select Work Start Date");
        Assert.assertEquals(pdwPage.getWorkEndDateError(), "Please Select Work End Date");
        Assert.assertEquals(pdwPage.getTotalError(), "Some Error Occured Please Try Again");
        Assert.assertEquals(pdwPage.getRoadTypeError(), "This field is required.");
        Assert.assertEquals(pdwPage.getStartPointError(), "This field is required.");
        Assert.assertEquals(pdwPage.getEndPointError(), "This field is required.");
        Assert.assertEquals(pdwPage.getTotalLengthError(), "This field is required.");
        Assert.assertEquals(pdwPage.getPermissionTypeError(), "Please Select Permission Type");
    }
}
