package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class HumanResourceStepImpl extends PageInitializer {
    public static void humanResourceModuleAssert (String expectedStaffDirectoryModule, String expectedStaffAttendanceModule, String expectedPayrollModule,
    String expectedApproveLeaveRequestModule, String expectedApplyLeaveModule, String expectedLeaveTypeModule, String expectedTeachersRatingModule, String expectedDepartmentModule,
    String expectedDesignationModule){

        String actualStaffDirectoryModule = humanResourceModulePage.actualStaffDirectoryModule.getText();
        String actualStaffAttendanceModule = humanResourceModulePage.actualStaffAttendanceModule.getText();
        String actualPayrollModule = humanResourceModulePage.actualPayrollModule.getText();
        String actualApproveLeaveRequestModule = humanResourceModulePage.actualApproveLeaveRequestModule.getText();
        String actualApplyLeaveModule = humanResourceModulePage.actualApplyLeaveModule.getText();
        String actualLeaveTypeModule = humanResourceModulePage.actualLeaveTypeModule.getText();
        String actualTeachersRatingModule = humanResourceModulePage.actualTeachersRatingModule.getText();
        String actualDepartmentModule = humanResourceModulePage.actualDepartmentModule.getText();
        String actualDesignationModule = humanResourceModulePage.actualDesignationModule.getText();

       CommonUtils.assertEquals(expectedStaffDirectoryModule, actualStaffDirectoryModule);
       CommonUtils.assertEquals(expectedStaffAttendanceModule, actualStaffAttendanceModule);
       CommonUtils.assertEquals(expectedPayrollModule, actualPayrollModule);
       CommonUtils.assertEquals(expectedApproveLeaveRequestModule, actualApproveLeaveRequestModule);
       CommonUtils.assertEquals(expectedApplyLeaveModule, actualApplyLeaveModule);
       CommonUtils.assertEquals(expectedLeaveTypeModule, actualLeaveTypeModule);
       CommonUtils.assertEquals(expectedTeachersRatingModule, actualTeachersRatingModule);
       CommonUtils.assertEquals(expectedDepartmentModule, actualDepartmentModule);
       CommonUtils.assertEquals(expectedDesignationModule, actualDesignationModule);


    }







}
