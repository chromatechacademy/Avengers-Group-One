package com.chroma.web;

import java.time.Duration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import com.chroma.utils.ConfigReader;
import com.chroma.utils.FrameworkConstants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class WebDriverUtils {

    public static WebDriver driver;

    public static void setUp() {

        ConfigReader.readProperties(FrameworkConstants.CONFIGURATION_FILEPATH);

        String osName = FrameworkConstants.GET_OS_NAME;

        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("chrome")) {

            if (osName.contains("Windows")) {
                WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            } else if (osName.contains("Mac")) {
                WebDriverManager.chromedriver().operatingSystem(OperatingSystem.MAC).setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            } else if (osName.contains("Linux")) {
                WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(true);
                driver = new ChromeDriver(chromeOptions); 
            }

        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("edge")) {

            if (osName.contains("Windows")) {
                WebDriverManager.edgedriver().operatingSystem(OperatingSystem.WIN).setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            } else if (osName.contains("Mac")) {
                WebDriverManager.edgedriver().operatingSystem(OperatingSystem.MAC).setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            } else if (osName.contains("Linux")) {
                WebDriverManager.edgedriver().operatingSystem(OperatingSystem.LINUX).setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            }

        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("firefox")) {
            if (osName.contains("Windows")) {
                WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            } else if (osName.contains("Mac")) {
                WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.MAC).setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            } else if (osName.contains("Linux")) {
                WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
                FirefoxOptions fireOptions = new FirefoxOptions();
                fireOptions.setHeadless(true);
                driver = new FirefoxDriver(fireOptions);
            } 

        } else if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("mobile")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            if (ConfigReader.getPropertyValue("platformName").equalsIgnoreCase("iOS")) {
                MutableCapabilities caps = new MutableCapabilities();
                caps.setCapability("platformName", "iOS");
                caps.setCapability("browserName", "Safari");
                caps.setCapability("appium:deviceName", "iPhone 13 Simulator");
                caps.setCapability("appium:platformVersion", "16.1");
                caps.setCapability("appium:automationName", "XCUITest");
                MutableCapabilities sauceOptions = new MutableCapabilities();
                sauceOptions.setCapability("appiumVersion", "2.0.0");
                sauceOptions.setCapability("build", "<your build id>");
                sauceOptions.setCapability("name", "<your test name>");
                caps.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new IOSDriver(new URL(ConfigReader.getPropertyValue("sauceUrl")), caps);
                } catch (Exception e) {
                    System.out.println("exception occured");
                    e.printStackTrace();
                }
            } else {
                MutableCapabilities caps = new MutableCapabilities();
                caps.setCapability("platformName", "Android");
                caps.setCapability("browserName", "Chrome");
                caps.setCapability("appium:deviceName", "Google Pixel 4a (5G) GoogleAPI Emulator");
                caps.setCapability("appium:platformVersion", "12.0");
                caps.setCapability("appium:automationName", "UiAutomator2");
                MutableCapabilities sauceOptions = new MutableCapabilities();
                sauceOptions.setCapability("appiumVersion", "1.22.1");
                sauceOptions.setCapability("build", "<your build id>");
                sauceOptions.setCapability("name", "<your test name>");
                caps.setCapability("sauce:options", sauceOptions);
                try {
                     driver = new AndroidDriver(new URL(ConfigReader.getPropertyValue("sauceUrl")), caps);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }
        } else {
            throw new RuntimeException("Invalid browser name");
        }

    }

    public static void tearDown() {
        driver.quit();
    }

}
