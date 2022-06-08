package com.ucuzabilet.pages;

import com.ucuzabilet.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TicketPage {
    Methods methods;

    public TicketPage() {
        methods = new Methods();
    }

    public void ticketPageControl() {
        methods.waitBySecond(2);
        Assert.assertTrue(methods.isElementVisible(By.className("calendarGraphArea")));
        methods.waitBySecond(1);
    }

    public void selectFlight() {
        methods.waitBySecond(2);
        methods.randomAdd(By.cssSelector(".btn-select-flight.web-button-select"));
        methods.waitBySecond(2);
    }

    public void selectFlightControl() {
        methods.waitBySecond(2);
        Assert.assertTrue(methods.isElementVisible(By.className("FlightTable")));
        methods.waitBySecond(1);
    }

    public void enterPassengerInfo() {
        methods.scrollWithAction(By.id("cb-receipt-ok"));
        methods.waitBySecond(1);
      // methods.click(By.xpath("//input[@name='gender_1']"));
        methods.jsClick(By.xpath("//label[@for='rb-female-1']"));
        methods.waitBySecond(1);
        methods.sendKeys("Berfin",By.id("tb-name-1"));
        methods.sendKeys("Ertoglu",By.id("tb-surname-1"));
        methods.sendKeys("20101997",By.id("tb-birthdate-1"));
        methods.waitBySecond(1);
        methods.sendKeys("27880673674",By.id("tb-tckn-1"));
        methods.waitBySecond(1);
        methods.sendKeys("berfin.ertgl@hotmail.com",By.id("contactMail"));
        methods.waitBySecond(1);
        methods.sendKeys("5496871224",By.name("phoneNumber"));
        methods.waitBySecond(1);
        methods.scrollWithAction(By.id("makeResButton"));
        methods.waitBySecond(1);
        methods.sendKeys("Berfin Ertoğlu",By.name("creditCardOwnerName"));
        methods.waitBySecond(1);
        methods.sendKeys("9394 4500 1780 9495",By.name("creditCardNumber"));
        methods.waitBySecond(1);
        methods.click(By.id("creditCardValidMonth"));
        methods.waitBySecond(1);
        methods.selectByText(By.id("creditCardValidMonth"),"06");
        methods.waitBySecond(1);
        methods.click(By.id("creditCardValidYear"));
        methods.waitBySecond(1);
        methods.selectByText(By.id("creditCardValidYear"),"2027");
        methods.sendKeys("923",By.name("creditCardCVC"));
        methods.waitBySecond(1);
        methods.jsClick(By.id("cb-aggrement-rules"));
        methods.waitBySecond(1);
        methods.scrollWithAction(By.id("makeResButton"));
        methods.waitBySecond(1);


        if(methods.isElementVisible(By.id("creditCardNumber-error"))) {
            System.out.println(methods.getText(By.id("creditCardNumber-error")));
        }else{
            methods.jsClick(By.cssSelector(".btn.btn-success.btn-lg"));
            methods.waitBySecond(3);
        }
    }
}
