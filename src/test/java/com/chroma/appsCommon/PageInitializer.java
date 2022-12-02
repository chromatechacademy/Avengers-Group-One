package com.chroma.appsCommon;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.StudentCategoriesPage;
import com.chroma.pages.StudentDetailsPage;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.af.En;

public class PageInitializer extends WebDriverUtils {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static StudentCategoriesPage studentCategoriesPage;
    public static StudentDetailsPage studentDetails;
   

    public void initializeAllPages() {

        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        studentDetails = new StudentDetailsPage();
        studentCategoriesPage = new StudentCategoriesPage();


    }

}
