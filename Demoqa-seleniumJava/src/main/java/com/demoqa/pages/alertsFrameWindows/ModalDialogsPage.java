package com.demoqa.pages.alertsFrameWindows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends Alerts_Frame_WindowsPage {
    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private By smallModalXCloseButton = By.xpath("//button[@class='close']/span[contains(text(),'×')]");

    private By lagreModalButton = By.id("showLargeModal");

    public void clickSmallModalButton() {
        scrollToElementJS(smallModalButton);
        click(smallModalButton);
    }

    public void clickLargeModalButton() {
        scrollToElementJS(lagreModalButton);
        click(lagreModalButton);
    }

    public String getSmallModalText() {
        return findElement(smallModalText).getText();
    }

    public void clickSmallModalXCloseButton() {
        findElement(smallModalXCloseButton).click();
    }
}
