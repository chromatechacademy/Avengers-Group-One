package com.chroma.stepsImplementation;

import org.openqa.selenium.By;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.AcademicsSectionsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class AcademicsClassAndSectionStepImpl extends PageInitializer {

    // BELOW METHODS ARE ALL FOR ACADEMICS SECTION PAGE UNTIL NEXT COMMENT
    public static void clickingAcademicButton() {
        academicsSectionsPage.academicModuleButton.click();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    public static void clickingSectionsButton() {
        academicsSectionsPage.sectionsButton.click();
    }

    public static void creatingSections(String sectionName) {
        academicsSectionsPage.sectionNameTextBox.sendKeys(sectionName);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        academicsSectionsPage.sectionsSaveButton.click();
    }

    public static void deletingCreatedSections() {
        academicsSectionsPage.sectionsButton.click();
        academicsSectionsPage.deleteButtonForCreatedSection.click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    // BELOW METHODS ARE ALL FOR ACADEMICS CLASS PAGE UNTIL THE END
    public static void clickingClassbutton() {
        academicsClassPage.classButton.click();
    }

    public static void creatingAClass(String className) {
        academicsClassPage.classNameTextBox.sendKeys(className);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        academicsClassPage.checkboxOfCreatedSection.click();
    }

    public static void saveButtonClickForClass() {
        academicsClassPage.classSaveButton.click();
    }

    public static void isTheNewClassDisplayed() {
        CommonUtils.isElementDisplayed(academicsClassPage.isElementDisplayedClassLocator);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    public static void deletingCreatedClass() {
        academicsClassPage.deleteButtonForCreatedClass.click();
        CommonUtils.acceptAlert();
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
