package com.telran.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JSExecutorTest extends TestBase{

    @Test
    public void jsexecutorTest() throws InterruptedException {
        app.jsexecutor().clickItemElement();
        app.jsexecutor().selectTextBox();
        app.jsexecutor().typeJS("Tata", "swsa9@mail.com", "Rehovot", "Tel-aviv");
        app.jsexecutor().clickSubmitButton();
        app.alterWindows().pause(2000);

        Assert.assertTrue(app.jsexecutor().isAvailabilityOfInformation());
    }
}
