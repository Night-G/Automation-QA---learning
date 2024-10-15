package com.demoqa.pages.alertsFrameWindows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class WindowsPage extends Alerts_Frame_WindowsPage{

    By newWindowButton = By.xpath("//Button[@id='windowButton']");

    public void clickNewWindowButton(){
        click(newWindowButton);
    }

    public void switchToNewWindow(){
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main window ID: "+currentHandle);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("№ of open windows "+allHandles.size());

        for(String handle : allHandles){
            if(currentHandle.equals(handle)){
                System.out.println("1st ID: "+handle);
            }
            else{
                switchToWindow(handle);
                System.out.println("2nd window ID: "+handle);
            }
        }
    }
}
