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
    public void testAlerts(){
       app.alterWindows().testAlert();

    }
}
