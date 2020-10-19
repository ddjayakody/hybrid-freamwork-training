package com.wiley.teasy.automation.ui.functions.base;

import com.wiley.actions.StopTestExecutionException;
import com.wiley.assertions.MethodType;
import com.wiley.basetests.SeleniumBaseTest;
import com.wiley.elements.NotFoundElException;
import com.wiley.holders.AssertionsHolder;
import com.wiley.page.BasePage;
import com.wiley.teasy.automation.ui.functions.application.LoginFn;
import com.wiley.teasy.automation.ui.pages.design.MyApplicationBasePage;
import org.testng.ITestResult;

public class MyApplicationBaseTest extends SeleniumBaseTest {


    protected void setThrowable(ITestResult testResult, MethodType methodType) {
        final Throwable testResultThrowable = testResult.getThrowable();

        if (!(testResultThrowable.getCause() instanceof StopTestExecutionException)
                && !(testResultThrowable.getCause() instanceof NotFoundElException)) {
            AssertionsHolder.softAssert().add(testResultThrowable, MethodType.TEST);
        }



    }

    public LoginFn openApplication(){
        //openPage("MyApplication.html",MyApplicationBasePage.class);
        get(MyApplicationBasePage.class,"file://" + getClass().getResource("/html/design/").getPath() + "MyApplication.html");
        return new LoginFn();
    }


    public LoginFn openApplicationForErrorValidation(){
        //openPage("MyApplication.html",MyApplicationBasePage.class);
        get(MyApplicationBasePage.class,"file://" + getClass().getResource("/html/design/").getPath() + "LoginPageError.html");
        return new LoginFn();
    }


    public <E extends BasePage> E openDriverPage(String fileName, Class<E> page) {
        return get(page, "file://" + getClass().getResource("/html/driverandwindow/").getPath() + fileName);
    }
}
