package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class NewProjectPage extends PageInitializer {
    @FindBy(xpath = "//select[@name='Type']")
    public WebElement type;

    @FindBy(xpath = "//input[@name='Developer']")
    public WebElement developer;

    @FindBy(xpath = "//input[@name='Title']")
    public WebElement title;

    @FindBy(xpath = "//input[@name='Enquiry_Only_Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='Websites']")
    public WebElement websites;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement saleRequestRecipientName;

    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement saleRequestRecipientPhone;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement saleRequestRecipientEmail;

    @FindBy(xpath = "//input[@name='Architect']")
    public WebElement architect;

    @FindBy(xpath = "//input[@name='Levels']")
    public WebElement levels;

    @FindBy(xpath = "//input[@name='Builder']")
    public WebElement builder;

    @FindBy(xpath = "//input[@name='Completion_Date']")
    public WebElement completionDate;

    @FindBy(xpath = "//textarea[@name='Introduction']")
    public WebElement instructions;

    @FindBy(xpath = "//textarea[@name='Features']")
    public WebElement features;

    @FindBy(xpath = "//input[@name='Reservation_no']")
    public WebElement reservationNumber;

    @FindBy(xpath = "//input[@name='Street_Number']")
    public WebElement streetNumber;

    @FindBy(xpath = "//input[@name='Street_Name']")
    public WebElement streetName;

    @FindBy(xpath = "//input[@name='Suburb']")
    public WebElement suburb;

    @FindBy(xpath = "//input[@name='State']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='Postal_Code']")
    public WebElement postalCode;

    @FindBy(xpath = "//input[@name='Country']")
    public WebElement country;

    @FindBy(xpath = "//input[@name='Latitude']")
    public WebElement latitude;

    @FindBy(xpath = "//input[@name='Longitude']")
    public WebElement longitude;

    @FindBy(xpath = "//button[@id='nextbutton']")
    public WebElement nextButton;

    public NewProjectPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
