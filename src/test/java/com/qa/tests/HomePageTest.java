package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.WidgetsPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private static final String URL = "https://demoqa.com/";
    HomePage homePage = new HomePage();
    WidgetsPage widgetsPage = new WidgetsPage();

    @Test
    public void clickOnWidget() {
        //pre-conditions
        openPage(URL);
        Reporter.log("Opening the browser");
        maximizeWindow();
        Reporter.log("Maximizing the window");
        scrollDown();
        Reporter.log("Scrolling down");
        //click on the widget
        homePage.clickWidget();
        Reporter.log("Clicked on the widget");
        //verify widgets page loaded
        Assert.assertTrue(widgetsPage.isPageLoaded());
        Reporter.log("Verified new page loaded");
    }
}
