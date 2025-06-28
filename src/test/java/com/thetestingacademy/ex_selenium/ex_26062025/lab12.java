package com.thetestingacademy.ex_selenium.ex_26062025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class lab12 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("Verified");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        driver.quit();

    }
}
