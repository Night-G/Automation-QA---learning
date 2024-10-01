package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import static utilities.WaitUtility.*;

public class DynamicPropertiesPage extends ElementsPage{
    By enableAfter5Button = By.id("enableAfter");
    By visibleAfter5Button = By.id("visibleAfter");

    public String getVisibleAfterButtonText(){
        explicitWaitUntilVisible(visibleAfter5Button,5000);
        return driver.findElement(visibleAfter5Button).getText();
    }
}
