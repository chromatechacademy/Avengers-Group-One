package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class NavigationModulesPage extends PageInitializer {
  /* Student Information Module */
  @FindBy(xpath = "//span[normalize-space()='Student Information']")
  public WebElement actualStudentInformation;

  /* Fees Collection Module */
  @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
  public WebElement actualFeesCollection;

  /* Income Module */
  @FindBy(xpath = "//span[normalize-space()='Income']")
  public WebElement actualIncome;

  /* Expences Module */
  @FindBy(xpath = "//span[normalize-space()='Expenses']")
  public WebElement actualExpences;

  /* Academics Module */
  @FindBy(xpath = "//span[normalize-space()='Academics']")
  public WebElement actualAcademics;

  /* Human Resource Module */
  @FindBy(xpath = "//span[normalize-space()='Human Resource']")
  public WebElement actualHumanResource;

  /* Homework Module */
  @FindBy(xpath = "//span[normalize-space()='Homework']")
  public WebElement actualHomework;

  /* Reports Module */
  @FindBy(xpath = "//span[normalize-space()='Reports']")
  public WebElement actualReports;

  public NavigationModulesPage() {

    PageFactory.initElements(WebDriverUtils.driver, this);
  }

}
