package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.web.WebDriverUtils;

public class BulkDeletePage {
  /* Bulk delete module */
  @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
  public static WebElement bulkDeleteModule;

  /* Class drop down menu */
  @FindBy(xpath = "//select[@id='class_id']")
  public static WebElement classDropDownMenu;

  /* Section drop down menu */
  @FindBy(xpath = "//select[@id='section_id']")
  public static WebElement sectionDropDownMenu;

  /* Search button */
  @FindBy(xpath = "//button[normalize-space()='Search']")
  public static WebElement selectSearchButton;

  /* Search for admission number to delete */
  @FindBy(xpath = "//input[@placeholder='Search...']")
  public static WebElement searchAdmissisonNumber;

  /* Selects checkbox for deletion */
  @FindBy(xpath = "(//input[@name='student[]'])[1]")
  public static WebElement checkBoxToDelete;

  /* Delete button */
  @FindBy(xpath = "//button[@id='load']")
  public static WebElement deleteButton;

  public BulkDeletePage() {

    PageFactory.initElements(WebDriverUtils.driver, this);
  }

}
