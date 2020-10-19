package com.wiley.test.driverandwindowtest;


import com.wiley.teasy.automation.ui.functions.base.MyApplicationBaseTest;
import com.wiley.teasy.automation.ui.pages.driverandwindow.WindowPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class WindowBehavior extends MyApplicationBaseTest {

    @Test
    //Window().refresh()
    public void refresh()
    {
        openDriverPage("window.html", WindowPage.class)
                .checkRefreshElIsDisplayed()
                .refresh()
                .checkRefreshElIsDisplayed();
    }


    @Test
    public void forwardBackward() {
        openDriverPage("window.html", WindowPage.class)
                .clickNewWindow()
                .checkSecondWindowText()
                .goBack()
                .checkFirstWindowText()
                .goForward()
                .checkSecondWindowText();
    }

    @Test
    public void windowMatcher() {
        openDriverPage("window.html", WindowPage.class)
                .clickNewWindowTab()
                .checkSecondWindowTabText()
                .switchToMain()
                .checkFirstWindowText();

    }


    //window().navigateTo(String) and window().navigateTo(url);;
    @Test
    public void navigateTo() throws MalformedURLException {
        openDriverPage("window.html", WindowPage.class)
                .navigateTo("https://www.wiley.ru/")
                .checkURL("https://www.wiley.ru/")
                .navigateTo(new URL("https://www.wiley.ru/"))
                .checkURL("https://www.wiley.ru/");
    }


}