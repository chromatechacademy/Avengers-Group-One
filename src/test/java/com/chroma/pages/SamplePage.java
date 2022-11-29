package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class SamplePage {

    // Store page elements using @FindBy

    @FindBy(xpath = "xpath goes here")
    public WebElement sampleElement;

    // Use a constructor to initialize all page elements, else you will get a
    // NullPointerException

    /**
     * Below method is a sample method of how you can use a dynamic xpath
     * @param text
     * @return
     */
    public static WebElement sampleDynamicMethod(String text) {

        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    public SamplePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
