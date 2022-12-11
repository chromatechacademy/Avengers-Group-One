package com.chroma.stepsImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class RealEstateValidateDashboardGraphStepImpl extends PageInitializer {
    /**
     *  Use this method to select Dashboard Option
     * 
     * @param dashboardOption
     * @return
     */
    public static WebElement dashboardOption(String dashboardOption) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + dashboardOption + "')]"));
    }

    /**
     * Use this method to locate Graph Header text
     * 
     * @param actualGraphHeaderText
     * @return
     */
    public static WebElement graphHeaderTextLocator (String actualGraphHeaderText) {
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + actualGraphHeaderText + "')]"));
    }

    /**
     * Use this method to Asser Graph Header text
     * 
     * @param expectedGraphHeaderText
     */
    public static void graphHeaderTextAssert(String expectedGraphHeaderText) {
                String actualGraphHeaderText = RealEstateValidateDashboardGraphStepImpl
                .graphHeaderTextLocator(expectedGraphHeaderText).getText();
        CommonUtils.assertEquals(actualGraphHeaderText, expectedGraphHeaderText);
    }

}