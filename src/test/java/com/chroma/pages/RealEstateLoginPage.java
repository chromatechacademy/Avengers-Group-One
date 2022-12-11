package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class RealEstateLoginPage {
    /* Email Text Box */
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement realEstateLoginEmailTextBox;

    /* Password Text Box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement realEstateLoginPasswordTextBox;

    /* Login Button */
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement realEstateLoginButton;

    /* Hello, Admin text */
    @FindBy(xpath = "//h1[normalize-space()='Hello, Admin']")
    public WebElement realEstateLoginHelloAdminText;

    public RealEstateLoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
