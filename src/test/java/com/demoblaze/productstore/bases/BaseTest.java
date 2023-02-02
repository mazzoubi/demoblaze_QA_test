package com.demoblaze.productstore.bases;

import com.demoblaze.productstore.factories.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver ;

    @BeforeMethod
    public void setUp(){
        driver = new DriverFactory().initDriver();
    }

    @AfterMethod
    public void tradDown(){
//        driver.quit();
    }
}
