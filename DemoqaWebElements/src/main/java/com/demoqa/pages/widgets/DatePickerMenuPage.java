package com.demoqa.pages.widgets;

import com.Base.BasePage;
import org.openqa.selenium.By;

import java.util.Date;

import static utilities.SelectUtility.selectByValue;
import static utilities.SelectUtility.selectByVisibleText;

public class DatePickerMenuPage extends BasePage {
    private By selectDate = By.xpath("//input[@id='datePickerMonthYearInput']");
    private By monthDropdown = By.xpath("//select[@class='react-datepicker__month-select']");
    private By yearDropdown = By.xpath("//select[@class='react-datepicker__year-select']");

    private By dateAndTime = By.xpath("//input[@id='dateAndTimePickerInput']");


    //SelectDate
    public void clickSelectDate() {
        findElement(selectDate).click();
    }

    private By dayValue(String day){
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+day+"']");
    }

    public boolean isDayInMonthSelectDate(String day){
        return findElement(dayValue(day)).isDisplayed();
    }

    public void clickDayInSelectDate(String day) {
        click(dayValue(day));
    }

    public String getDateInSelectDate(){
        return findElement(selectDate).getAttribute("value");
    }

    public void setYearInSelectDate(String year){
        selectByVisibleText(yearDropdown, year);
    }
    public void setMonthInSelectDate(String month){
        // example:  set month June(6th month)
        // input = 6 BUT value of "June"= 5
        //  "6" -> "5"
        month = Integer.toString(Integer.parseInt(month) - 1);

        selectByValue(monthDropdown, month);
    }

    public void setDateInSelectDate(Date date) {

    }
}
