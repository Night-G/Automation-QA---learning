package demoqa.test.form;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class PracticeFormTest extends BaseTest {

    @Test
    public void testForm(){

    }

    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().clickPracticeForm();

        By clickedRadioButton = formsPage.clickGenderM();
        boolean isClicked = formsPage.isRadioButtonSelected(clickedRadioButton);

        Assert.assertTrue("M radio button is NOT selected",isClicked);
    }

    @Test
    public void testCheckBox(){
        var formsPage = homePage.goToForms().clickPracticeForm();

        formsPage.clickActivateSportsCheckbox();
        formsPage.clickActivateReadingCheckbox();
        formsPage.clickActivateMusicCheckbox();

        formsPage.clickDeactivateSportsCheckbox();
        //formsPage.clickDeactivateReadingCheckbox();
        //formsPage.clickDeactivateMusicCheckbox();

        boolean isSportsClicked = formsPage.isSportsCheckboxSelected();
        Assert.assertFalse("sports checkbox is selected",isSportsClicked);
    }

    //should fail to check if screenshot works
    @Test
    public void checkScreenshot(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSubmitButton();
    }
}
