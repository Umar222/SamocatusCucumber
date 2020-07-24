package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public void clickButton(){
        $(By.xpath("//b[text()=\"Categories\"]")).click();
    }
}
