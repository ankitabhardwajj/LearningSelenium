package com.thetestingacademy.ex_selenium.ex_28062025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab21 {
    @Test
    public void testVwoLoginNegative() {

        // How to find the elements
        // Selenium
        // ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath


        // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        // FindElement -> 1 element first web element
        // FindElements -> which can find multiple web elements

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


        // 1. Find the email inputbox and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");


        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");


        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

//        // After 3 seconds error comes
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        WebElement error_message = driver.findElement(By.className("notification-box-description"));

        // Condition
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(error_message));
//        wait.until(ExpectedConditions.elementToBeClickable())
        // checkVisibilityOfAndTextToBePresentInElement(driver,)

        wait.until(ExpectedConditions.textToBePresentInElement(error_message, "Your email, password, IP address or location did not match"));


        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");


        driver.quit();


    }

}

