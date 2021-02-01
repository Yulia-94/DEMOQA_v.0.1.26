package com.telran.applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        click(By.xpath("//li[@id='item-8']"));
    }

    public void clickMultiSelect(){
        Select cars = new Select(wd.findElement(By.id("cars")));
        if(cars.isMultiple()){
            cars.selectByIndex(1);
            cars.selectByIndex(2);
            cars.selectByIndex(3);
        }
    }
}
