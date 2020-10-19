package com.wiley.test.driverandwindowtest;


import com.wiley.teasy.automation.ui.functions.base.MyApplicationBaseTest;
import com.wiley.teasy.automation.ui.pages.driverandwindow.iFramePage;
import org.testng.annotations.Test;

public class iframeBehavior extends MyApplicationBaseTest {

    @Test

    public void SwitchToFrameByDefault() {
        openDriverPage("frameWithForm.html", iFramePage.class)
                .submitValueWithinFrame();
    }


}
