package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.WebDriverUtils;

public class HumanResourceModulePage extends PageInitializer {

    /* Human Resource Module Button */
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModuleButton;

    /* Staff Directory module button */
    @FindBy(xpath = "//a[normalize-space()='Staff Directory']")
    public WebElement actualStaffDirectoryModule;

    /* Staff Attendance module button */
    @FindBy(xpath = "//a[normalize-space()='Staff Attendance']")
    public WebElement actualStaffAttendanceModule;

    /* Payroll module button */
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement actualPayrollModule;

    /* Approve Leave Request module button */
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement actualApproveLeaveRequestModule;

    /* Apply Leave module button */
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement actualApplyLeaveModule;

    /* Leave Type module button */
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement actualLeaveTypeModule;

    /* Teachers Rating module button */
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement actualTeachersRatingModule;

    /* Department module button */
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement actualDepartmentModule;

    /* Designation module button */
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement actualDesignationModule;

    public HumanResourceModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
