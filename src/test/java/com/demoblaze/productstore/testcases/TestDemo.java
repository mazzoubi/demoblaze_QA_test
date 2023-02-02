package com.demoblaze.productstore.testcases;

import com.demoblaze.productstore.bases.BaseTest;
import com.demoblaze.productstore.pages.SignUpPage;
import org.testng.annotations.Test;

public class TestDemo extends BaseTest {

    @Test
    public void register(){
        SignUpPage signUpPage = new SignUpPage(driver).load();
        signUpPage.onClickRegister();
    }


}
