package demoqa.test.widgets;

import demoqa.Base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class DatePickerTest extends BaseTest {

    @Test
    public void selectDatePickerTest() {
        String year = "1955";
        String month = "6";
        String day = "8";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();

        datePickerPage.clickSelectDate();
        datePickerPage.setYearInSelectDate(year);
        datePickerPage.setMonthInSelectDate(month);

        if(datePickerPage.isDayInMonthSelectDate(day)) {
            datePickerPage.clickDayInSelectDate(day);
        }

        String actualDate = datePickerPage.getDateInSelectDate();

        if(Integer.parseInt(month) <10){
            month = "0"+month;
        }
        if(Integer.parseInt(day) <10){
            day = "0"+day;
        }

        String expectedDate = month + "/" + day + "/" + year;

        Assert.assertEquals("expected: "+expectedDate+"\nactual: "+actualDate,
                expectedDate,
                actualDate);
    }
}
