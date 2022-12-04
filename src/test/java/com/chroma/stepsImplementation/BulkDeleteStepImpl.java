package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.BulkDeletePage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

public class BulkDeleteStepImpl extends PageInitializer {
    public static void bulkDelete(String classDropDownMenuBulkDeletePage, String sectionDropDownMenuBulkDeletePage,
            String admissionNumber) {
        BulkDeletePage.bulkDeleteModule.click();
        CommonUtils.selectDropDownValue(classDropDownMenuBulkDeletePage, BulkDeletePage.classDropDownMenu);
        CommonUtils.selectDropDownValue(sectionDropDownMenuBulkDeletePage, BulkDeletePage.sectionDropDownMenu);
        BulkDeletePage.selectSearchButton.click();
        BulkDeletePage.searchAdmissisonNumber.sendKeys(admissionNumber);
        BulkDeletePage.checkBoxToDelete.click();
        BulkDeletePage.deleteButton.click();
        WebDriverUtils.driver.switchTo().alert().accept();
    } 
}
