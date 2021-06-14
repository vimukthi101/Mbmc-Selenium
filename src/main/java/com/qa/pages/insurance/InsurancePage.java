package com.qa.pages.insurance;

import com.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class InsurancePage extends BasePage {
    private static final By INWARD_NUMBER_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaInward_Number']//input");
    private static final By PROPOSAL_NUMBER_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaProposal_Number']//input");
    private static final By AMT_DEPOSIT_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaAmt_of_Depsit']//input");
    private static final By DIVISION_CODE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaDivision_Code']//input");
    private static final By BRANCH_CODE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaBranch_Code']//input");
    private static final By AGENT_NAME_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaAgent_Name']//input");
    private static final By AGENT_CODE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaAgent_Code']//input");
    private static final By AG_LICENSE_NO_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaAg_Licence_No']//input");
    private static final By MEDICAL_CODE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaMedical_Code']//input");
    private static final By TITLE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaTitle']//input");
    private static final By FULL_NAME_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaFull_Name']//input");
    private static final By PLACE_OF_BIRTH_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaPlace_of_Birth']//input");
    private static final By NATIONALITY_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaNationality']//input");
    private static final By GENDER_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaSex']//span//span[text()='M']");
    private static final By AGE_PROOF_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaAge_Proof']//input[@class='input-block-level']");
    private static final By ADDRESS_LINE_1_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaAddress_Line_1']//input[@class='InputWithAutocomplete__input']");
    private static final By ADDRESS_LINE_2_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaAddress_Line_2']//input[@class='InputWithAutocomplete__input']");
    private static final By CITY_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaCity']//input[@class='input-block-level']");
    private static final By PIN_CODE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaPin_Code']//input[@class='input-block-level']");
    private static final By MOBILE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaMobile']//input[@class='input-block-level']");
    private static final By EMAIL_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaEmail']//input[@class='input-block-level']");
    private static final By PLAN_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaPlan']//input[@class='input-block-level']");
    private static final By POLICY_TERM_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaPolicy_Term']//input[@class='input-block-level']");
    private static final By PREMIUM_TERM_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaPremium_Term']//input[@class='input-block-level']");
    private static final By SUM_PROPOSED_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaSum_Proposed_Rs']//input[@class='input-block-level']");
    private static final By TERM_RIDER_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaTerm_Rider_Rs']//input[@class='input-block-level']");
    private static final By ACCIDENT_BENEFIT_REQUIRED_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaIs_Accident_Benefit_Required']//span[@class='ASTappable ButtonSelectButton ButtonSelectButton--text-mode ASTappable--pointer']//span[text()='N']");
    private static final By TOTAL_AMOUNT_DEPOSITED_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaTotal_Amt_Deposited']//input[@class='input-block-level']");
    private static final By MODEL_LOCATOR = By.xpath("//div[@class='FormEntryValue']//span//span[text()='Yearly']");
    private static final By PAYING_AUTHORITY_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaPaying_Authority']//input[@class='input-block-level']");
    private static final By EDUCATION_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaEducation']//input[@class='input-block-level']");
    private static final By OCCUPATION_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaOccupation']//input[@class='input-block-level']");
    private static final By EMPLOYER_NAME_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaEmployer_Name']//input[@class='input-block-level']");
    private static final By LENGTH_OF_SERVICE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaLength_of_Service']//input[@class='input-block-level']");
    private static final By SAVE_BUTTON_LOCATOR = By.xpath("//div[@class='FormView__footer-buttonWrapper']//span[@class='ASTappable FormView__footer-button FormView__footer-saveButton ASTappable--pointer']");
    private static final By DATE_OF_COMMENCEMENT_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaDate_of_Commencement']//input");
    private static final By DATE_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaDate']//input");
    private static final By DATE_OF_EXPIRY_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaDate_of_Expiry']//input");
    private static final By DATE_OF_PROPOSAL_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaProposal_Date']//input");
    private static final By DATE_OF_BIRTH_LOCATOR = By.xpath("//div[@id='__TableEntryScreenProposal_Form_SchemaDate_of_Birth']//input");
    private static final By ERROR_MESSAGE_LOCATOR = By.xpath("//div[@class='FormEntryValue']//div[@class='ErrorMessageText']");

    //methods
    public int getErrorMessageCount() {
        return getElementCount(ERROR_MESSAGE_LOCATOR);
    }

    public String getErrorMessage() {
        return getText(ERROR_MESSAGE_LOCATOR);
    }

    public void enterDateOfCommencement(String str) {
        Assert.assertTrue(typeText(DATE_OF_COMMENCEMENT_LOCATOR, str));
    }

    public void enterDate(String str) {
        Assert.assertTrue(typeText(DATE_LOCATOR, str));
    }

    public void enterDateOfExpiry(String str) {
        Assert.assertTrue(typeText(DATE_OF_EXPIRY_LOCATOR, str));
    }

    public void enterDateOfProposal(String str) {
        Assert.assertTrue(typeText(DATE_OF_PROPOSAL_LOCATOR, str));
    }

    public void enterDateOfBirth(String str) {
        Assert.assertTrue(typeText(DATE_OF_BIRTH_LOCATOR, str));
    }

    public void enterInwardNumber(String str) {
        Assert.assertTrue(typeText(INWARD_NUMBER_LOCATOR, str));
    }

    public void enterProposalNumber(String str) {
        Assert.assertTrue(typeText(PROPOSAL_NUMBER_LOCATOR, str));
    }

    public void enterAmtDeposit(String str) {
        Assert.assertTrue(typeText(AMT_DEPOSIT_LOCATOR, str));
    }

    public void enterDivisionCode(String str) {
        Assert.assertTrue(typeText(DIVISION_CODE_LOCATOR, str));
    }

    public void enterBranchCode(String str) {
        Assert.assertTrue(typeText(BRANCH_CODE_LOCATOR, str));
    }

    public void enterAgentName(String str) {
        Assert.assertTrue(typeText(AGENT_NAME_LOCATOR, str));
    }

    public void enterAgentCode(String str) {
        Assert.assertTrue(typeText(AGENT_CODE_LOCATOR, str));
    }

    public void enterAgLicenseNo(String str) {
        Assert.assertTrue(typeText(AG_LICENSE_NO_LOCATOR, str));
    }

    public void enterMedicalCode(String str) {
        Assert.assertTrue(typeText(MEDICAL_CODE_LOCATOR, str));
    }

    public void enterTitle(String str) {
        Assert.assertTrue(typeText(TITLE_LOCATOR, str));
    }

    public void enterFullName(String str) {
        Assert.assertTrue(typeText(FULL_NAME_LOCATOR, str));
    }

    public void enterPlaceOfBirth(String str) {
        Assert.assertTrue(typeText(PLACE_OF_BIRTH_LOCATOR, str));
    }

    public void enterNationality(String str) {
        Assert.assertTrue(typeText(NATIONALITY_LOCATOR, str));
    }

    public void selectGender() {
        Assert.assertTrue(clickElement(GENDER_LOCATOR));
    }

    public void enterAgeProof(String str) {
        Assert.assertTrue(typeText(AGE_PROOF_LOCATOR, str));
    }

    public void enterAddressOne(String str) {
        Assert.assertTrue(typeText(ADDRESS_LINE_1_LOCATOR, str));
    }

    public void enterAddressTwo(String str) {
        Assert.assertTrue(typeText(ADDRESS_LINE_2_LOCATOR, str));
    }

    public void enterCity(String str) {
        Assert.assertTrue(typeText(CITY_LOCATOR, str));
    }

    public void enterPinCode(String str) {
        Assert.assertTrue(typeText(PIN_CODE_LOCATOR, str));
    }

    public void enterMobile(String str) {
        Assert.assertTrue(typeText(MOBILE_LOCATOR, str));
    }

    public void enterEmail(String str) {
        Assert.assertTrue(typeText(EMAIL_LOCATOR, str));
    }

    public void enterPlan(String str) {
        Assert.assertTrue(typeText(PLAN_LOCATOR, str));
    }

    public void enterPolicyTerm(String str) {
        Assert.assertTrue(typeText(POLICY_TERM_LOCATOR, str));
    }

    public void enterPremiumTerm(String str) {
        Assert.assertTrue(typeText(PREMIUM_TERM_LOCATOR, str));
    }

    public void enterSumProposed(String str) {
        Assert.assertTrue(typeText(SUM_PROPOSED_LOCATOR, str));
    }

    public void enterTermRider(String str) {
        Assert.assertTrue(typeText(TERM_RIDER_LOCATOR, str));
    }

    public void selectAccidentBenefitRequired() {
        Assert.assertTrue(clickElement(ACCIDENT_BENEFIT_REQUIRED_LOCATOR));
    }

    public void enterTotalAmountDeposited(String str) {
        Assert.assertTrue(typeText(TOTAL_AMOUNT_DEPOSITED_LOCATOR, str));
    }

    public void selectModel() {
        Assert.assertTrue(clickElement(MODEL_LOCATOR));
    }

    public void enterPayingAuthority(String str) {
        Assert.assertTrue(typeText(PAYING_AUTHORITY_LOCATOR, str));
    }

    public void enterEducation(String str) {
        Assert.assertTrue(typeText(EDUCATION_LOCATOR, str));
    }

    public void enterOccupation(String str) {
        Assert.assertTrue(typeText(OCCUPATION_LOCATOR, str));
    }

    public void enterEmployerName(String str) {
        Assert.assertTrue(typeText(EMPLOYER_NAME_LOCATOR, str));
    }

    public void enterLengthOfService(String str) {
        Assert.assertTrue(typeText(LENGTH_OF_SERVICE_LOCATOR, str));
    }

    public void clickSaveButton() {
        Assert.assertTrue(clickElement(SAVE_BUTTON_LOCATOR));
    }
}
