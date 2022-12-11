package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;

public class RealEstateLoginStepImpl extends PageInitializer {




/**
 * Use this method to login the Real estate website
 * 
 * @param realEstateLoginEmail
 * @param realEstateLoginPassword
 */


    public static void realEstateLogin(String realEstateLoginEmail, String realEstateLoginPassword) {
        realEstateLoginPage.realEstateLoginEmailTextBox.sendKeys(realEstateLoginEmail);
        realEstateLoginPage.realEstateLoginPasswordTextBox.sendKeys(realEstateLoginPassword);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        realEstateLoginPage.realEstateLoginButton.click();

    }

}
