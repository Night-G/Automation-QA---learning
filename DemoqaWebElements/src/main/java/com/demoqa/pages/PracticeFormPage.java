package com.demoqa.pages;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {
    private By firstNameField = By.xpath("//div[@id='userName-wrapper']//input[@id='firstName']");
    private By lastNameField = By.xpath("//div[@id='userName-wrapper']//input[@id='lastName']");

    private By emailField = By.xpath("//div[@id='userEmail-wrapper']//input[@id='userEmail']");

    private By genderInputM = By.xpath("//input[@id='gender-radio-1']");
    private By genderInputF = By.xpath("//input[@id='gender-radio-2']");
    private By genderInputOther = By.xpath("//input[@id='gender-radio-3']");

    private By userPhoneNumberField = By.xpath("//div[@id='userNumber-wrapper']//input[@id='userNumber']");
    private By dateOfBirthField = By.xpath("//div[@id='react-datepicker-wrapper']//input[@id='dateOfBirthInput']");

    private By sportsCheckbox = By.xpath("//input[@id=' hobbies-checkbox-1']");
    private By readingCheckbox = By.xpath("//input[@id=' hobbies-checkbox-2']");
    private By musicCheckbox = By.xpath("//input[@id=' hobbies-checkbox-3']");

    private By submitButton = By.id("submit");


    public By clickGenderM(){
        clickJS(genderInputM);
        return genderInputM;
    }

    public boolean isRadioButtonSelected(By by){
        return findElement(by).isSelected();
    }

    //funcs for checkboxes
    public void clickActivateSportsCheckbox(){
        if(!findElement(sportsCheckbox).isSelected()){
            scrollToElementJS(sportsCheckbox);
            clickJS(sportsCheckbox);
        }
    }

    public void clickActivateReadingCheckbox(){
        if(!findElement(readingCheckbox).isSelected()){
            scrollToElementJS(readingCheckbox);
            clickJS(readingCheckbox);
        }
    }

    public void clickActivateMusicCheckbox(){
        if(!findElement(musicCheckbox).isSelected()){
            scrollToElementJS(musicCheckbox);
            clickJS(musicCheckbox);
        }
    }

    public void clickDeactivateSportsCheckbox(){
        if(findElement(sportsCheckbox).isSelected()){
            scrollToElementJS(sportsCheckbox);
            clickJS(sportsCheckbox);
        }
    }

    public void clickDeactivateReadingCheckbox(){
        if(findElement(readingCheckbox).isSelected()){
            scrollToElementJS(readingCheckbox);
            clickJS(readingCheckbox);
        }
    }

    public void clickDeactivateMusicCheckbox(){
        if(findElement(musicCheckbox).isSelected()){
            scrollToElementJS(musicCheckbox);
            clickJS(musicCheckbox);
        }
    }

    public boolean isSportsCheckboxSelected(){
        return findElement(sportsCheckbox).isSelected();
    }


    //made to fail
    public void clickSubmitButton(){
        click(submitButton);
    }
}
