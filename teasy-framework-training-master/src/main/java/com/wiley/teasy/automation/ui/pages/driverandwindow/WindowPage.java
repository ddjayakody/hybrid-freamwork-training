package com.wiley.teasy.automation.ui.pages.driverandwindow;

import com.wiley.elements.TeasyElement;
import com.wiley.elements.conditions.window.WindowMatcher;
import com.wiley.holders.DriverHolder;
import com.wiley.page.BasePage;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.net.URL;

public class WindowPage extends BasePage {

    private TeasyElement getRefreshEl() {
        return element(By.id("refreshEl"));
    }

    public WindowPage checkRefreshElIsDisplayed() {
        getRefreshEl().should().beDisplayed();
        return this;
    }

    public WindowPage refresh() {
        //DriverHolder.getDriver().navigate().refresh();
       window().refresh();
        return this;

    }

    public WindowPage clickNewWindow() {
        element(By.id("goToNewWindow")).click();
        return this;
    }

    public WindowPage clickNewWindowTab() {
        element(By.id("goToNewWindowTab")).click();
        window().switchToLast();
        return this;
    }

    public WindowPage checkSecondWindowText() {
        element(By.id("mainText")).should().haveText("Hi I am new window");
        return this;
    }

    public WindowPage checkSecondWindowTabText() {
        element(By.id("mainText")).should().haveText("Hi I am new window tab");
        return this;
    }
    public WindowPage checkFirstWindowText() {
        element(By.id("mainText")).should().haveText("Hi I am original window");
        return this;
    }
    public WindowPage goBack() {
        window().back();
        return this;
    }
    public WindowPage goForward() {
        window().forward();

        return this;
    }

    public WindowPage navigateTo(String url) {
        window().navigateTo(url);

        return this;
    }
    public WindowPage navigateTo(URL url) {
        window().navigateTo(url);
        return this;
    }
    public WindowPage checkURL(String url) {
        Assertions.assertThat(window().getUrl()).contains(url);
        return this;
    }

    public WindowPage switchToMain(){
        window().switchTo(WindowMatcher.byTitle("Window Main"));
        return this;
    }


}
