package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class HumanResourceStepImpl extends PageInitializer {

    /**
     * Use this method to assert human resource module
     * 
     * @param expectedStaffDirectoryModule
     * @param expectedStaffAttendanceModule
     * @param expectedPayrollModule
     * @param expectedApproveLeaveRequestModule
     * @param expectedApplyLeaveModule
     * @param expectedLeaveTypeModule
     * @param expectedTeachersRatingModule
     * @param expectedDepartmentModule
     * @param expectedDesignationModule
     */
    public static void humanResourceModuleAssert(String expectedStaffDirectoryModule,
            String expectedStaffAttendanceModule, String expectedPayrollModule,
            String expectedApproveLeaveRequestModule, String expectedApplyLeaveModule, String expectedLeaveTypeModule,
            String expectedTeachersRatingModule, String expectedDepartmentModule,
            String expectedDesignationModule) {

        String actualStaffDirectoryModule = humanResourceModulePage.actualStaffDirectoryModule.getText();
        CommonUtils.assertEquals(expectedStaffDirectoryModule, actualStaffDirectoryModule);

        String actualStaffAttendanceModule = humanResourceModulePage.actualStaffAttendanceModule.getText();
        CommonUtils.assertEquals(expectedStaffAttendanceModule, actualStaffAttendanceModule);

        String actualPayrollModule = humanResourceModulePage.actualPayrollModule.getText();
        CommonUtils.assertEquals(expectedPayrollModule, actualPayrollModule);

        String actualApproveLeaveRequestModule = humanResourceModulePage.actualApproveLeaveRequestModule.getText();
        CommonUtils.assertEquals(expectedApproveLeaveRequestModule, actualApproveLeaveRequestModule);

        String actualApplyLeaveModule = humanResourceModulePage.actualApplyLeaveModule.getText();
        CommonUtils.assertEquals(expectedApplyLeaveModule, actualApplyLeaveModule);

        String actualLeaveTypeModule = humanResourceModulePage.actualLeaveTypeModule.getText();
        CommonUtils.assertEquals(expectedLeaveTypeModule, actualLeaveTypeModule);

        String actualTeachersRatingModule = humanResourceModulePage.actualTeachersRatingModule.getText();
        CommonUtils.assertEquals(expectedTeachersRatingModule, actualTeachersRatingModule);

        String actualDepartmentModule = humanResourceModulePage.actualDepartmentModule.getText();
        CommonUtils.assertEquals(expectedDepartmentModule, actualDepartmentModule);

        String actualDesignationModule = humanResourceModulePage.actualDesignationModule.getText();
        CommonUtils.assertEquals(expectedDesignationModule, actualDesignationModule);

        CommonUtils.scrollIntoView(humanResourceModulePage.actualDesignationModule);
    }

}
