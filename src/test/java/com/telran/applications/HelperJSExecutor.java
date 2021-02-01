package com.telran.applications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HelperJSExecutor extends HelperBase {
    public HelperJSExecutor(WebDriver wd) {
        super(wd);
    }

    public void clickItemElement() {
        clickByxPath("//div[@class='category-cards']/div[1]");
    }

    public void selectTextBox() {
        click(By.xpath("//span[.='Text Box']"));
    }

    public void typeJS(String name, String email) {
        if (name != null && email != null) {
            JavascriptExecutor js = (JavascriptExecutor) wd;
            js.executeScript("document.getElementById('userName').value='" + name + "';");
        }
    }

    public void clickSubmitButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('footer').staly.display='none';");
       pause(3000);
        js.executeScript("document.getElementById('submit').click();");
        pause(3000);
        js.executeScript("document.getElementById('submit').style.backgroundColor='Red';");
        pause(3000);
    }

}
