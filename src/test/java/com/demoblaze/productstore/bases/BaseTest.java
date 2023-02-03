package com.demoblaze.productstore.bases;

import com.demoblaze.productstore.factories.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver ;

    @BeforeClass
    public void setUp(){
        driver = new DriverFactory().initDriver();
    }

    @AfterClass
    public void tradDown(){
        driver.quit();
    }
}
