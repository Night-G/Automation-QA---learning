package demoqa.test.alerts_frame_windows;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test
    public void newWindowURLTest(){
        var windowsPage = homePage.gotToAlertsFrameWindow().clickWindows();

        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();

        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";

        Assert.assertEquals("urls differ",actualURL, expectedURL);
    }
}
