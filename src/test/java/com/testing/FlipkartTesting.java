package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class FlipkartTesting {

    @Test
    public void launchGoogleOnSafari() throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'Fashion')]")).click();

        driver.findElement(By.xpath("//a[@class=\"_1BJVlg _11MZbx\"]")).click();
        Thread.sleep(3000);
        WebElement menHeader = driver.findElement(By.xpath("//span[@class='TSD49J' and  contains(text(),\"Men\")]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menHeader).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Backpacks']")).click();
        driver.quit();
    }

}


//