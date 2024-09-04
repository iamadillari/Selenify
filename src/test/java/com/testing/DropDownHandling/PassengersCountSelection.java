package com.testing.DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PassengersCountSelection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(500);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class=\"css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e\" and contains(text(), 'Passengers')]")).click();
        Thread.sleep(2000);

/*        for (int i = 1; i <=5 ; i++) {
            driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
            Thread.sleep(500);
        }
        Thread.sleep(2000);*/
        int i=1;
        while(i<5)
        {
            driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
            i++;
            Thread.sleep(500);
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
