package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class EditStudentRecordPage extends PageInitializer {

    /* navigates to Select Details Module */
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsModule;

    /* Class drop down menu */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDownMenu;

    /* Section drop down menu */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDownMenu;

    /* Click on search button */
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchBtn;

    /* edit button */
    @FindBy(xpath = "//tr[@class='odd']//i[@class='fa fa-pencil']")
    public WebElement editbtn;

    /* admission text box */
    @FindBy(xpath = "(//input[@id='admission_no'])[1]")
    public WebElement admissionTextBox;

    /* Save Button */
     @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
     public WebElement saveButton;

    /* Record saved successfully text */
     @FindBy(xpath = "//div[@class='alert alert-success text-left']")
     public WebElement recordUpdateSuccessfullyText;

    public EditStudentRecordPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
