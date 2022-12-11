package com.chroma.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class MultipleStudentsPage {
    /* Admission Number */
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNumberTextBox;

    /* First name text box */
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstNameTextBox;

    /* Class drop down menu */
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDownMenu;

    /* Guardian radio button */
    @FindBy(xpath = "//input[@value='father']")
    public WebElement guardianRadioButton;

    /* Guardian name text box */
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianName;

    /* Guardian phone number text box */
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhone;

    /* Save button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    public MultipleStudentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}