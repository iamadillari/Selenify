package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class FollowingSibling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().fullscreen();
        WebElement loginButton = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[contains(text(),'Login')]"));
        loginButton.click();
        System.out.println(loginButton.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
