package com.telran.applications;

import com.telran.models.StudentRegForm;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HelperStudentForm extends HelperBase{
    public HelperStudentForm(WebDriver wd) {
        super(wd);
    }

    public void selectItemForms() {
        clickByxPath("//div[@class='category-cards']/div[2]");
    }

    public void selectPracticeForm() {
        clickByxPath("//span[.='Practice Form']");
    }

    public void clickSubmitButton() {
        click(By.id("submit"));
    }

    public void fillRegForm(StudentRegForm model) throws InterruptedException {
        type(By.id("firstName"), model.getfName());
        type(By.id("lastName"), model.getlName());
        type(By.id("userEmail"), model.getEmail());
        selectGender(model.getGender());
        pause(500);
        type(By.id("userNumber"), model.getPhone());
        //typeBDay(model.getbDay());
        typeBdaySelect(model.getbDay());
        selectSubject(model.getSubject());
        selectHobbies(model.getHoddies());
      type(By.id("currentAddress"), model.getAdress());
       // typeAdress(model.getAdress());
        pause(1000);
        selectState(model.getState());
        selectCity(model.getCity());

    }

    private void typeAdress(String text){
        WebElement el = wd.findElement((By.id("currentAddress")));
       // Actions actions = new Actions(wd);
      //  actions.moveToElement(el);

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,300");
        el.click();
        el.clear();
        el.sendKeys(text);
    }


    private void selectSubject(String subject){
        type(By.id("subjectsInput"), subject);
        wd.findElement(By.id("subjectsInput")).getAttribute("m");
        click(By.id("react-select-2-option-0"));

    }

    private void selectCity(String city){
        type(By.id("react-select-4-input"), city);
        wd.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
    }

    private void selectState(String state){
       type(By.id("react-select-3-input"),state);
       wd.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
    }


    private void selectHobbies(String hobbies){
        if(hobbies.equals("Sport")){
            clickByxPath("//label[@for='hobbies-checkbox-1']");
        } else if(hobbies.equals("Reading")){
            clickByxPath("//label[@for='hobbies-checkbox-2']");
        } else if(hobbies.equals("Music")){
            clickByxPath("//label[@for='hobbies-checkbox-3']");
        } else if(hobbies.equals("Sport,Reading")){
            clickByxPath("//label[@for='hobbies-checkbox-1']");
            clickByxPath("//label[@for='hobbies-checkbox-2']");
        } else if(hobbies.equals("Sport,Reading,Music")){
            clickByxPath("//label[@for='hobbies-checkbox-1']");
            clickByxPath("//label[@for='hobbies-checkbox-2']");
            clickByxPath("//label[@for='hobbies-checkbox-3']");
        } else if(hobbies.equals("Sport,Music")){
            clickByxPath("//label[@for='hobbies-checkbox-1']");
            clickByxPath("//label[@for='hobbies-checkbox-3']");
        } else if(hobbies.equals("Reading,Music")){
            clickByxPath("//label[@for='hobbies-checkbox-2']");
            clickByxPath("//label[@for='hobbies-checkbox-3']");
        }
    }

    private void typeBDay(String bday){
        wd.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.chord (Keys.CONTROL, bday));
        type(By.id("dateOfBirthInput"), bday);
        wd.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ENTER);
    }

    private void typeBday2(String bday){
        WebElement element=wd.findElement(By.id("dateOfBirthInput"));
        element.click();
        String os = System.getProperty("os.name");
        if(os.startsWith("Mac")){
            element.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        } else{
            element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        }
        element.sendKeys(bday);
        element.sendKeys(Keys.ENTER);
    }

    private void typeBdaySelect(String text){
        String[] data = text.split(" ");
        wd.findElement(By.id("dateOfBirthInput")).click();

        new Select(wd.findElement(By.cssSelector(".react-datepicker__month-select"))).selectByVisibleText(data[1]);
        new Select(wd.findElement(By.cssSelector(".react-datepicker__year-select"))).selectByVisibleText(data[2]);
        //click(By.xpath(String.format("//div[.='%s']", data[0])));
        WebElement el;
        List<WebElement> list = wd.findElements(By.xpath(String.format("//div[.='%s']", data[0])));
        int day = Integer.parseInt(data[0]);
        if(list.size()>1 && day > 15){
            el = list.get(1);
        } else {
            el = list.get(0);
        }
        el.click();

    }


    private void selectGender(String gender){
        if(gender.equals("Male")) {
            clickByxPath("//label[@for='gender-radio-1']");
        }else if(gender.equals("Female")){
            clickByxPath("//label[@for='gender-radio-2']");
        } else {
            clickByxPath("//label[@for='gender-radio-3']");
        }

    }

    public boolean isCloseList() {
        return isElementPresent(By.id("closeLargeModal"));
    }
}
