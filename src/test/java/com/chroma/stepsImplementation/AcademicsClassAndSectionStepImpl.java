package com.chroma.stepsImplementation;

import static org.junit.Assert.assertNotEquals;
import org.openqa.selenium.WebElement;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;

public class AcademicsClassAndSectionStepImpl extends PageInitializer {

    /*
     * BELOW METHODS ARE ALL FOR ACADEMICS SECTION PAGE
     */
    public static void clickingAcademicButton() {
        academicsSectionsPage.academicModuleButton.click();
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

    /*
     * BELOW METHODS ARE ALL FOR ACADEMICS CLASS PAGE UNTIL THE END
     */
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
        for (WebElement classNames : academicsClassPage.listOfClassNames) {
            String e = classNames.getText();
            assertNotEquals(deletedClass, e);
        }
        CommonUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    /* UPDATE */
    
    public static void classListAssert(String expectedClassOne, String expectedClassTwo) {
        String[] expectedClasses = { expectedClassOne, expectedClassTwo };
        for (WebElement actualClassName : academicsClassPage.listOfClassNamesAndSections) {
            String e = actualClassName.getText();
            for (String expectedClass : expectedClasses) {
                String c = expectedClass;
                CommonUtils.assertEquals(e, c);
            }
        }
    }

    public static void sectionListAssert(String expectedSectionOne, String expectedSectionTwo,
            String expectedSectionThree,
            String expectedSectionFour, String expectedSectionFive, String expectedSectionSix,
            String expectedSectionSeven, String expectedSectionEight, String expectedSectionNine,
            String expectedSectionTen, String expectedSectionEleven, String expectedSectionTwelve,
            String expectedSectionThirteen, String expectedSectionFourteen) {
        String[] expectedSections = { expectedSectionOne, expectedSectionTwo, expectedSectionThree,
                expectedSectionFour, expectedSectionFive, expectedSectionSix,
                expectedSectionSeven, expectedSectionEight, expectedSectionNine,
                expectedSectionTen, expectedSectionEleven, expectedSectionTwelve,
                expectedSectionThirteen, expectedSectionFourteen };
        for (WebElement actualSectionName : academicsClassPage.listOfClassNamesAndSections) {
            String e = actualSectionName.getText();
            for (String expectedSection : expectedSections) {
                String c = expectedSection;
                CommonUtils.assertEquals(e, c);
            }
        }
    }

}
