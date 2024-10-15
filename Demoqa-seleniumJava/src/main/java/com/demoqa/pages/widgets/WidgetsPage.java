package com.demoqa.pages.widgets;

import com.Base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends BasePage {
    private By selectMenuItem = By.xpath("//ul[@class='menu-list']/li[@id='item-8']/span[text()='Select Menu']");
    private By datePickerItem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    private By progressBarItem = By.xpath("//span[text()='Progress Bar']");
    private By sliderItem = By.xpath("//span[text()='Slider']");

    public SelectMenuPage clickSelectMenu (){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePicker(){
        scrollToElementJS(datePickerItem);
        click(datePickerItem);
        return new DatePickerMenuPage();
    }

    public ProgressBarPage clickProgressBar(){
        scrollToElementJS(progressBarItem);
        click(progressBarItem);
        return new ProgressBarPage();
    }

    public SliderPage clickSlider(){
        scrollToElementJS(sliderItem);
        click(sliderItem);
        return new SliderPage();
    }
}
