package demoqa.test.widgets;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class ProgressBarTest extends BaseTest {

    @Test
    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.startStopButtonClick();
        String actualValue = progressBarPage.getProgressBarValue();
        String expectedValue = "100%";

        Assert.assertEquals("differ", expectedValue, actualValue);
    }
}
