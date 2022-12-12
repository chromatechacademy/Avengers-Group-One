package com.chroma.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class RealEstateHomePage extends PageInitializer {
    /* Project Button */
    @FindBy(xpath = "//span[normalize-space()='Projects']")
    public WebElement projectsButton;

    /* Agents button */
    @FindBy(xpath = "//span[normalize-space()='Agents']")
    public WebElement agentsButton;

    /* Account Icon */
    @FindBy(xpath = "//span[normalize-space()='account_box']")
    public WebElement accountIcon;

    /* My Profile Button */
    @FindBy(xpath = "//a[normalize-space()='My Profile']")
    public WebElement myProfileButton;

    /* Email text box in my profile */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailMyProfileTextBox;

    /* Sold Button */
    @FindBy(xpath = "//p[normalize-space()='Sold']")
    public WebElement soldButton;

    /* Tabs locator in Sold */
    @FindBy(xpath = "//div[@id='exampleModal2']//th[@scope='col']")
    public List<WebElement> listOfTabs;

    /* ID under SOLD */
    @FindBy(xpath = "//div[@id='exampleModal2']//th[@scope='col'][normalize-space()='ID']")
    public WebElement actualIdSold;

    /* PROJECT under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Project']")
    public WebElement actualProjectSold;

    /* PRICE under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Price']")
    public WebElement actualPriceSold;

    /* BEDS under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Beds']")
    public WebElement actualBedsSold;

    /* BETHS under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Baths']")
    public WebElement actualBathsSold;

    /* CARS under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Cars']")
    public WebElement actualCarsSold;

    /* CAR LOTS under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Car Lots']")
    public WebElement actualCarLotsSold;

    /* STORAGE LOTS under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Storage Lots']")
    public WebElement actualStorageLotsSold;

    /* LEVEL under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Level']")
    public WebElement actualLevelSold;

    /* ASPECT under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Aspect']")
    public WebElement actualAspectSold;

    /* TOTAL AREA under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Total Area']")
    public WebElement actualTotalAreaSold;

    /* STATUS under SOLD */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Status']")
    public WebElement actualStatusSold;

    /* SOLD BY under SOLD */
    @FindBy(xpath = "//th[normalize-space()='Sold By']")
    public WebElement actualSoldBySold;

    /* Close SOLD table */
    @FindBy(xpath = "//div[@role='dialog']//button[@aria-label='Close']")
    public WebElement closeSold;

    /* Reserved Button */
    @FindBy(xpath = "//p[normalize-space()='Reserved']")
    public WebElement reservedButton;

    /* ID under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='ID']")
    public WebElement actualIdReserved;

    /* PROJECT under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Project']")
    public WebElement actualProjectReserved;

    /* PRICE under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Price']")
    public WebElement actualPriceReserved;

    /* BEDS under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Beds']")
    public WebElement actualBedsReserved;

    /* BETHS under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Baths']")
    public WebElement actualBathsReserved;

    /* CARS under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Cars']")
    public WebElement actualCarsReserved;

    /* CAR LOTS under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Car Lots']")
    public WebElement actualCarLotsReserved;

    /* STORAGE LOTS under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Storage Lots']")
    public WebElement actualStorageLotsReserved;

    /* LEVEL under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Level']")
    public WebElement actualLevelReserved;

    /* ASPECT under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Aspect']")
    public WebElement actualAspectReserved;

    /* TOTAL AREA under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Total Area']")
    public WebElement actualTotalAreaReserved;

    /* STATUS under RESERVED */
    @FindBy(xpath = "//div[@role='dialog']//th[@scope='col'][normalize-space()='Status']")
    public WebElement actualStatusReserved;

    /* Reserved BY under RESERVED */
    @FindBy(xpath = "//th[normalize-space()='Reserved By']")
    public WebElement actualReservedByReserved;

    /* Close RESERVED table */
    @FindBy(xpath = "//div[@role='dialog']//button[@aria-label='Close']")
    public WebElement closeReserved;

    public RealEstateHomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}