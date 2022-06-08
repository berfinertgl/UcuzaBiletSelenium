package com.ucuzabilet.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable--gpu");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize(); //ekranı büyültecek.
        driver.get("https://www.ucuzabilet.com/"); //ucuza bilet anasayfası açılır.
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
