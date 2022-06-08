package com.ucuzabilet.test;

import com.ucuzabilet.driver.BaseTest;
import com.ucuzabilet.pages.HomePage;
import com.ucuzabilet.pages.TicketPage;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage;
    TicketPage ticketPage;
    @Before
    public void forStart() {
        homePage = new HomePage();
        ticketPage = new TicketPage();
    }



    @Test
    public void homePageControlTest() {
       // HomePage homePage = new HomePage();
        homePage.homePageControl();
    }
    @Test
    public void whereToFromTest() {
        HomePage homePage = new HomePage();
        homePage.whereToFrom();
        homePage.date();
       // homePage.changePassenger();
        homePage.goToBuyTickets();
        ticketPage.ticketPageControl();
        ticketPage.selectFlight();
        ticketPage.selectFlightControl();
        ticketPage.enterPassengerInfo();

    }
}
