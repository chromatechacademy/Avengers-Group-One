package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditStudentPage {

    /* Student information module */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /* navigates to Select Details page */
    @FindBy(xpath = "(//a[normalize-space()='Student Details'])[2]")
    public WebElement studentDetailsPage;

    /* Select Class dropdown */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    /* Select section dropdown */
    @FindBy(xpath = "(//select[@name='section_id'])[1]")
    public WebElement sectionDropDown;

    /* Click on search button */
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchBtn;

    /* */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionTextBox;

}
