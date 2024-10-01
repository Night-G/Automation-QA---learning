package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility {

    private static Actions actions(){
        return new Actions(driver);
    }

    public static void dragAndDropBy(WebElement source, int x, int y){
        actions().dragAndDropBy(source, x, y).perform();
    }

    public static void sendKeys(WebElement source, CharSequence keys){
        actions().sendKeys(source, keys).perform();
    }
}
