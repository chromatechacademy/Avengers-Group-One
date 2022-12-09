package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;

public class LoginStepsImpl extends PageInitializer {
    /**
     * Use this step to login
     * 
     * @param username
     * @param password
     */
    public static void login(String username, String password) {
        loginPage.userNameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();

    }
}
