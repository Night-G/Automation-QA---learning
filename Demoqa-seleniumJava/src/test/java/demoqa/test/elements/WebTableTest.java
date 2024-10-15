package demoqa.test.elements;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class WebTableTest extends BaseTest {
    private String email = "kierra@example.com";
    private String age = "16";

    @Test
    public void testWebTable() {
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge(age);
        webTablePage.clickSubmit();

        String gottenAge = webTablePage.getAgeByEmail(email);
        Assert.assertTrue("wrong age", gottenAge.equals(age));
    }
}
