package com.telran.tests;

import org.testng.annotations.Test;

public class JSExecutorTest extends TestBase{

    @Test
    public void jsexecutorTest() throws InterruptedException {
        app.jsexecutor().clickItemElement();
        app.jsexecutor().selectTextBox();
        app.jsexecutor().typeJS("Nona", "swsa9@mail.com");
        app.jsexecutor().clickSubmitButton();
    }
}
