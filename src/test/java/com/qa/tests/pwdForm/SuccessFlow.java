package com.qa.tests.pwdForm;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PdwPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessFlow extends BaseTest {

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
        pdwPage.enterApplicantName("vimukthi");
        pdwPage.enterApplicantEmail("vimukthi@gmail.com");
        pdwPage.enterMobile("0112708298");
        pdwPage.enterAltMobile("0112708290");
        pdwPage.enterAddress("main road, cross street, mumbai");
        pdwPage.enterLetterNo("123");
        pdwPage.selectDateOnLetter();
        pdwPage.selectCompanyName("Tata Power");
        waitSomeSeconds(5);
        pdwPage.selectCompanyAddress("Tata Power");
        Thread.sleep(1000);
        pdwPage.enterNameOfContactPerson("Amit");
        pdwPage.enterContactOfContactPerson("0112708296");
        pdwPage.enterNameOfHead("Mishra");
        pdwPage.enterContactOfOfHead("0112708270");
        pdwPage.enterDesignationOfHead("Accountant");
        pdwPage.enterNameOfAssistant("Virat");
        pdwPage.enterContactOfAssistant("0112508290");
        pdwPage.enterDesignationOfAssistant("Assistant");
        pdwPage.enterNameOfRoad("Main street");
        pdwPage.enterLandMark("Bank");
        pdwPage.selectDateForWorkStartDate();
        pdwPage.selectDateForWorkEndDate();
        pdwPage.selectTypeOfRoad("10");
        pdwPage.enterStartPoint("start");
        pdwPage.enterEndPoint("end");
        pdwPage.enterTotalLength("123");
        pdwPage.selectPermissionType("New Connection");
        pdwPage.uploadRequestLetter(System.getProperty("user.dir") + "\\target\\resources\\pdffile.pdf");
        pdwPage.uploadGeoLocationMap(System.getProperty("user.dir") + "\\target\\resources\\pdffile.pdf");
        pdwPage.clickSubmitButton();
        waitSomeSeconds(10);
        pdwPage.clickConfirmButton();
        Thread.sleep(5000);
        pdwPage.getConfirmTitleMessage("Good Job!");
        pdwPage.getConfirmBodyMessage("Application updated successfully.");
        pdwPage.clickConfirmOkButton();
        waitSomeSeconds(10);
        Assert.assertEquals(appNo, homePage.checkApplicationNo());
    }
}
