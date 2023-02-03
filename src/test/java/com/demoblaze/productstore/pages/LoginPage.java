package com.demoblaze.productstore.pages;

import com.demoblaze.productstore.bases.BasePage;
import com.demoblaze.productstore.bases.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login2")
    WebElement loginTab;
    @FindBy(id = "loginusername")
    WebElement usernameInput;
    @FindBy(id = "loginpassword")
    WebElement passwordInput;

    @FindBy(id = "nameofuser")
    WebElement nameOfUserText;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    WebElement loginButton;


    public void onClickLoginTab(){
        loginTab.click();
    }

    public void fillUsernameAndPasswordInput(){
        usernameInput.sendKeys("mazzoubi");
        passwordInput.sendKeys("123456");
        loginButton.click();
    }

    public void checkIfLoginSuccess(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        Assert.assertTrue(nameOfUserText.isDisplayed());
    }


}