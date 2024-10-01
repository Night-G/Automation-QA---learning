package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {
    //select menus
    private By selectValueElement = By.xpath("//div[@class=' css-1hwfws3'][.//*[@id='react-select-2-input']]");
    private By standardMultiSelectItem = By.xpath("//select[@id='cars']");

    //elements for select menus
    private By selectValueRootOption = By.xpath("//div[contains(@id, 'react-select-2-option-2')]");



    public boolean selectRootValueInSelectValue() {
        findElement(selectValueElement).click();
        scrollToElementJS(selectValueRootOption);
        click(selectValueRootOption);

        return findElement(selectValueElement).getText().equals("A root option");
    }

    public void selectInMultiselect(String carName){
        //findElement(standardMultiSelectOptionOpel).click();
        scrollToElementJS(standardMultiSelectItem);

        Select selectCars = new Select(findElement(standardMultiSelectItem));
        selectCars.selectByVisibleText(carName);
    }

    public boolean isCarSelected(String carName){
        Select selectCars = new Select(findElement(standardMultiSelectItem));
        return selectCars.getAllSelectedOptions().contains(carName);
    }
}
