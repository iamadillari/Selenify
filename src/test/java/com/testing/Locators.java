package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Locators {

    @Test
    public void testLocators()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("aditya");
        driver.findElement(By.name("inputPassword")).sendKeys("password123");
        driver.findElement(By.className("signInBtn")).click();
        driver.quit();
    }

}
