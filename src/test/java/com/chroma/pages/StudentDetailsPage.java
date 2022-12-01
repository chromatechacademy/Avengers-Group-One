package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentDetailsPage extends PageInitializer {

    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement stDetails;

    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchButton;

    @FindBy(xpath = "(//select[@id='class_id'])[1]")
    public WebElement selectClass;

    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement selectSection;

    @FindBy(xpath = "(//a[contains(text(),'Yaryna')])[1]")
    public WebElement student;

    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement thumbsDown;

    @FindBy(xpath = "(//div[@class='pull-right paddA10'])[1]")
    public WebElement saveBtn;

    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement thumbsUp;

    @FindBy(xpath = "//select[@name='reason']")
    public WebElement selectReason;





    


   

    public StudentDetailsPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
