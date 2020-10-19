package com.wiley.teasy.automation.ui.pages.design;

import com.wiley.elements.TeasyElement;
import com.wiley.page.BasePage;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By lblUserName = By.xpath("//div[@id='username']/h3");
    private static final String XPATH_SELECT_TAB_TITLE = "//div[@id='%s']/h3";
    private final By lblLoginUserName = By.xpath("//p[@id='name']");








    protected String replaceValues(String locator, String... values) {
        return String.format(locator, values);
    }





}
