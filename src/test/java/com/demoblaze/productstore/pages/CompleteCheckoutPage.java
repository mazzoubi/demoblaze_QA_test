package com.demoblaze.productstore.pages;

import com.demoblaze.productstore.bases.BasePage;
import com.demoblaze.productstore.utils.ConfigUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteCheckoutPage extends BasePage {
    public CompleteCheckoutPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "name")
    WebElement nameInput;
    @FindBy(id = "country")
    WebElement countryInput;
    @FindBy(id = "city")
    WebElement cityInput;
    @FindBy(id = "card")
    WebElement cardNoInput;
    @FindBy(id = "month")
    WebElement expiryMothInput;
    @FindBy(id = "year")
    WebElement expiryYearInput;


    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    WebElement submitButton;

//    @FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
//    WebElement doneButton;




    public void fillUserData(){
        nameInput.sendKeys(ConfigUtil.getInstance().getName());
        countryInput.sendKeys(ConfigUtil.getInstance().getCountry());
        cityInput.sendKeys(ConfigUtil.getInstance().getCity());
        cardNoInput.sendKeys(ConfigUtil.getInstance().getCreditCardNo());
        expiryMothInput.sendKeys(ConfigUtil.getInstance().getCreditCarExpiryMonth());
        expiryYearInput.sendKeys(ConfigUtil.getInstance().getCreditCarExpiryYear());

        submitButton.click();
//        doneButton.click();
    }


}
