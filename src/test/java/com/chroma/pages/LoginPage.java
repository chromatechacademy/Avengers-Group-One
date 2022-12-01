package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class LoginPage {

    /* Username Text Box */
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTextBox;

    /* Password Text Box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    /* SignIn button */
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    /* Invalid Username or Password text */
    @FindBy(xpath = "//div[normalize-space()='Invalid Username or Password']")
    public WebElement invalidUsernameOrPasswordText;

    public LoginPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
