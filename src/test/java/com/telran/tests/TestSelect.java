package com.telran.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSelect extends TestBase {

    @BeforeMethod
    public void precondition(){
        app.select().selectItemWidgets();
        app.select().clickSeleckMenu();

        }

        @Test
    public void testMuli() throws InterruptedException {
        //app.select().clickMultiSelect();
            app.select().selectValue("Group 1, option 1");
            app.select().pause(5000);
            app.select().selectMr("Mr.");
            app.select().pause(5000);
            app.select().oldStyleSelectMenu("Black");
            app.select().pause(5000);
            app.select().multiselectdropDown("Green, Blue");
            app.select().pause(5000);
        }
    }


