package com.ucuzabilet.methods;

import com.ucuzabilet.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {
    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public Methods()  {
        driver = BaseTest.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(38))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by) {
        //elementin varlığı tespit edilene kadar bekle.
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //tıklama özelliği
    public void click(By by) {
        findElement(by).click();
    }

    //bekleme özelliği
    public void waitBySecond(long seconds) {
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //input'a değer atama
    public void sendKeys(String text, By by) {
        findElement(by).clear();
        findElement(by).sendKeys(text);
        ;
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public void scrollWithAction(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();

    }

    public void randomAdd(By by) {
        List<WebElement> elementList =driver.findElements(by);
        Random random = new Random();
        int randomPicker = random.nextInt(elementList.size());
        elementList.get(randomPicker).click();
    }

    public void jsClick(By by) {
        jsdriver.executeScript("arguments[0].click();",findElement(by));
    }

    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text){
        getSelect(by).selectByVisibleText(text);
    }

    public String getText(By by){
        return findElement(by).getText();
    }
}
