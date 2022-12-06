package com.chroma.appsCommon;
<<<<<<< HEAD

import com.chroma.pages.AgentPage;
=======
import com.chroma.pages.AcademicsClassPage;
import com.chroma.pages.AcademicsSectionsPage;
import com.chroma.pages.AddClassPage;
>>>>>>> c66c84d5ddef61e551eb0b5333dc5b67d25f75be
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.DuplicateStudentAdmissionPage;
import com.chroma.pages.EditStudentRecordPage;
import com.chroma.pages.HomeworkModulePage;
import com.chroma.pages.LoginPage;
<<<<<<< HEAD

=======
import com.chroma.pages.ModuleVerifcationPage;
import com.chroma.pages.MultipleStudentsPage;
import com.chroma.pages.NavigationModulesPage;
import com.chroma.pages.StudentAdmissionPage;
>>>>>>> c66c84d5ddef61e551eb0b5333dc5b67d25f75be
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.pages.StudentInformationModulesPage;
import com.chroma.stepsImplementation.EnablingStepImpl;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
<<<<<<< HEAD
    public static AgentPage agentPage;
=======
    public static AddClassPage addClassPage;
>>>>>>> c66c84d5ddef61e551eb0b5333dc5b67d25f75be
    public static StudentCategoriesPage studentCategoriesPage;
    public static StudentDetailsPage studentDetails;
    public static StudentAdmissionPage studentAdmissionPage;
    public static BulkDeletePage bulkDeletePage;
    public static EnablingStepImpl enablingStepImpl;
    public static HomeworkModulePage homeworkPage;
    public static EditStudentRecordPage editStudentRecordPage;
    public static DuplicateStudentAdmissionPage duplicateStudentAdmissionPage;
    public static MultipleStudentsPage multipleStudentsPage ;
    public static AcademicsClassPage academicsClassPage;
    public static AcademicsSectionsPage academicsSectionsPage;
    public static ModuleVerifcationPage moduleVerificationPage;
    public static NavigationModulesPage navigationModulesPage;
    public static StudentInformationModulesPage studentInformationModulesPage;

    public void initializeAllPages() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
<<<<<<< HEAD
        agentPage = new AgentPage();
        studentAdmissionPage = new StudentAdmissionPage();
        bulkDeletePage = new BulkDeletePage();
=======
        addClassPage = new AddClassPage();
>>>>>>> c66c84d5ddef61e551eb0b5333dc5b67d25f75be
        studentDetails = new StudentDetailsPage();
        studentCategoriesPage = new StudentCategoriesPage();
        studentAdmissionPage = new StudentAdmissionPage();
        bulkDeletePage = new BulkDeletePage();
<<<<<<< HEAD

=======
        enablingStepImpl = new EnablingStepImpl();
        homeworkPage = new HomeworkModulePage();
        editStudentRecordPage = new EditStudentRecordPage();
        duplicateStudentAdmissionPage = new DuplicateStudentAdmissionPage();
        multipleStudentsPage = new MultipleStudentsPage();
        academicsClassPage = new AcademicsClassPage();
        academicsSectionsPage = new AcademicsSectionsPage();
        moduleVerificationPage = new ModuleVerifcationPage();
        navigationModulesPage= new NavigationModulesPage();
        studentInformationModulesPage = new StudentInformationModulesPage();
>>>>>>> c66c84d5ddef61e551eb0b5333dc5b67d25f75be
    }
}