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
    public void testMuli(){
        app.select().clickMultiSelect();

        }
    }


