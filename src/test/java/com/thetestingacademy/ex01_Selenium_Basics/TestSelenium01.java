package com.thetestingacademy.ex01_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void testcode(){

        Assert.assertEquals("Akash","Akash");
    }

    @Test
    public void test_OpenVWOLoginPage(){
        // Open VWO.com, right?
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();


    }

}
