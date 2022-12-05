package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class StudentInformationModulesPage extends PageInitializer {
    /* Student Details */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement actualStudentDetails;

    /* Student admission */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement actualStudentAdmission;

    /* Disabled Students */
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement actualDisabledStudents;

    /* Bulk Delete */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement actualBuldDelete;

    /* Student Categories */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement actualStudentCategories;

    /* Student House */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement actualStudentHouse;

    /* Disable Reason */
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement actualDisableReason;

    public StudentInformationModulesPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
