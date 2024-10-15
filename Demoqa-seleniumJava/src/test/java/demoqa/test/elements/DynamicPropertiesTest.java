package demoqa.test.elements;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class DynamicPropertiesTest extends BaseTest {
    @Test
    public void testVisibleAfterButton() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String visibleAfterButtonText = dynamicPage.getVisibleAfterButtonText();

        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals("text differ", expectedText, visibleAfterButtonText);
    }
}
