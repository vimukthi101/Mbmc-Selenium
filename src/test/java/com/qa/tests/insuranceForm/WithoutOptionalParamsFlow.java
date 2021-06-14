package com.qa.tests.insuranceForm;

import com.qa.base.BaseTest;
import com.qa.pages.insurance.HomePage;
import com.qa.pages.insurance.InsurancePage;
import com.qa.pages.insurance.LoginPage;
import org.testng.annotations.Test;

import java.util.Random;

public class WithoutOptionalParamsFlow extends BaseTest {
    TestData testData = new TestData();
    Random r = new Random();
    int low = 1000;
    int high = 100000;
    int result = r.nextInt(high-low) + low;
    String inwardNumber = "IN" + result;
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    InsurancePage insurancePage = new InsurancePage();

    @Test
    public void login() throws InterruptedException {
        openPage(testData.getUrl());
        maximizeWindow();
        waitSomeSeconds(10);
        loginPage.clickSignInButton();
        loginPage.inputEmail(testData.getUserName());
        loginPage.clickNextButton();
        loginPage.inputPassword(testData.getPassword());
        loginPage.clickSecondNextButton();
        Thread.sleep(15000);
        homePage.clickCancelButton();
        waitSomeSeconds(10);
        homePage.clickProposalForm();
        homePage.clickAddButton();
        waitSomeSeconds(10);
        fillForm();
    }

    private void fillForm() {
        insurancePage.enterInwardNumber(inwardNumber);
        insurancePage.enterAmtDeposit("4");
        insurancePage.enterDateOfExpiry("06/14/2023");
        insurancePage.selectGender();
        insurancePage.enterDateOfBirth("05/13/1990");
        insurancePage.enterPinCode("1555");
        insurancePage.enterMobile("0711790356");
        insurancePage.enterEmail("v@g.lk");
        insurancePage.enterPolicyTerm("16");
        insurancePage.enterPremiumTerm("10");
        insurancePage.enterSumProposed("200000");
        insurancePage.enterTermRider("100000");
        insurancePage.selectAccidentBenefitRequired();
        insurancePage.enterDateOfCommencement("09/14/2021");
        insurancePage.enterTotalAmountDeposited("100000");
        insurancePage.selectModel();
        insurancePage.enterLengthOfService("3");
        insurancePage.clickSaveButton();
        waitSomeSeconds(10);
        homePage.isInwardNumberDisplayed(inwardNumber);
    }
}
