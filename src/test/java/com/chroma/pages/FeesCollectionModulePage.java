package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class FeesCollectionModulePage extends PageInitializer {

    /*Fees Collection modile button */
    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModuleButton;
    
    /* Collect Fees module button */
    @FindBy(xpath = "//ul[contains(@class,'treeview-menu menu-open')]//a[normalize-space()='Collect Fees']")
    public WebElement actualCollectFeesModule;

    /* Search Fees Payment module button */
    @FindBy(xpath = "//a[normalize-space()='Search Fees Payment']")
    public WebElement actualSearchFeesPaymentModule;

    /* Search Due Fees module button */
    @FindBy(xpath = "//a[normalize-space()='Search Fees Payment']")
    public WebElement actualSearchDueFeesModule;

    /* Fees Master module button */
    @FindBy(xpath = "//a[normalize-space()='Fees Master']")
    public WebElement actualFeesMasterModule;

    /* Fees Group module button */
    @FindBy(xpath = "//a[normalize-space()='Fees Group']")
    public WebElement actualFeesGroupModule;

    /* Fees Type module button */
    @FindBy(xpath = "//a[normalize-space()='Fees Type']")
    public WebElement actualFeesTypeModule;

    /* Fees Discount module button */
    @FindBy(xpath = "//a[normalize-space()='Fees Discount']")
    public WebElement actualFeesDiscountModule;

    /* Fees Carry Forward module button */
    @FindBy(xpath = "//a[normalize-space()='Fees Carry Forward']")
    public WebElement actualFeesCarryForwardModule;

    /* Fees Reminder module button */
    @FindBy(xpath = "//a[normalize-space()='Fees Reminder']")
    public WebElement actualFeesReminderModule;

    /*Income module button */
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement actualIncomeModule;

    public FeesCollectionModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
