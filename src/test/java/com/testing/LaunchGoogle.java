package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class LaunchGoogle {


    @Test
    public void launchGoogleOnSafari() throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();
    }
}
