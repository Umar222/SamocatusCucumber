package ru.Umar.Hooks;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class openBrowse {

    @Before
    public void openPage(){
        open("https://mvnrepository.com/artifact/com.codeborne/selenide/5.10.0");
    }
}
