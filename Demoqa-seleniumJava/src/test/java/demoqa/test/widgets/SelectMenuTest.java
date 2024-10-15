package demoqa.test.widgets;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectMenuTest extends BaseTest {

    @Test
    public void selectValueTest(){
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();

        boolean aRootSelected = selectMenuPage.selectRootValueInSelectValue();
        Assert.assertTrue("'A root option' is not selected",aRootSelected);

        List<String> cars = new ArrayList<String>(
                Arrays.asList("Opel","Volvo")
        );

        for (String car : cars) {
            selectMenuPage.selectInMultiselect(car);
        }
    }
}
