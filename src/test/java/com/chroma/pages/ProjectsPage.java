package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class ProjectsPage extends PageInitializer {
    /* Add New Project under Projects */
    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg sidebar-cta']")
    public WebElement actualAddNewProjectsText;
    /* Projects under Projects */
    @FindBy(xpath = "//button[@class='sidebar-item']")
    public WebElement actualProjectText;
    /* Active under Projects */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement actualActiveText;
    /* Archived under Projects */
    @FindBy(xpath = "//a[normalize-space()='Archived']")
    public WebElement actualArchivedText;
    
    public ProjectsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}