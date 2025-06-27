package com.thetestingacademy.ex_selenium.ex_26062025;

import org.openqa.selenium.edge.EdgeDriver;

public class lab06 {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://sdet.live");

    }

}
