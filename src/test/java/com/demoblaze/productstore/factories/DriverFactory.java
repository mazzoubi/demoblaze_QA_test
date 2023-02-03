package com.demoblaze.productstore.factories;

import com.demoblaze.productstore.utils.ConfigUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class DriverFactory {
    public WebDriver initDriver(){
        WebDriver driver;
        String browser = System.getProperty("browser","CHROME");
        switch (browser){
            case "CHROME":
//                ChromeOptions options  = new ChromeOptions();
//                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//                driver = new ChromeDriver(options);

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
//                FirefoxOptions options1 = new FirefoxOptions();
//                options1.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//                driver = new FirefoxDriver(options1);
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "EDGE":
//                EdgeOptions options2 = new EdgeOptions();
//                options2.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//                driver = new EdgeDriver(options2);
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            default:
                throw new RuntimeException("The browser dose not supported");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(ConfigUtil.getInstance().getBaseUrl());
        return driver;

    }

}
