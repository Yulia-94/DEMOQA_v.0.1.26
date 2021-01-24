package com.telran.applications;

import com.telran.models.StudentRegForm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
        typeBDay(model.getbDay());
        selectSubject(model.getSubject());
        selectHobbies(model.getHoddies());
        type(By.id("currentAddress"), model.getAdress());
        pause(1000);
        selectState(model.getState());
        selectCity(model.getCity());



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