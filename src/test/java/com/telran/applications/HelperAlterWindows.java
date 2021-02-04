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
       // Actions actions = new Actions(wd);
      //  actions.moveToElement(wd.findElement(By.xpath("//div//h5[.='Alerts, Frame & Windows']"))).click().perform();

       // JavascriptExecutor js = (JavascriptExecutor) wd;
      //  js.executeScript("window.scrollBy(0,500");
      //  clickByxPath("//div//h5[.='Alerts, Frame & Windows']");
        clickByxPath("//div[@class='category-cards']/div[3]");

    }

    public void selectBrowserWindoes() {
        clickByxPath("//span[.='Browser Windows']");
    }


    public void selectBrowserAlerts() {
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('footer').style.display='none';");
        //click(By.xpath("//span[.='Alerts']"));
       clickByxPath("//div[@class='element-list collapse show']//li[2]");


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

    public void testAlert() throws InterruptedException {
        click(By.id("alertButton"));
        pause(3000);
        //Ok
        wd.switchTo().alert().accept();
        click(By.id("confirmButton"));
        pause(3000);
        //cancel
        wd.switchTo().alert().dismiss();
        click(By.id("promtButton"));
        pause(3000);
        //send mess
        wd.switchTo().alert().sendKeys("text");
    }

    public void clickOnWindowButton() {
        System.out.println(wd.getWindowHandles());
        click(By.id("windowButton"));
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));
    }


    public boolean isText() {
        return isElementPresent(By.xpath("//span[.='Click Button to see alert']"));
    }
}
