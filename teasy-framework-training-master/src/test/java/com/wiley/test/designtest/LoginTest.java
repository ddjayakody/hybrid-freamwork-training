package com.wiley.test.designtest;

import com.wiley.holders.DriverHolder;
import com.wiley.teasy.automation.api.loginservice.AuthenticationService;
import com.wiley.teasy.automation.api.loginservice.UserModel;
import com.wiley.teasy.automation.ui.functions.base.MyApplicationBaseTest;
import com.wiley.teasy.automation.ui.pages.design.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends MyApplicationBaseTest {



    @Test
    public void verifyCourseSelection(){
        openApplication();

    }

    @Test
    public void verifyPasswordValidation(){
        openApplicationForErrorValidation();


    }



    @Test
    public void verifyCourseSelectionWithAPI(){
        openApplication();

    }

}
