package demoqa.test.alerts_frame_windows;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static utilities.SwitchToUtility.*;


public class AlertsTest extends BaseTest {

    @Test
    public void informationAlertTest(){
        String expectedText = "You clicked a button";

        var alertPage = homePage.gotToAlertsFrameWindow().clickAlerts();
        alertPage.clickInformationAlertButton();

        String actualText = getAlertText();

        Assert.assertEquals("Messages differ",expectedText, actualText);
        acceptAlert();
    }

    @Test
    public void confirmationAlertTest(){
        String expectedOkText = "Ok";
        String expectedCancelText = "Cancel";

        var alertPage = homePage.gotToAlertsFrameWindow().clickAlerts();

        alertPage.clickConfirmAlertButton(false);
        String actualString = alertPage.getSelectedConfirmAlertText();

        Assert.assertEquals("<Some Issue>","You selected "+expectedOkText, actualString);
    }

    @Test
    public void promptAlertTest(){
        String txt = "test text";

        var alertPage = homePage.gotToAlertsFrameWindow().clickAlerts();
        alertPage.clickPromptAlertButton();

        setAlertText(txt);
        acceptAlert();

        String actualText = alertPage.getPromptResultText();
        Assert.assertEquals("You entered "+txt,actualText);
    }
}
