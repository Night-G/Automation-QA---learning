package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected WebElement findElement(By by) {
        return driver.findElement(by);
    }

    protected void set(By by, String text) {
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }

    protected void click(By by) {
        findElement(by).click();
    }


    public static void delay(int millis) {
        try {
            Thread.sleep(millis);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
