package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ForgotPasswordClick {
    WebDriver driver = new ChromeDriver();

    @Test
    public void testLocators() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("inputUsername")).sendKeys("aditya");
        driver.findElement(By.name("inputPassword")).sendKeys("password123");
        driver.findElement(By.className("signInBtn")).click();
        String errorMsg = driver.findElement(By.className("error")).getText();
        //String errorMsg = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println(errorMsg);
        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Alex");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Alex.ansbro@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("aman.gupta@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("97723131331");
        driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
        String infoMsg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        System.out.println(infoMsg);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
