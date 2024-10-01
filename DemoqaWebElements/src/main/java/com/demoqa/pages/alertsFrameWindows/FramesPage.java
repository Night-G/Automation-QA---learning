package com.demoqa.pages.alertsFrameWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesPage extends Alerts_Frame_WindowsPage {
    private String iFrameBigFrame = "frame1";
    private By bigFrameTextElement = By.id("sampleHeading");
    private By smallFrameElement = By.id("frame2");

    private void switchToBigFrame(){
        driver.switchTo().frame(iFrameBigFrame);

    }

    /**
     * using index unstable and works as a last resort
     */
    private void switchToSmallFrameINDEX(){
        driver.switchTo().frame(3);
    }

    private void switchToSmallBox(){
        WebElement frame = driver.findElement(smallFrameElement);
        driver.switchTo().frame(frame);
    }

    public String getTextInBigFrame(){
        switchToBigFrame(); //   driver.switchTo().defaultContent() - return to original frame
        return findElement(bigFrameTextElement).getText();
    }
}
