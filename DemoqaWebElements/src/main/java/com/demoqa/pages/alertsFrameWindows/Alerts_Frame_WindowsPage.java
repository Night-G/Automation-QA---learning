package com.demoqa.pages.alertsFrameWindows;

import com.Base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frame_WindowsPage extends BasePage {
    By modalDialogsElement = By.xpath("//span[text()='Modal Dialogs']");
    By alertsElement = By.xpath("//span[text()='Alerts']");
    By framesElement = By.xpath("//span[text()='Frames']");
    By windowsElement = By.xpath("//span[text()='Browser Windows']");

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsElement);
        click(modalDialogsElement);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlerts(){
        scrollToElementJS(alertsElement);
        click(alertsElement);
        return new AlertsPage();
    }

    public FramesPage clickFrames(){
        scrollToElementJS(framesElement);
        click(framesElement);
        return new FramesPage();
    }

    public WindowsPage clickWindows(){
        scrollToElementJS(windowsElement);
        click(windowsElement);
        return new WindowsPage();
    }
}
