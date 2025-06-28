package com.thetestingacademy.ex_selenium.ex_26062025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class lab16 {
    @Test
    public void testVwoLoginNegative() {
        // ID, ClassName, Name, Link and Partial

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.id("sex-0")).click();

        // TagNAME and Xpath, Css Selector


    }


}
