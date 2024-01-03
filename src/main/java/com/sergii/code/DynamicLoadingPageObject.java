package com.sergii.code;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingPageObject {

    private final SelenideElement hiddenElement = $(By.xpath("//button[normalize-space()='Start']"));

    private final SelenideElement getHiddenElement = $(By.xpath("//h4[normalize-space()='Hello World!']"));

    public void clickStartButton(){

        hiddenElement.click();

    }

    public String checkText() {

        return getHiddenElement.getText();

    }
}
