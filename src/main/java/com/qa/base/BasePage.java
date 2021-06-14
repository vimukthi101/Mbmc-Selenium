package com.qa.base;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private static WebDriver driver;
    private int timeOut = 10;

    public void initWebDriver() {
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        driver = new ChromeDriver(options);
    }

    public void quitWebDriver() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public void openPage(String Url) {
        driver.get(Url);
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public boolean clickElement(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean clickUsingJavaScript(By locator){
        try {
            JavascriptExecutor js= (JavascriptExecutor)driver;
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            js.executeScript("arguments[0].click();", element);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean typeText(By locator, String value) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(value);
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean typeTextUsingJavaScript(By locator, String value) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.click();
            element.clear();
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView()", element);
            jse.executeScript("arguments[0].value='"+value+"';", element);
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public String getText(By locator) {
        try {
            return driver.findElement(locator).getText();
        } catch (Exception ex) {
            return null;
        }
    }

    public String getValue(By locator) {
        try {
            return driver.findElement(locator).getAttribute("value");
        } catch (Exception ex) {
            return null;
        }
    }

    public int getElementCount(By locator) {
        try {
            int myListToCheck;
            return myListToCheck = driver.findElements(locator).size();
        } catch (Exception ex) {
            return 0;
        }
    }

    public boolean isVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator))) != null;
    }

    public WebElement getElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = null;
        if (isVisible(locator)) {
            element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
        }
        return element;
    }

    public void selectFromList(By locator, String val) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        Select st = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)));
        st.selectByValue(val);
    }

    public void uploadFile(By locator, String path) {
//        WebDriverWait wait = new WebDriverWait(driver, timeOut);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(path);
    }

    public void scrollDown() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitSomeSeconds(int t){
        driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
    }
}
