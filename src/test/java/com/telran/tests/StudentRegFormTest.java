package com.telran.tests;


import com.telran.models.StudentRegForm;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentRegFormTest extends TestBase {

    @Test
    public void studentRegFormTest() throws InterruptedException {
        app.student().selectItemForms();
        app.student().selectPracticeForm();
        app.student().fillRegForm(new StudentRegForm().withfName("Yulia").withlName("Rosenblum").withEmail("yrosemb@gmail.com")
                .withGender("Male").withPhone("0587337371").withbDay("18 May 1994").withSubject("m").withHoddies("Sport,Music")
                .withAdress("Mahal 23/12").withState("NCR").withCity("Delhi"));
        app.student().changePhoto("C:\\Users\\Юля\\Documents\\GitHub\\DEMOQA_v.0.1.26\\src\\test\\resources\\picture.jpg");
        app.student().pause(1000);
        app.student().clickSubmitButton();
        app.student().pause(3000);

        Assert.assertTrue(app.student().isCloseList());

    }

}
