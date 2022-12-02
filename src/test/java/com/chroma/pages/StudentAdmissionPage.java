package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage {
    /* Student Admission module */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public static WebElement studentAdmissionModule;

    /* Admission Number text box */
    @FindBy(xpath = "//input[@id='admission_no']")
    public static WebElement admissionNumberTextBox;

    /* Roll Number text box */
    @FindBy(xpath = "//input[@id='roll_no']")
    public static WebElement rollNumberTextBox;

    /* Class drop down menu */
    @FindBy(xpath = "//select[@id='class_id']")
    public static WebElement classDropDownMenu;

    /* Section drop down menu */
    @FindBy(xpath = "//select[@id='section_id']")
    public static WebElement sectionDropDownMenu;

    /* First name text box */
    @FindBy(xpath = "//input[@id='firstname']")
    public static WebElement firstNameTextBox;

    /* Gender drop down menu */
    @FindBy(xpath = "//select[@name='gender']")
    public static WebElement genderDropDownMenu;

    /* Birth date drop down calendar */
    @FindBy(xpath = "//input[@id='dob']")
    public static WebElement DOBDropDownCalendar;

    /* drop down calendar date selection */
    @FindBy(xpath = "//td[normalize-space()='13']")
    public static WebElement DOBDateSelection;

    /* Guardian radio button */
    @FindBy(xpath = "//input[@value='father']")
    public static WebElement guardianRadioButton;

    /* Guardian name text box */
    @FindBy(xpath = "//input[@id='guardian_name']")
    public static WebElement guardianNameTextBox;

    /* Guardian phone number text box */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public static WebElement guardianPhoneTextBox;

    /* Save button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public static WebElement saveButton;

    @FindBy(xpath = "(//div[@class='alert alert-success'])[1]")
    public static WebElement recordSavedAssertion;

    public StudentAdmissionPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
