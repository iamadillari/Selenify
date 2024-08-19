package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignIn {
    WebDriver driver;

    @Test
    public void testLocators() throws InterruptedException {
        driver = new SafariDriver();
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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
        String infoMsg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        System.out.println(infoMsg);
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
        //driver.findElement(By.cssSelector())
        //enter password..
        //xpath for password field..."//input[@type="password"]"
        //css for password field..."input[type='password']"
        //we'll create locator for password field usign regex to handle dynamic elements as below..
        // "input[type*='pass']"
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id=\"chkboxOne\"]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id=\"chkboxTwo\"]")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
