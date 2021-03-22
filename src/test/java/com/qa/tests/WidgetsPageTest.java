package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.WidgetsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WidgetsPageTest extends BaseTest {

    @Test(priority = 1, description = "Open form")
    public void studentonForm(){
        WidgetsPage wdgt = new WidgetsPage();
        boolean frmClik = wdgt.isFormClicked();
        Assert.assertEquals(frmClik, true);
        boolean prtFrm = wdgt.isPracticeFormClicked();
        Assert.assertEquals(prtFrm, true);
        boolean stdtFrm = wdgt.isStudentFormLoaded();
        Assert.assertEquals(stdtFrm, true);

    }

    @Test (priority = 2, description = "Form Fill")
    public void formFill(){
        WidgetsPage wdgt = new WidgetsPage();
        Assert.assertTrue(wdgt.addNames(), "Names");
        Assert.assertTrue(wdgt.addEmail(), "Email");
        Assert.assertTrue(wdgt.selectGender(), "Gender");
        Assert.assertTrue(wdgt.isMobNum(), "Mobile Number");
        Assert.assertTrue(wdgt.addBirthDay(), "Birth Day");
        Assert.assertTrue(wdgt.addHobbies(), "Hobbies");
        Assert.assertTrue(wdgt.addImage(), "Image Upload");
        Assert.assertTrue(wdgt.isFormSubmitted(), "Submit");
        Assert.assertTrue(wdgt.isFormSent(), "Form sent");
        Assert.assertTrue(wdgt.isPopUpClosed(), "Close popup");
    }
}
