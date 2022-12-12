package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.ConfigReader;
import com.chroma.utils.CucumberLogUtils;

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
        if (!ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            CucumberLogUtils.logScreenShot();
            CucumberLogUtils.logExtentScreenshot();
        }
        loginPage.signInButton.click();

    }
}
