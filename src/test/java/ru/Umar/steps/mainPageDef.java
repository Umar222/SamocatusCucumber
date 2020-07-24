package ru.Umar.steps;

import Pages.MainPage;
import io.cucumber.java.en.Then;

public class mainPageDef {
    MainPage mainPage = new MainPage();

    @Then("click {string} button")
    public void clickButton(String arg0) {
        mainPage.clickButton();
    }
}
