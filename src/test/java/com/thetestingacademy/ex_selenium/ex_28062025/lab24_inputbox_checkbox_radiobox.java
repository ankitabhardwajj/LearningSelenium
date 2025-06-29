package com.thetestingacademy.ex_selenium.ex_28062025;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class lab24_inputbox_checkbox_radiobox {
    public static void main(String[] args) {


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        // RADIO Box
        driver.findElement(By.id("sex-1")).click();

        // CheckBox
        driver.findElement(By.id("tool-1")).click();

        driver.quit();
    }
    }
