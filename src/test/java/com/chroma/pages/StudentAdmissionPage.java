package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage extends PageInitializer {
    /* Student Admission module */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionModule;

    /* Admission Number text box */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumberTextBox;

    /* Roll Number text box */
    @FindBy(xpath = "//input[@id='roll_no']")
    public WebElement rollNumberTextBox;

    /* Class drop down menu */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDownMenu;

    /* Section drop down menu */
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDownMenu;

    /* First name text box */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    /* Gender drop down menu */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDownMenu;

    /* Birth date drop down calendar */
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement DOBDropDownCalendar;

    /* drop down calendar date selection */
    @FindBy(xpath = "//td[normalize-space()='13']")
    public WebElement DOBDateSelection;

    /* Guardian radio button */
    @FindBy(xpath = "//input[@value='father']")
    public WebElement guardianRadioButton;

    /* Guardian name text box */
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    /* Guardian phone number text box */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    /* Save button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Assert record saved text */
    @FindBy(xpath = "(//div[@class='alert alert-success'])[1]")
    public WebElement recordSavedAssertion;

    /* Assert duplicate student admission error */
    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement expectedDuplicateStudentErrorMessage;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
