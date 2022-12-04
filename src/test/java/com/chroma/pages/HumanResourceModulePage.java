package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class HumanResourceModulePage extends PageInitializer {

    /* Staff Directory module button */
    @FindBy(xpath = "//a[normalize-space()='Staff Directory']")
    public WebElement actualStaffDirectoryModule;

    /* Staff Attendance module button */
    @FindBy(xpath = "//a[normalize-space()='Staff Attendance']")
    public WebElement actualStaffAttendanceModule;

    /* NULLNYLGKIADGLKDSGNF */
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement actualPayrollModule;

    /* NULLNYLGKIADGLKDSGNF */
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement actualApproveLeaveRequestModule;

    /* NULLNYLGKIADGLKDSGNF */
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement actualApplyLeaveModule;

    /* NULLNYLGKIADGLKDSGNF */
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement actualLeaveTypeModule;

    /* NULLNYLGKIADGLKDSGNF */
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement actualTeachersRatingModule;

    /* NULLNYLGKIADGLKDSGNF */
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement actualDepartmentModule;

    /* NULLNYLGKIADGLKDSGNF */
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement actualDesignationModule;

    public HumanResourceModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
