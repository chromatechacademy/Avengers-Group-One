package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class HomeworkModulePage {
     /* Add Homework Text */
     @FindBy(xpath = "//a[normalize-space()='Add Homework']")
     public static WebElement addHomeworkModuleTextDisplays;

















     public HomeworkModulePage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
}
