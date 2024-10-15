package demoqa.test.alerts_frame_windows;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class FramesTest extends BaseTest {

    @Test
    public void bigFrameTest() {
        var framesPage = homePage.gotToAlertsFrameWindow().clickFrames();

        String actualBigFrameText = framesPage.getTextInBigFrame();
        String expectedBigFrameText = "This is a sample page";

        Assert.assertEquals(expectedBigFrameText, actualBigFrameText);
    }
}
