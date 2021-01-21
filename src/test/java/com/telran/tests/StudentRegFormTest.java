package com.telran.tests;


import com.telran.models.StudentRegForm;
import org.testng.annotations.Test;

public class StudentRegFormTest extends TestBase {

    @Test
    public void studentRegFormTest(){
        app.student().selectItemForms();
        app.student().selectPracticeForm();
        app.student().fillRegForm(new StudentRegForm().withfName("").withlName("").withEmail("")
                .withGender("").withPhone("").withbDay("").withSubject("").withHoddies("").withAdress("").withCity(""));
        app.student().clickSubmitButton();

    }

}
