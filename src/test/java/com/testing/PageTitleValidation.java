package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageTitleValidation {

    public static WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new SafariDriver();
        driver.get("https://rahulshettyacademy.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void validatePageTitle() throws InterruptedException {
        //TC01: check the title of this page.
        String expectedTitle = "Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Validating Title of the page!!");
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }


}
