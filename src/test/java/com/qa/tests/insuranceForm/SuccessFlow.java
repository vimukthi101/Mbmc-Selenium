package com.qa.tests.insuranceForm;

import com.qa.base.BaseTest;
import com.qa.pages.insurance.HomePage;
import com.qa.pages.insurance.LoginPage;
import com.qa.pages.insurance.InsurancePage;
import org.testng.annotations.Test;

import java.util.Random;

public class SuccessFlow extends BaseTest {
    TestData testData = new TestData();
    Random r = new Random();
    int low = 1000;
    int high = 100000;
    int result = r.nextInt(high-low) + low;
    int result2 = r.nextInt(high-low) + low;
    String inwardNumber = "IN" + result;
    String proposalNumber = "P-JA-" + result2;
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
        insurancePage.enterProposalNumber(proposalNumber);
        insurancePage.enterAmtDeposit("4");
        insurancePage.enterDivisionCode("D1");
        insurancePage.enterBranchCode("B45");
        insurancePage.enterAgentName("Amit Mishra");
        insurancePage.enterAgentCode("C004");
        insurancePage.enterAgLicenseNo("L-MUM-01263");
        insurancePage.enterDateOfExpiry("06/14/2023");
        insurancePage.enterMedicalCode("M33");
        insurancePage.enterTitle("Mr");
        insurancePage.enterFullName("Shehan Bavan");
        insurancePage.enterPlaceOfBirth("Mumbai");
        insurancePage.enterNationality("Indian");
        insurancePage.selectGender();
        insurancePage.enterAgeProof("Aadhar");
        insurancePage.enterDateOfBirth("05/13/1990");
        insurancePage.enterAddressOne("somewhere mumbai");
        insurancePage.enterAddressTwo("anywhere india");
        insurancePage.enterCity("Mumbai");
        insurancePage.enterPinCode("1555");
        insurancePage.enterMobile("0711790356");
        insurancePage.enterEmail("v@g.lk");
        insurancePage.enterPlan("Jeevan Aasha 2");
        insurancePage.enterPolicyTerm("16");
        insurancePage.enterPremiumTerm("10");
        insurancePage.enterSumProposed("200000");
        insurancePage.enterTermRider("100000");
        insurancePage.selectAccidentBenefitRequired();
        insurancePage.enterDateOfCommencement("09/14/2021");
        insurancePage.enterTotalAmountDeposited("100000");
        insurancePage.selectModel();
        insurancePage.enterPayingAuthority("Self");
        insurancePage.enterEducation("Graduate");
        insurancePage.enterOccupation("Service");
        insurancePage.enterEmployerName("ABC Tech.");
        insurancePage.enterLengthOfService("3");
        insurancePage.clickSaveButton();
        waitSomeSeconds(10);
        homePage.isInwardNumberDisplayed(inwardNumber);
        homePage.isProposalNumberDisplayed(proposalNumber);
    }
}
