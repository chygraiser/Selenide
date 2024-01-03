package com.sergii.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class Tests {

    @Test
    public void downloadTest() throws InterruptedException {

        Selenide.open("https://the-internet.herokuapp.com/download");
        Configuration.downloadsFolder = "C:/Users/Noname/Downloads";
        Configuration.timeout = 3000;

        SelenideElement webElement = $(By.xpath("//a[normalize-space()='1.png']"));

        Thread.sleep(3000);

        try {
            webElement.download();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Thread.sleep(2000);

    }

    @Test
    public void uploadTest() throws InterruptedException {

        Selenide.open("https://the-internet.herokuapp.com/upload");
        Configuration.timeout = 3000;

        $(By.cssSelector("#file-upload")).uploadFile(new File("src\\test\\resources\\homeWork21.txt"));

        Thread.sleep(3000);

        $(By.cssSelector("#file-submit")).click();

        String actual_text = $(By.cssSelector("h3")).getText();

        Assert.assertEquals(actual_text, "File Uploaded!");

        Thread.sleep(2000);

    }



}
