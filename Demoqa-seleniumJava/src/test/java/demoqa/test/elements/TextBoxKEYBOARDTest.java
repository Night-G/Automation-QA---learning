package demoqa.test.elements;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class TextBoxKEYBOARDTest extends BaseTest {
    @Test
    public void testTextBoxUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("some text in full name");
        textBoxPage.setEmail("some.email@gmail.com");
        textBoxPage.setAddress("some address");
        textBoxPage.setAddress("some address second line");
        textBoxPage.setAddress("some address third line");
        textBoxPage.setAddress("last line");
        textBoxPage.clickSubmit();

        String actualAddress = textBoxPage.getCurrentAddress();
        String expectedAddress = "second line";

        Assert.assertTrue(actualAddress.contains(expectedAddress));
    }
}
