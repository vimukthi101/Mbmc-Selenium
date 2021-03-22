package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    //locators
    private static final By HOME_PAGE_LOCATOR = By.xpath("//h5[text()='Widgets']");

    //methods
    public boolean isWidgetClicked() {
        return clickElement(HOME_PAGE_LOCATOR);
    }
}
