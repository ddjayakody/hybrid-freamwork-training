package com.wiley.test.driverandwindowtest;

import com.wiley.config.Configuration;
import com.wiley.config.CustomizableConfig;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestConfig implements CustomizableConfig  {
    public static String url = "";
    @Override
    public void set() {
       // url ="";
       // Configuration.browser = "gecko";
       // Configuration.customCaps = new DesiredCapabilities();
       // System.setProperty("teasy.browser","gecko");
       // System.setProperty("teasy.headless", "true");

    }
}
