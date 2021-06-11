package com.qa.tests.pwdForm;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PdwPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidInputs extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    PdwPage pdwPage = new PdwPage();
    String email = "smn101296@gmail.com";
    String password = "1234";
    String appNo;

    @Test
    public void login() throws InterruptedException {
        openPage();
        maximizeWindow();
        loginPage.loginAsUser(email, password);
        waitSomeSeconds(10);
        homePage.isHomePageLoaded();
        homePage.clickApplications();
        homePage.clickPwdApplication();
        fillPwdForm();
    }

    private void fillPwdForm() throws InterruptedException {
        appNo = pdwPage.getApplicantNo();
        pdwPage.enterApplicantEmail("!!!");
        pdwPage.enterMobile("!!!");
        pdwPage.enterContactOfContactPerson("!!!");
        pdwPage.enterNameOfHead("!!!");
        pdwPage.enterDesignationOfHead("---");
        pdwPage.enterNameOfAssistant("!!!");
        pdwPage.enterContactOfAssistant("!!!");
        pdwPage.enterDesignationOfAssistant("!!!");
        pdwPage.enterNameOfRoad("!!!");
        pdwPage.enterLandMark("!!!");
        pdwPage.enterStartPoint("start");
        Assert.assertEquals(pdwPage.getApplicantEmailError(), "Please Enter Email");
        Assert.assertEquals(pdwPage.getApplicantMobileError(), "Please Enter Mobile Number");
        Assert.assertEquals(pdwPage.getContactPersonMobileError(), "Please Enter Number Of Company Head");
        Assert.assertEquals(pdwPage.getCompanyHeadNameError(), "Please Enter Name Of Company Head");
        Assert.assertEquals(pdwPage.getCompanyHeadDesignationError(), "Please Enter Designation Of Company Head");
        Assert.assertEquals(pdwPage.getAssistantNameError(), "Please Enter Name Of Assistant");
        Assert.assertEquals(pdwPage.getAssistantContactError(), "Please Enter Number Of Assistant");
        Assert.assertEquals(pdwPage.getAssistantDesignationError(), "Please Enter Designation Of Assistant");
        Assert.assertEquals(pdwPage.getRoadNameError(), "Please Enter Name Of Road (max 230 characters allowed)");
        Assert.assertEquals(pdwPage.getLandMarkError(), "Please Enter landmark");
    }
}
