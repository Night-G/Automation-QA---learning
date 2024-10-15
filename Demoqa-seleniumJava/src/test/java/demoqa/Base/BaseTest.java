package demoqa.Base;

import com.Base.BasePage;
import com.demoqa.pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;

import static com.Base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected static BasePage basePage;
    protected static HomePage homePage;
    private static String URL = "https://demoqa.com/";

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }


    @AfterClass
    public static void quitDriver(){

        //used to see the last test`s page state
        delay(2000);

        driver.quit();
    }

    @AfterMethod
    public void takeFailResultScreenshot(ITestResult result) {
        if(ITestResult.FAILURE == result.getStatus()){
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            File destination = new File(System.getProperty("user.dir")
                    + "Desktop/sel/seleniumJava/resources/screenshots/("
                    +java.time.LocalDate.now()
                    + result.getName()
                    +").png");

            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("ScreenShot located at: "+destination);
        }
    }
}
