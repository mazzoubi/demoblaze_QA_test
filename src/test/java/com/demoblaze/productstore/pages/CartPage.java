package com.demoblaze.productstore.pages;

import com.demoblaze.productstore.bases.BasePage;
import com.demoblaze.productstore.utils.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[4]/a")
    WebElement cartTab;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
    WebElement checkoutButton;


    public void oncClickCartTab (){
        cartTab.click();

    }



    public void deleteRandomItemFromCart(){
        // get all products whose quanity >0
        WebElement baseTable = driver.findElement(By.id("tbodyid"));
        List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
        // get the len of productElems
        int maxProducts = tableRows.size();
        // get random number
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        // Select the list item
        tableRows.get(randomProduct).findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")).click();
    }

    public void onClickCheckoutButton(){
        DriverUtil.waitVisibility(1);
        checkoutButton.click();
    }
}
