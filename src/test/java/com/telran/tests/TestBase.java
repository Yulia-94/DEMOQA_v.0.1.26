package com.telran.tests;


import com.telran.applications.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeMethod
    public void startLogger(Method m){
        logger.info("Start test - >" +m.getName());
    }

    @AfterMethod(alwaysRun = true)
    public void endLogger(Method m){
        logger.info("End of test -> "+m.getName() + "\n************************************");
    }


    @BeforeClass
    public void setUp() throws IOException {
        app.start();


    }

    @AfterClass
    public void tearDown(){
        app.stop();


    }
}
