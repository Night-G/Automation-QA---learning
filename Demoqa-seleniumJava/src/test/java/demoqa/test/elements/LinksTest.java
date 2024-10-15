package demoqa.test.elements;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks() {
        var linkPage = homePage.goToElements().clickLinks();
        linkPage.clickUnauthorizedRequestLink();
        String response = linkPage.getLinkResponce();

        Assert.assertTrue("Response was:"+response,response.contains("Unauthorized") && response.contains("401"));
    }
}
