package com.thetestingacademy.ex_selenium.ex_26062025;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class lab02 {
    @Test
    public void test_001() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();

    }
}
