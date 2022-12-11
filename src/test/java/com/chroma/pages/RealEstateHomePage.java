package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class RealEstateHomePage extends PageInitializer {

    /* Add New Project Button */
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public WebElement projectsButton;

    public RealEstateHomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
