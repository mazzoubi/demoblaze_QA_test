package com.demoblaze.productstore.pages;

import com.demoblaze.productstore.bases.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[4]/a")
    WebElement cartTab;


    public void aa (){
        cartTab.click();
        int index = 0;
        WebElement baseTable = driver.findElement(By.id("tbodyid"));
        List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
        System.out.println(tableRows.size()+ " size");
//        tableRows.get(index).getText();
    }
}
