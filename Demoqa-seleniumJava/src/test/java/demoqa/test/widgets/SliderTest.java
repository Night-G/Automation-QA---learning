package demoqa.test.widgets;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class SliderTest extends BaseTest {

    @Test
    public void testSlider() {
        int x = 35;
        int y = 0;

        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x,y);

        String expectedValue = "50";
        String actualValue = sliderPage.getSliderValue();

        Assert.assertEquals(expectedValue,actualValue);
    }
}
