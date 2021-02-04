package com.telran.applications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HelperSelect extends HelperBase{
    public HelperSelect(WebDriver wd) {
        super(wd);
    }

    public void selectItemWidgets() {
        click(By.xpath("//div[@class='category-cards']/div[4]"));
        //clickByxPath("//div[@class='category-cards']/div[4]");
    }

    public void clickSeleckMenu() {
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('footer').style.display='none';");
        //click(By.xpath("//li[@id='item-8']"));
        click(By.xpath("//span[.='Select Menu']"));
    }

    public void clickMultiSelect(){
        Select cars = new Select(wd.findElement(By.id("cars")));
        if(cars.isMultiple()){
            cars.selectByIndex(1);
            cars.selectByIndex(2);
            cars.selectByIndex(3);
        }

    }

    public void selectValue(String text){
        WebElement el = wd.findElement(By.id("withOptGroup"));
        el.click();
        //*[text()='Group 1, option 1']
        WebElement op= wd.findElement(By.xpath(String.format("//*[text()='%s']",text)));
        op.click();
    }

    public void selectMr(String text) {
        WebElement el = wd.findElement(By.id("selectOne"));
        el.click();
        //*[text()='Mr.']
        WebElement op= wd.findElement(By.xpath(String.format("//*[text()='%s']",text)));
        op.click();
    }

    public void oldStyleSelectMenu(String text) {
        new Select(wd.findElement(By.id("oldSelectMenu"))).selectByVisibleText(text);
    }

    public void multiselectdropDown(String text) { JavascriptExecutor js = (JavascriptExecutor) wd;
      js.executeScript("document.getElementById('react-select-4-input').checked=false;",text);
    }

}
