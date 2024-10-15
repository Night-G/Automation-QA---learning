package demoqa.test.alerts_frame_windows;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class ModalDialogTest extends BaseTest {

    @Test
    public void modalDialogTest() {
        var alerts_frame_windowsPage = homePage.gotToAlertsFrameWindow();
        var modalDialogPage = alerts_frame_windowsPage.clickModalDialogs();

        modalDialogPage.clickSmallModalButton();
        String actualText = modalDialogPage.getSmallModalText();
        Assert.assertTrue("wrong text",actualText.contains("small modal"));
        modalDialogPage.clickSmallModalXCloseButton();
    }
}
