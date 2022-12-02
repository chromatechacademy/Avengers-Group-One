package com.chroma.stepsImplementation;

import org.openqa.selenium.support.ui.Select;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.web.WebDriverUtils;

public class BulkDeleteStepImpl extends PageInitializer {
    public static void bulkDelete(
            String classDropDownMenuBulkDeletePage,
            String sectionDropDownMenuBulkDeletePage,
            String admissionNumber

    ) {

        BulkDeletePage.bulkDeleteModule.click();
        Select classDropDown = new Select(BulkDeletePage.classDropDownMenu);
        classDropDown.selectByVisibleText(classDropDownMenuBulkDeletePage);
        Select sectionDropDown = new Select(BulkDeletePage.sectionDropDownMenu);
        sectionDropDown.selectByVisibleText(sectionDropDownMenuBulkDeletePage);
        BulkDeletePage.selectSearchButton.click();
        BulkDeletePage.searchAdmissisonNumber.sendKeys(admissionNumber);
        BulkDeletePage.checkBoxToDelete.click();
        BulkDeletePage.deleteButton.click();
        WebDriverUtils.driver.switchTo().alert().accept();

    }

}
