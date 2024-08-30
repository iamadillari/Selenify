package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;

public class UseOfParent {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();    //maximized window still has a title bar and other window controls
        Thread.sleep(3000);
        driver.manage().window().fullscreen(); //while a full-screen window does not
        Thread.sleep(2000);
        List<WebElement> headerElements = driver.findElements(By.xpath("//header/div/button[1]/parent::div"));
        for(WebElement element : headerElements)
        {
            System.out.println(element.getText());
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
