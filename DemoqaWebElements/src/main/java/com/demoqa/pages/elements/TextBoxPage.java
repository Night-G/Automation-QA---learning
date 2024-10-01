package com.demoqa.pages.elements;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.sendKeys;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage {
    By fullNameInput = By.id("userName");
    By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    By submitButton = By.id("submit");
    By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public void setFullName(String userName) {
        scrollToElementJS(fullNameInput);
        sendKeys(findElement(fullNameInput), userName);
    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }
    public void setAddress(String address) {
        findElement(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void clickSubmit() {
        scrollToElementJS(submitButton);
        findElement(submitButton).click();
    }

    public String getCurrentAddress() {
        explicitWaitUntilVisible(currentAddressResult, 5000);
        return findElement(currentAddressResult).getText();
    }
}
