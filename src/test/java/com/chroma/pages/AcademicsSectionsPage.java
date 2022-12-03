package com.chroma.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class AcademicsSectionsPage {

    // Academic Module dropdown button on the homepage after logging in
    @FindBy(xpath = "//body[1]/div[1]/aside[1]/div[1]/section[1]/ul[2]/li[5]/a[1]")
    public WebElement academicModuleButton;

    // Section Button after clicking Academic Module dropdown button
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsButton;

    // Textbox for Section Name
    @FindBy(xpath = "//input[@name='section']")
    public WebElement sectionNameTextBox;

    // Save button on the Sections page
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement sectionsSaveButton;

    // Delete button of the Section created
    @FindBy(xpath = "//*[contains(text(),'Sample Section')]//parent::tr/child::td[2]/a[2]")
    public WebElement deleteButtonForCreatedSection;
    
    public AcademicsSectionsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
