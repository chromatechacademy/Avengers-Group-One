package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class RealEstateAgentModulePage extends PageInitializer {

    /* Agents Module Button */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement actualAgentsModuleButton;

    /* Members List text element */
    @FindBy(xpath = "//button[@class='sidebar-item']")
    public WebElement actualMembersListTextElement;

    /* Active text element */
    @FindBy(xpath = "//a[normalize-space()='Active']")
    public WebElement actualActiveTextElement;

    /* Inactive text element */
    @FindBy(xpath = "//a[normalize-space()='Inactive']")
    public WebElement actualInactiveTextElement;

    /* All Agents text element */
    @FindBy(xpath = "//a[normalize-space()='All Agents']")
    public WebElement actualAllAgentsTextElement;

    /* Add Now text element */
    @FindBy(xpath = "//button[normalize-space()='Add Now']")
    public WebElement actualAddNowTextElement;

    /* Name text element */
    @FindBy(xpath = "//th[normalize-space()='Name']")
    public WebElement actualNameTextElement;

    /* Mail text element */
    @FindBy(xpath = "//th[normalize-space()='Mail']")
    public WebElement actualMailTextElement;

    /* Contact Number text element */
    @FindBy(xpath = "//th[normalize-space()='Contact Number']")
    public WebElement actualContactNumberTextElement;

    /* Actions text element */
    @FindBy(xpath = "//th[@class='text-end']")
    public WebElement actualActionsTextElement;

    public RealEstateAgentModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
