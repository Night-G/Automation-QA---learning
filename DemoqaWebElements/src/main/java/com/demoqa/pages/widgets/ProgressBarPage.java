package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.WaitUtility.fluentWaitUntilVisible;

public class ProgressBarPage extends WidgetsPage{
    By startButton = By.id("startStopButton");
    By progressBar = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public void startStopButtonClick() {
        click(startButton);
    }

    public String getProgressBarValue() {
        fluentWaitUntilVisible(progressBar,30);
        return findElement(progressBar).getText();
    }
}
