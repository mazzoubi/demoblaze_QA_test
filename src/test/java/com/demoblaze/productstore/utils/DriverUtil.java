package com.demoblaze.productstore.utils;

import com.demoblaze.productstore.bases.BasePage;
import com.demoblaze.productstore.bases.BaseTest;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DriverUtil extends BaseTest {
    public static void waitVisibility(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
}
