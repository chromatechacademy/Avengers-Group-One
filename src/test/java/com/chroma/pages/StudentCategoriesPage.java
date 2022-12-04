package com.chroma.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentCategoriesPage {
     /* Student Admission module */
    @FindBy(xpath = "(//span[normalize-space()='Student Information'])[1]")
    public WebElement studentadmission;

     /* Student Category */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentcategories;

     /* Student Category TxtBox */
    @FindBy(xpath = "//input[@id='category']")
    public WebElement categoryTxtBox;

    /* Category Save Button */
    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
    public WebElement saveBtn;

     /* Category Search */
    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement categorySearch;

     /* Delete Button */
    @FindBy(xpath = "//*[contains(text(),'API')]//following-sibling::td[2]/a[2]")
    public WebElement deleteBtn;

     /* Text Record Deleted Successfully */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement deleteSuccessfullyText;

    /* Text Record Saved Successfully */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement saveSuccessfullyText;

    public StudentCategoriesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
