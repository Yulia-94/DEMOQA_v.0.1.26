package com.telran.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertWindows extends TestBase
{

    @Test
    public void testWindows(){
        app.alterWindows().selectItenAler();
        app.alterWindows().selectBrowserWindoes();
        app.alterWindows().clickOnTabButton();

        Assert.assertTrue(app.alterWindows().takeText().contains("page"));

    }

    @Test
    public void testWindows2() throws InterruptedException {
        app.alterWindows().selectItenAler();
        app.alterWindows().selectBrowserWindoes();
        app.alterWindows().clickOnWindowButton();
        app.alterWindows().pause(2000);

        Assert.assertTrue(app.alterWindows().takeText().contains("page"));

    }

    @Test
    public void testAlerts() throws InterruptedException {
        app.alterWindows().selectItenAler();
        app.alterWindows().pause(1000);
        app.alterWindows().selectBrowserAlerts();
        app.alterWindows().pause(1000);
       app.alterWindows().testAlert();


    }
}
