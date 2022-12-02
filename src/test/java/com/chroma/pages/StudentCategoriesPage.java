package com.chroma.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class StudentCategoriesPage {

    @FindBy(xpath = "(//span[normalize-space()='Student Information'])[1]")
    public WebElement studentadmission;

    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentcategories;

    @FindBy(xpath = "//input[@id='category']")
    public WebElement categoryTxtBox;

    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
    public WebElement saveBtn;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement categorySearch;

    @FindBy(xpath = "//*[contains(text(),'API')]//following-sibling::td[2]/a[2]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement deleteSuccessfullyText;

    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement saveSuccessfullyText;

    public StudentCategoriesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
