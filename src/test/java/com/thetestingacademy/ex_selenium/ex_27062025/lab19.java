package com.thetestingacademy.ex_selenium.ex_27062025;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class lab19 {


    @Test
    public void test_verify_print_imac_price() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");



        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // #gh-ac
        // input[id="gh-ac"] -> xpath -> //input[@id="gh-ac"]
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='gh-ac']"));
        System.out.println("found");
        searchBox.sendKeys("macmini"); // Find the "macmini"
        System.out.println("typed");

        WebElement searchBoxButton = driver.findElement(By.cssSelector("input[id='gh-ac']"));
        searchBoxButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Print all the titles
        List<WebElement> searchTitles  = driver.findElements(By.cssSelector(".s-item__title"));
        //div[@class="s-item__title"]/span -> 62
        List<WebElement> searchTitlesPrices = driver.findElements(By.cssSelector(".s-item__price"));
        // //span[@class="s-item__price"] -> 61


        // .s-item__title > 63 , .s-item__price ->
        // max -> loop where
        int size = Math.min(searchTitles.size(),searchTitlesPrices.size()); //61
        for(int i = 0; i< size ; i++ ){
            System.out.println("Title: " + searchTitles.get(i).getText() + " || " + "Price: " + searchTitlesPrices.get(i).getText());
            System.out.println();
            // Max price or Min Price - Print it

        }



















        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();

    }
}
