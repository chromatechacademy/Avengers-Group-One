package com.chroma.utils;

import com.chroma.web.WebDriverUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class CucumberLogUtils extends WebDriverUtils {

    public static Scenario scenario;
    public static String screenshotdir;

    /**
     * USE BELOW METHOD TO ATTACH SCREENSHOTS TO MAVEN CUCUMBER HTML REPORTS
     */
    public static void logScreenShot() {
        if (scenario == null) {
            return;
        } else {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); // attach to the report
        }
    }

    public static String getScreenShot() throws IOException {

        File src = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
        String sDate = sdf.format(date);
        String filePath = System.getProperty("user.dir") + "/test-output/screenshots/image_" + sDate + ".png";
        FileUtils.copyFile(src, new File(filePath));

        return filePath;
    }

    /*
     * USE BELOW METHOD TO ATTACH SCREENSHOT TO EXTENT REPORTS
     */
    public static void logExtentScreenshot() {

        try {
            ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(getScreenShot());
        } catch (Exception e) {
            e.printStackTrace();
        }

      
    }
}
