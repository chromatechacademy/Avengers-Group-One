package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class DashboardPage {

    /* Chroma Tech Academy text */
    @FindBy(xpath = "//span[normalize-space()='Chroma Tech Academy']")
    public WebElement chromaTechAcademyText;

    @FindBy(xpath = "(//*[contains(text(),'Student Information')])[1]")
    public WebElement studentInformationMenuButton;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
