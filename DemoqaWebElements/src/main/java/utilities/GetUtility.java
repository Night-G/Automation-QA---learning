package utilities;

import org.openqa.selenium.By;

public class GetUtility extends Utility{
    public static String getText(By by){
        return driver.findElement(by).getText();
    }

    public static String getAttribute(By by, String attribute){
        return driver.findElement(by).getAttribute(attribute);
    }

    public static String getURL(){
        return driver.getCurrentUrl();
    }
}
