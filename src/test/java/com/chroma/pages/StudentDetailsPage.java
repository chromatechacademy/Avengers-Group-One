package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentDetailsPage extends PageInitializer {

    /* Student Details module */
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement stDetails;

    /* Search Button */
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchButton;

    /* Select Class */
    @FindBy(xpath = "(//select[@id='class_id'])[1]")
    public WebElement selectClass;

    /* Select Section */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement selectSection;

    /* Student Name */
    @FindBy(xpath = "(//a[contains(text(),'Yaryna')])[1]")
    public WebElement student;

    /* Disable student */
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement thumbsDown;

    /* Save Btn */
    @FindBy(xpath = "(//div[@class='pull-right paddA10'])[1]")
    public WebElement saveBtn;

    /* Enable student */
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement thumbsUp;

    /* Disabling reason */
    @FindBy(xpath = "//select[@name='reason']")
    public WebElement selectReason;

   
    public StudentDetailsPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
