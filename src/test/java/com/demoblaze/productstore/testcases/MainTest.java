package com.demoblaze.productstore.testcases;

import com.demoblaze.productstore.bases.BaseTest;
import com.demoblaze.productstore.pages.*;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test(priority = 1,enabled = false)
    public void registerScreen(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.onClickRegister();
        signUpPage.fillUserNameAndPassword();
    }


    @Test(priority = 2)
    public void loginScreen(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.onClickLoginTab();
        loginPage.fillUsernameAndPasswordInput();
        loginPage.checkIfLoginSuccess();
    }

    @Test(priority = 3)
    public void homeScreen(){
        HomePage homePage = new HomePage(driver);
        homePage.chooseRandomItem();
    }

    @Test(priority = 4)
    public void addItemsToTheCart(){
        ProductInfoPage productInfoPage = new ProductInfoPage(driver);
        productInfoPage.onClickAddToCart();
        productInfoPage.onClickAddToCart();
        productInfoPage.returnToTheHomePage();
    }

    @Test(priority = 5)
    public void verifyCartProducts(){
        CartPage cartPage = new CartPage(driver);
        cartPage.aa();
    }
}
