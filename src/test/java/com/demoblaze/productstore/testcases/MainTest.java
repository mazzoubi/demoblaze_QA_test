package com.demoblaze.productstore.testcases;

import com.demoblaze.productstore.bases.BaseTest;
import com.demoblaze.productstore.pages.*;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @Test(priority = 1,description = "Verify register with random user")
    public void verifyRegister(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.onClickRegister();
        signUpPage.fillUserNameAndPassword();
    }


    @Test(priority = 2,description = "Verify login to the web site web using username and password")
    public void loginToTheWebSiteWebUsingUsernameAndPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.onClickLoginTab();
        loginPage.fillUsernameAndPasswordInput();
        loginPage.checkIfLoginSuccess();
    }

    @Test(priority = 3, description = "Choose random item")
    public void chooseRandomItem(){
        HomePage homePage = new HomePage(driver);
        homePage.chooseRandomItem();
    }

    @Test(priority = 4, description = "Add items to the cart")
    public void addItemsToTheCart(){
        ProductInfoPage productInfoPage = new ProductInfoPage(driver);
        productInfoPage.onClickAddToCart();
        productInfoPage.onClickAddToCart();
        productInfoPage.returnToTheHomePage();
    }

    @Test(priority = 5 , description = "verify cart products")
    public void verifyCartProducts(){
        CartPage cartPage = new CartPage(driver);
        cartPage.oncClickCartTab();
        cartPage.deleteRandomItemFromCart();
        cartPage.onClickCheckoutButton();
    }

    @Test(priority = 6,description = "Verify complete to checkout")
    public void completeToCheckout(){
        CompleteCheckoutPage completeCheckoutPage = new CompleteCheckoutPage(driver);
        completeCheckoutPage.fillUserData();

    }
}
