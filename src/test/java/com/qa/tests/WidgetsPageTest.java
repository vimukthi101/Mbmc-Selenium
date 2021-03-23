package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.WidgetsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WidgetsPageTest extends BaseTest {

    WidgetsPage widgetsPage = new WidgetsPage();

    @Test(priority = 1, description = "Open form")
    public void studentOnForm(){
        Assert.assertEquals(widgetsPage.isFormClicked(), true);
        Assert.assertEquals(widgetsPage.isPracticeFormClicked(), true);
        Assert.assertEquals(widgetsPage.isStudentFormLoaded(), true);
    }

    //@Test (priority = 2, description = "Form Fill")
    @Test (dependsOnMethods = "studentOnForm", description = "Form Fill")
    public void formFill(){
        Assert.assertTrue(widgetsPage.addNames(), "Names");
        Assert.assertTrue(widgetsPage.addEmail(), "Email");
        Assert.assertTrue(widgetsPage.selectGender(), "Gender");
        Assert.assertTrue(widgetsPage.isMobNum(), "Mobile Number");
        Assert.assertTrue(widgetsPage.addBirthDay(), "Birth Day");
        scrollDown();
        Assert.assertTrue(widgetsPage.submitForm(), "Submit");
        Assert.assertTrue(widgetsPage.isFormSent(), "Form sent");
        Assert.assertTrue(widgetsPage.isPopUpClosed(), "Close popup");
    }
}
