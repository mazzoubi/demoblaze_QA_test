package com.demoblaze.productstore.pages;

import com.demoblaze.productstore.bases.BasePage;
import com.demoblaze.productstore.utils.ConfigUtil;
import com.demoblaze.productstore.utils.DriverUtil;
import com.demoblaze.productstore.utils.UserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.time.Duration;

public class SignUpPage extends BasePage {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "signin2")
    WebElement registerButton;


    @FindBy(id = "sign-username")
    WebElement usernameInput;

    @FindBy(id = "sign-password")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    WebElement signUpButton;

    public void onClickRegister(){
        registerButton.click();
    }

    public void fillUserNameAndPassword(){
        usernameInput.sendKeys(UserUtil.getInstance().getUsername());
        passwordInput.sendKeys(UserUtil.getInstance().getPassword());
        signUpButton.click();
        DriverUtil.waitVisibility(1);
        verifyIsCreatedUserAlertMessage();
    }

    public void verifyIsCreatedUserAlertMessage(){
        String message =driver.switchTo().alert().getText().toString();
        driver.switchTo().alert().accept();
        Assert.assertTrue( message.equals("Sign up successful."));
    }


}
