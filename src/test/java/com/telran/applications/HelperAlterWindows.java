package com.telran.applications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class HelperAlterWindows extends HelperBase{
    public HelperAlterWindows(WebDriver wd) {
        super(wd);
    }

    public void selectItenAler() {

        clickByxPath("//div//h5[.='Alerts, Frame & Windows']");
    }

    public void selectBrowserWindoes() {
        clickByxPath("//span[.='Browser Windows']");
    }

    public void clickOnTabButton() {
        System.out.println(wd.getWindowHandles());
        click(By.id("tabButton"));
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));

    }

    public String takeText() {
        return wd.findElement(By.id("sampleHeading")).getText();
    }

    public void testAlert(){
        //Ok
        wd.switchTo().alert().accept();
        //cancel
        wd.switchTo().alert().dismiss();
        //send mess
        wd.switchTo().alert().sendKeys("text");
    }
}
