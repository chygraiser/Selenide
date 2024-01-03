package com.sergii.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.sergii.code.DynamicLoadingPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPageObject extends DynamicLoadingPageObject {

    @Test
    public void checkHiddenElement() throws InterruptedException {

        Selenide.open("https://the-internet.herokuapp.com/dynamic_loading/1");
        Configuration.timeout = 3000;
        clickStartButton();
        Thread.sleep(6000);
        String valueOfHiddenText = checkText();
        Assert.assertEquals(valueOfHiddenText, "Hello World!");

    }

    @Test
    public void checkRenderedElementAfterFact() throws InterruptedException {

        Selenide.open("https://the-internet.herokuapp.com/dynamic_loading/2");
        Configuration.timeout = 3000;
        clickStartButton();
        Thread.sleep(6000);
        String valueOfHiddenText = checkText();
        Assert.assertEquals(valueOfHiddenText, "Hello World!");

    }

}
