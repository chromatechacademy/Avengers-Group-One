package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;
import com.google.j2objc.annotations.Weak;

public class ModuleVerifcationPage {
    /*
     * BELOW ARE XPATHS FOR INCOME MODULE
     */
    // Income Module button
    @FindBy(xpath = "//body/div/aside/div/section/ul/li[3]/a[1]")
    public WebElement incomeModuleButton;
    // Xpaths for name of buttons under the Income module
    @FindBy(xpath = "(//a[contains(text(),'Income')]//parent::li/descendant::a)[1]")
    public WebElement buttonAddIncome;
    @FindBy(xpath = "(//a[contains(text(),'Income')]//parent::li/descendant::a)[2]")
    public WebElement buttonSearchIncome;
    @FindBy(xpath = "(//a[contains(text(),'Income')]//parent::li/descendant::a)[3]")
    public WebElement buttonIncomeHead;

    /*
     * BELOW ARE XPATHS FOR EXPENSE MODULE
     */
    // Expense Module button
    @FindBy(xpath = "//body/div/aside/div/section/ul/li[4]/a[1]")
    public WebElement expenseModuleButton;
    // Xpaths for name of buttons under the Expense module
    @FindBy(xpath = "(//a[contains(text(),'Expense')]//ancestor::ul/following-sibling::ul/child::li[4]/child::ul/child::li/child::a)[1]")
    public WebElement buttonAddExpense;
    @FindBy(xpath = "(//a[contains(text(),'Expense')]//ancestor::ul/following-sibling::ul/child::li[4]/child::ul/child::li/child::a)[2]")
    public WebElement buttonSearchExpense;
    @FindBy(xpath = "(//a[contains(text(),'Expense')]//ancestor::ul/following-sibling::ul/child::li[4]/child::ul/child::li/child::a)[3]")
    public WebElement buttonExpenseHead;

    /*
     * BELOW ARE XPATHS FOR ACADEMICS MODULE
     */
    // Academics Module Button
    @FindBy(xpath = "//*[contains(text(),'Academics')]//parent::a")
    public WebElement academicsModuleButton;
    // Xpaths for name of buttons under Academics module
    @FindBy(xpath = "(//*[contains(text(),'Class')]//parent::a)[2]")
    public WebElement buttonClassTimeTable;
    @FindBy(xpath = "(//*[contains(text(),'Class')]//parent::a)[3]")
    public WebElement buttonAssignClassTeacher;
    @FindBy(xpath = "(//*[contains(text(),'Class')]//parent::a)[4]")
    public WebElement buttonClass;
    @FindBy(xpath = "(//*[contains(text(),'Subject')]//parent::a)[1]")
    public WebElement buttonSubjectGroup;
    @FindBy(xpath = "(//*[contains(text(),'Subject')]//parent::a)[2]")
    public WebElement buttonSubjects;
    @FindBy(xpath = "(//*[contains(text(),'Teacher')]//parent::a)[1]")
    public WebElement buttonTeacherTimeTable;
    @FindBy(xpath = "(//*[contains(text(),'Promote')]//parent::a)[1]")
    public WebElement buttonPromoteStudent;
    @FindBy(xpath = "(//*[contains(text(),'Section')]//parent::a)[1]")
    public WebElement buttonSections;

    public ModuleVerifcationPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
