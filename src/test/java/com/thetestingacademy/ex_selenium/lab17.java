package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class lab17 {
    @Test
    public void test_error_free_trail() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://vwo.com/free-trial/");
        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("987656789dasdasd");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();


        WebElement error_message = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");


        driver.quit();


    }
}
