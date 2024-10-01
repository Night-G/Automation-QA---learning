package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility extends Utility {
    private static Select findDropDown(By by){
        return new Select(driver.findElement(by));
    }

    public static void selectByValue(By by, String value){
        findDropDown(by).selectByValue(value);
    }

    public static void selectByVisibleText(By by, String text){
        findDropDown(by).selectByVisibleText(text);
    }
}
