package com.telran.applications;

import com.google.common.io.Files;
import com.telran.models.ModelBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class HelperBase {
    WebDriver wd;



    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void setWd(WebDriver wd) {
        this.wd = wd;
    }


    public void type(By locator, String text) {
        if(text != null) {
            click(locator);
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }
    public void attachPhoto(By locator, File file) {
        if(file!=null) {
            wd.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }


    public void typeWithJSE(By local, String text){
        if(text != null){
            JavascriptExecutor js = (JavascriptExecutor) wd;
            js.executeScript("window.scrollBy(0,300");
            click(local);
            wd.findElement(local).clear();
            wd.findElement(local).sendKeys(text);
        }
    }

    public void click(By locator) {
        try {
           //wd.findElement(locator).click();
           Actions actions =new Actions(wd);
          actions.moveToElement(wd.findElement(locator)).click().perform();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        /*
         * org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <textarea name="about" cols="30" rows="10" placeholder="About (max 500 chars)" class="has-error" style="border: 2px solid red;"></textarea> is not clickable at point (1190, 14). Other element would receive the click: <section class="container header">...</section>
         * */


    }
    public void typeByElement(WebElement element, String text) {

        element.click();
        element.clear();
        element.sendKeys(text);
    }
    public void typeByCss(String cssSelector, String text) {
        clickByCss(cssSelector);
        wd.findElement(By.cssSelector(cssSelector)).clear();
        wd.findElement(By.cssSelector(cssSelector)).sendKeys(text);
    }

    public void clickByCss(String cssSelector) {
        wd.findElement(By.cssSelector(cssSelector)).click();
    }

    public void clickByxPath(String xPathSelector) {
        wd.findElement(By.xpath(xPathSelector)).click();
       // Actions actions =new Actions(wd);
     //   actions.moveToElement(wd.findElement(By.id(xPathSelector))).click().perform();
    }
    public void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size()>0;
    }

    public void takeScreenshot(String pathToFile){
        File tmp = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
        File screenshot = new
                File(pathToFile);

        try {
            Files.copy(tmp, screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void type(ModelBase modelBase) {

        System.out.println("I can fill fild1 ->"+modelBase.getFild1());
        System.out.println("I can fill fild2 ->"+modelBase.getFild2());
    }
}
