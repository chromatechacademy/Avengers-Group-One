package com.chroma.utils;

import com.chroma.web.WebDriverUtils;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShots extends WebDriverUtils{
    
    public static String captureScreenShot(String ScreenShotName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		File file = new File(currentDir + "\\ScreenShots");
		if (!file.exists()) {
			file.mkdir();
		}

		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		Date date = new Date();
		String dateTime = dateFormat.format(date.getTime());

		String destination = currentDir + "/ScreenShots/" + dateTime + "_" + ScreenShotName + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
			System.out.println("sucessfully capture screen shot");
		} catch (IOException e) {

			e.printStackTrace();
		}

		return destination;

	}

	public static void deleteScreenShotFolder() {
		String currentDir = System.getProperty("user.dir");
		File file = new File(currentDir + "\\ScreenShots");
		if (!file.exists()) {
			file.mkdir();
		} else {

			String[] entries = file.list();
			for (String s : entries) {
				File currentFile = new File(file.getPath(), s);
				currentFile.delete();
			}

		}
	}

}
