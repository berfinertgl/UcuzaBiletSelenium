package com.ucuzabilet.pages;

import com.ucuzabilet.driver.BaseTest;
import com.ucuzabilet.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    Methods methods;

    //WebDriver driver;

    public HomePage() {
        //   driver = BaseTest.driver;
        methods = new Methods();
    }

    public void homePageControl() {
        methods.waitBySecond(2);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".homepageHeaderH1")));
    }

    public void whereToFrom() {
       /* for(int i=0; i<=3;i++) {
            methods.sendKeys("İst",By.id("from_text"));
            methods.waitBySecond(1);
        }*/
        methods.sendKeys("İst", By.id("from_text"));
        methods.waitBySecond(1);
        methods.jsClick(By.xpath("//li[@data-value='Sabiha Gokcen (SAW) - İstanbul, Türkiye']"));
        methods.waitBySecond(2);
        methods.sendKeys("izm", By.id("to_text"));
        methods.waitBySecond(1);
       // methods.scrollWithAction(By.xpath("//li[@data-value='Izmir Adnan Menderes (ADB) - İzmir, Türkiye']"));
        methods.waitBySecond(2);
        methods.jsClick(By.xpath("//li[@data-value='Izmir Adnan Menderes (ADB) - İzmir, Türkiye']"));
        //   methods.click(By.id("ui-id-10"));
        methods.waitBySecond(2);
    }

    public void date() {
        methods.randomAdd(By.xpath("//td[@data-handler='selectDay']"));
        methods.waitBySecond(3);
    }

    /*public void changePassenger() {
        methods.click(By.className("passenger-search-list"));
        methods.waitBySecond(3);
        methods.randomAdd(By.cssSelector(".input-group-append"));
        methods.waitBySecond(3);
        methods.randomAdd(By.cssSelector(".input-group-prepend"));
        methods.waitBySecond(3);
    }*/

    public void goToBuyTickets() {
        methods.click(By.id("searchFormSubmit"));
        methods.waitBySecond(1);
    }
}
