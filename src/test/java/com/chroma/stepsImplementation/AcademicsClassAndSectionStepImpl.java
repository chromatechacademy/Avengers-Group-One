package com.chroma.stepsImplementation;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.AcademicsSectionsPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.an.E;

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
        academicsSectionsPage.sectionsSaveButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
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
        academicsClassPage.checkboxOfCreatedSection.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    public static void saveButtonClickForClass() {
        academicsClassPage.classSaveButton.click();
    }

    public static void isTheNewClassDisplayed(String expectedClassName) {
        String actualText = academicsClassPage.isElementDisplayedClassLocator.getText();
        CommonUtils.assertEquals(expectedClassName, actualText);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    public static void deletingCreatedClass(String deletedClass) {
        academicsClassPage.deleteButtonForCreatedClass.click();
        CommonUtils.acceptAlert();
        for(WebElement classNames : academicsClassPage.listOfClassNames) {
            String e = classNames.getText();
            assertNotEquals(deletedClass, e);
        }
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }
}
