package com.qa.tests.insuranceForm;

import com.qa.base.BaseTest;
import com.qa.pages.insurance.HomePage;
import com.qa.pages.insurance.InsurancePage;
import com.qa.pages.insurance.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class WithoutMandatoryParamsFlow extends BaseTest {
    TestData testData = new TestData();
    Random r = new Random();
    int low = 1000;
    int high = 100000;
    int result2 = r.nextInt(high-low) + low;
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
        insurancePage.enterProposalNumber(proposalNumber);
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
        insurancePage.enterAgeProof("Aadhar");
        insurancePage.enterDateOfBirth("05/13/1990");
        insurancePage.enterAddressOne("somewhere mumbai");
        insurancePage.enterAddressTwo("anywhere india");
        insurancePage.enterCity("Mumbai");
        insurancePage.enterPlan("Jeevan Aasha 2");
        insurancePage.enterPayingAuthority("Self");
        insurancePage.enterEducation("Graduate");
        insurancePage.enterOccupation("Service");
        insurancePage.enterEmployerName("ABC Tech.");
        insurancePage.enterDateOfCommencement("09/14/2021");
        insurancePage.clickSaveButton();
        Assert.assertEquals(insurancePage.getErrorMessageCount(),14);
        Assert.assertEquals(insurancePage.getErrorMessage(), "This entry is required");
    }
}
