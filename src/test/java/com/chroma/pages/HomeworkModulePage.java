package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class HomeworkModulePage extends PageInitializer {
    /* Homework dropdown module button */
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement homeworkDropdownModuleButton;

    /* Add Homework Text */
    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement addHomeworkModuleTextDisplays;

    public HomeworkModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
