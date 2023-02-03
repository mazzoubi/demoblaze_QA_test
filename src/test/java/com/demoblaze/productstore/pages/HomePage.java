package com.demoblaze.productstore.pages;

import com.demoblaze.productstore.bases.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void chooseRandomItem(){
        // get all products whose quanity >0
        List<WebElement> productElems = driver.findElements(By.cssSelector("#tbodyid"));
        System.out.println("listsize= "+ productElems.size());
        // get the len of productElems
        int maxProducts = productElems.size();
        // get random number
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        // Select the list item
        productElems.get(randomProduct).findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();

    }


}
