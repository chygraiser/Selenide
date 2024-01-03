package com.sergii.tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void firstTest(){
        Selenide.open("https://the-internet.herokuapp.com/download");
    }
}
