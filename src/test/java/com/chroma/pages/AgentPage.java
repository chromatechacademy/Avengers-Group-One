package com.chroma.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class AgentPage {
    /**Username Text Box */
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement userNameTextbox;
    /**Password Text Box */
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextbox;
    /**Login Button */
    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;
    /**Agents Button */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentsButton;
    /**Add now button */
    @FindBy(xpath = "//button[normalize-space()='Add Now']")
    public WebElement addNowButton;
    /**Members List Button */
    @FindBy(xpath = "//body//main//aside//ul//li//div//button")
    public WebElement memberListButton;
    /**Active Button */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement activeButton;
    /**Inactive Button */
    @FindBy(xpath = "//a[normalize-space()='Inactive']")
    public WebElement inactiveButton;
    /**All agent button */
    @FindBy(xpath = "//a[normalize-space()='All Agents']")
    public WebElement allAgentButton;
    /**Dashboard Button */
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    public WebElement dashboardButton;
    /**Project Button */
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public WebElement projectButton;
    /**Name Button */
    @FindBy(xpath = "//th[normalize-space()='Name']")
    public WebElement nameButton;
    /**Mail Button */
    @FindBy(xpath = "//th[normalize-space()='Mail']")
    public WebElement mailButton;
    /**Contact Number Button */
    @FindBy(xpath = "(//th[normalize-space()='Contact Number'])[1]")
    public WebElement contactNumberButton;
    /**Action Button */
    @FindBy(xpath = "//th[normalize-space()='Actions']")
    public WebElement actionButton;
    /**Firstname Text Box */
    @FindBy(xpath = "//input[@name='fname']")
    public WebElement firstNameBox;
    /**Lastname Text Box */
    @FindBy(xpath = "//input[@name='lname']")
    public WebElement lastNameBox;
    /**Email Text Box */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailNameBox;
    /**Phone Text Box */
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneBox;
    /**Password Text Box */
    @FindBy(xpath = "//input[@name='pass']")
    public WebElement passwordBox;
    /**Retype Pass Text Box */
    @FindBy(xpath = "//input[@name='cpass']")
    public WebElement retypePassBox;
    /**Save Button Text Box */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
    /**Delete Button Text Box */
    @FindBy(xpath="//button[1]/span[1]")
    public List <WebElement> deleteButtons;
    /**Back Button Text Box */
    @FindBy(xpath="//div[@role='dialog']//div//div//form//div//button[@type='button']")
    public WebElement backButton;



    
    


    public AgentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
