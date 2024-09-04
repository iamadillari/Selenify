package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class WIndowActivities {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");//basically it will wait to load the page until last element of webpage loaded and inbuilt waits are there
        Thread.sleep(1500);
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");//but here it will not wait as above, we need to use waits for any sync
        Thread.sleep(2500);
        driver.navigate().back();//this method will basically help you to go back to previous URL..
        Thread.sleep(2000);
        driver.quit();
    }
}
