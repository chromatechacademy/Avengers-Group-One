package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class AgentPage {

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement userNameTextbox;
    @FindBy(xpath = "//input[@placeholder='Password'")
    public WebElement passwordTextbox;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentsButton;
    @FindBy(xpath = "//button[normalize-space()='Add Now']")
    public WebElement addNowButton;

    @FindBy(xpath = "//body//main//aside//ul//button[1]")
    public WebElement memberListButton;
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement activeButton;
    @FindBy(xpath = "//a[normalize-space()='Inactive']")
    public WebElement inactiveButton;
    @FindBy(xpath = "//a[normalize-space()='All Agents']")
    public WebElement allAgentButton;

    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    public WebElement dashboardButton;
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public WebElement projectButton;
    @FindBy(xpath = "//th[normalize-space()='Name']")
    public WebElement nameButton;
    @FindBy(xpath = "//th[normalize-space()='Mail']")
    public WebElement mailButton;
    @FindBy(xpath = "(//th[normalize-space()='Contact Number'])[1]")
    public WebElement contactNumberButton;
    @FindBy(xpath = "//th[normalize-space()='Actions']")
    public WebElement actionButton;

    public AgentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
