package com.demoqa.pages.elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

    private By regAgeField = By.id("age");
    private By submitButton = By.id("submit");

    public void clickEdit(String email){
        By edit = By.xpath("//div[text()='"+email+"']//following::span[@title='Edit']");
        click(edit);
    }

    public void setAge(String age){
        set(regAgeField, age);
    }

    public void clickSubmit(){
        click(submitButton);
    }

    public String getAgeByEmail(String email){
        By age = By.xpath("//div[text()='"+email+"']//preceding::div[1]");
        return findElement(age).getText();
    }
}
