package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.dragAndDropBy;

public class SliderPage extends WidgetsPage{
    By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    By sliderValue = By.xpath("//input[@id = 'sliderValue']");

    public void moveSlider(int x, int y){
        dragAndDropBy(findElement(slider),x,y);
    }

    public String getSliderValue(){
        return findElement(sliderValue).getAttribute("value");
    }
}
