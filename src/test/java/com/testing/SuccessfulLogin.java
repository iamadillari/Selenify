package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class SuccessfulLogin {
    WebDriver driver;
    String userName;

    @Test
    public void testLocators() throws InterruptedException {
        userName = "Adil";
        driver = new SafariDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();//this is an alternate solution for maximise the window, if window is not maximised using above
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("rahulshettyacademy");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id=\"chkboxOne\"]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id=\"chkboxTwo\"]")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        Thread.sleep(2000);
        String userNameAppeared = driver.findElement(By.cssSelector("[class ='login-container'] h2")).getText();
        String expectedUserNameMessage = "Hello "+userName+",";
        Assert.assertEquals(userNameAppeared,expectedUserNameMessage,"Validating UserName after Successful Login...");
        String loginMessage = driver.findElement(By.tagName("p")).getText();
        String expectedMessage = "You are successfully logged in.";
        Assert.assertEquals(loginMessage, expectedMessage, "Validating Login Message!!");
        driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}
