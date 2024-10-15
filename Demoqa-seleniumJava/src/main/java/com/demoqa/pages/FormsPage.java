package com.demoqa.pages;

import com.Base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends BasePage {
    private By practiceFormItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm(){
        scrollToElementJS(practiceFormItem);
        click(practiceFormItem);
        return new PracticeFormPage();
    }
}
