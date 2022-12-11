package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class RealEstateDashboardPage extends PageInitializer {

    /* Dashboard text element */
    @FindBy(xpath = "//a[@type='button']")
    public WebElement actualDashboardTextElement;

    /* Hello, Admin text element */
    @FindBy(xpath = "//h1[normalize-space()='Hello, Admin']")
    public WebElement actualHelloAdminTextElement;

    /* Overview text element */
    @FindBy(xpath = "//a[normalize-space()='Overview']")
    public WebElement actualOverviewTextElement;

    /* Agents Graph text element */
    @FindBy(xpath = "//a[normalize-space()='Agents Graph']")
    public WebElement actualAgentsGraphTextElement;

    /* Properties Overview text element */
    @FindBy(xpath = "//h5[normalize-space()='Properties Overview']")
    public WebElement actualPropertiesOverviewTextElement;

    /* Properties text element */
    @FindBy(xpath = "//h6[normalize-space()='Properties']")
    public WebElement actualPropertiesTextElement;

    /* Agents tab button */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement actualAgentsTabButton;

    /* Dashboard tab button */
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    public WebElement actualDashboardTabButton;

    public RealEstateDashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
