package com.testing.DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect01 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);
        //dropdown with select tag
        WebElement currencyDropDownWebElement = driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
        Select selectCurrencyDropDownElement = new Select(currencyDropDownWebElement);
        selectCurrencyDropDownElement.selectByValue("AED");//selecting currency option based on value
        WebElement selectedCurrency = selectCurrencyDropDownElement.getFirstSelectedOption();
        System.out.println(selectedCurrency.getText());
        selectCurrencyDropDownElement.selectByIndex(1);//here we are selecting the element based on index value
        WebElement selectedCurrencyByIndex = selectCurrencyDropDownElement.getFirstSelectedOption();
        System.out.println(selectedCurrencyByIndex.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
