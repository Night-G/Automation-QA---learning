package com.demoqa.pages.alertsFrameWindows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.dismissAlert;

public class AlertsPage extends Alerts_Frame_WindowsPage {
    By alertButtonElement = By.xpath("//Button[@id='alertButton']");
    By timerAlertButtonElement = By.xpath("//Button[@id='timerAlertButton']");

    By confirmAlertButtonElement = By.xpath("//Button[@id='confirmButton']");
    By confirmResult = By.xpath("//span[@id='confirmResult']");

    By promptAlertButtonElement = By.xpath("//Button[@id='promtButton']");
    By promptResult = By.xpath("//span[@id='promptResult']");

    public void clickInformationAlertButton(){
        click(alertButtonElement);
    }

    /**
     *  @param dismissAlert true if 'cancel' in confirmation alert
     */
    public void clickConfirmAlertButton(boolean dismissAlert){
        click(confirmAlertButtonElement);

        if(dismissAlert){
            dismissAlert();
        }
        else acceptAlert();
    }

    public String getSelectedConfirmAlertText(){
        return findElement(confirmResult).getText();
    }

    public void clickPromptAlertButton(){
        click(promptAlertButtonElement);
    }

    public String getPromptResultText(){
        return findElement(promptResult).getText();
    }
}
