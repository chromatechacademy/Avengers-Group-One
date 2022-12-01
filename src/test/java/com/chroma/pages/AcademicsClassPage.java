package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class AcademicsClassPage {
    
    // Class button under Academics module
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classButton;

    // Textbox input for Classe Name 
    @FindBy(xpath = "//input[@name='class']")
    public WebElement classNameTextBox;

    // The xpath for the Section created previously in Step Def
    @FindBy(xpath = "//input[@type='checkbox']//ancestor::form/descendant::div[19]/descendant::input")
    public WebElement checkboxOfCreatedSection; 

    // Class creation save button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement classSaveButton;

    // Xpath to verify that the created Class in the in Class List by using isElementDisplayed() method
    @FindBy(xpath = "//td[normalize-space()='Sample Class']")
    public WebElement isElementDisplayedClassLocator;

    // Delete button for Class created 
    @FindBy(xpath = "//*[contains(text(),'Sample Class')]//following-sibling::td[2]/a[2]")
    public WebElement deleteButtonForCreatedClass;

    public AcademicsClassPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
