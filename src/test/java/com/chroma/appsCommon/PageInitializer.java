package com.chroma.appsCommon;
import com.chroma.pages.AcademicsClassPage;
import com.chroma.pages.AcademicsSectionsPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AcademicsClassPage academicsClassPage;
    public static AcademicsSectionsPage academicsSectionsPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        academicsClassPage = new AcademicsClassPage();
        academicsSectionsPage = new AcademicsSectionsPage();
    }

}
