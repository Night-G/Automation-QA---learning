package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility extends Utility{
    public static void explicitWaitUntilVisible(By locator, int millis){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(millis));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void fluentWaitUntilVisible(By locator, int seconds){
        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(seconds))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
