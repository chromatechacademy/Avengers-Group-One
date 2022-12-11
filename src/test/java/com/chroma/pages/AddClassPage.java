package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class AddClassPage {

    /* Add Class text box */
    @FindBy(xpath = "//input[@id='class']")
    public WebElement addClassTextBox;

    /* Sample Class Text box */
    @FindBy(xpath = "//label[normalize-space()='Sample']")
    public WebElement sampleClassTextBox;

    /* Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Record saved successfully text */
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement recordSavedSuccessfullyText;

    /* Rukshan Class Text  */
    @FindBy(xpath = "//td[normalize-space()='Rukshan Class']")
    public WebElement rukshanClassText;

    /* Rukshan Record delete link */
    @FindBy(xpath = "//*[contains(text(),'Rukshan Class')]//following-sibling::td[2]/a[2]")
    public WebElement rukshanRecordDeleteLink;

    public AddClassPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }  
}
