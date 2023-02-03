package com.demoblaze.productstore.pages;

import com.demoblaze.productstore.bases.BasePage;
import com.demoblaze.productstore.utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;

public class ProductInfoPage extends BasePage {
    public ProductInfoPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement addToCartButton;
    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
    WebElement homeTab;

    public void onClickAddToCart(){
        addToCartButton.click();
        DriverUtil.waitVisibility(3);
        verifyItemIsAdded();

    }

    public void verifyItemIsAdded(){
        String message =driver.switchTo().alert().getText().toString();
        driver.switchTo().alert().accept();
        Assert.assertTrue( message.equals("Product added."));
    }

    public void returnToTheHomePage(){
        homeTab.click();
    }

}
