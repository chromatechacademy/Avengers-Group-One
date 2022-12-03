package com.chroma.appsCommon;
import com.chroma.pages.AcademicsClassPage;
import com.chroma.pages.AcademicsSectionsPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.HomeworkModulePage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.pages.BulkDeletePage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AcademicsClassPage academicsClassPage;
    public static AcademicsSectionsPage academicsSectionsPage;
    public static StudentCategoriesPage studentCategoriesPage;
    public static StudentDetailsPage studentDetails;
    public static StudentAdmissionPage studentAdmissionPage;
    public static BulkDeletePage bulkDeletePage;
    public static HomeworkModulePage homeworkPage;

    public void initializeAllPages() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        academicsClassPage = new AcademicsClassPage();
        academicsSectionsPage = new AcademicsSectionsPage();
        studentDetails = new StudentDetailsPage();
        studentCategoriesPage = new StudentCategoriesPage();
        studentAdmissionPage = new StudentAdmissionPage();
        bulkDeletePage = new BulkDeletePage();
        homeworkPage = new HomeworkModulePage();
    }
}
