package com.demoblaze.productstore.utils;

import com.demoblaze.productstore.models.UserModel;
import com.github.javafaker.Faker;

public class UserUtil {

    private static UserModel userModel;

    public static UserModel getInstance() {
        if (userModel == null) {
            userModel = new UserModel(
                    new Faker().internet().emailAddress(),
                    new Faker().internet().password()
            );
            return userModel;
        }
        return userModel;
    }

}
