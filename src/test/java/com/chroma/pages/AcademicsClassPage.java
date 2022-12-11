package com.chroma.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class AcademicsClassPage {
    
    // Class button under Academics module
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classButton;

    // Textbox input for Class Name 
    @FindBy(xpath = "//input[@name='class']")
    public WebElement classNameTextBox;

    // The xpath for the Section created previously in Step Def
    @FindBy(xpath = "//input[@type='checkbox']//ancestor::form/descendant::div[1]/descendant::input[19]")
    public WebElement checkboxOfCreatedSection; 

    // Class creation save button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement classSaveButton;

    // Xpath to verify that the created Class in the in Class List by using assertequals method
    @FindBy(xpath = "//td[normalize-space()='Sample Class']")
    public WebElement isElementDisplayedClassLocator;

    // Delete button for Class created 
    @FindBy(xpath = "//*[contains(text(),'Sample Class')]//following-sibling::td[2]/a[2]")
    public WebElement deleteButtonForCreatedClass;
    
    // Locator for list of class names 
    @FindBy(xpath = "//*[@class='mailbox-name']")
    public List<WebElement> listOfClassNames;

    /* UPDATE */

    /* Locator for list of classes and sections */
    @FindBy(xpath = "//*[@role='row']")
    public List<WebElement> listOfClassNamesAndSections;

    /* Cyber Security Class in Class List*/
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']")
    public WebElement cyberSecurityClass;

    /* SDET Class in Class List */
    @FindBy(xpath = "//td[normalize-space()='SDET']")
    public WebElement sdetClass;
    
    public AcademicsClassPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
