package com.demoblaze.productstore.pages;

import com.demoblaze.productstore.bases.BasePage;
import com.demoblaze.productstore.bases.BaseTest;
import com.demoblaze.productstore.utils.DriverUtil;
import com.demoblaze.productstore.utils.UserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;

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
        usernameInput.sendKeys(UserUtil.getInstance().getUsername());
        passwordInput.sendKeys(UserUtil.getInstance().getPassword());
//        usernameInput.sendKeys("mazzoubi");
//        passwordInput.sendKeys("123456");
        loginButton.click();
    }

    public void checkIfLoginSuccess(){
        DriverUtil.waitVisibility(1);
        Assert.assertTrue(nameOfUserText.isDisplayed());
    }


}
