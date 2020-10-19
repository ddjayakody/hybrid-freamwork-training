package com.wiley.teasy.automation.ui.pages.driverandwindow;


import com.wiley.elements.SearchStrategy;
import com.wiley.elements.SearchStrategy.FrameStrategy;
import com.wiley.holders.DriverHolder;
import com.wiley.page.BasePage;
import org.openqa.selenium.By;

public class iFramePage extends BasePage {

    public iFramePage submitValueWithinFrame() {
        element(By.id("txtField")).sendKeys("SampleTest");
        element(By.id("submit"),new SearchStrategy().frameStrategy(FrameStrategy.IN_ALL_FRAMES)).click();
        System.out.println(element(By.id("text")).getText());
        return this;

    }

}
