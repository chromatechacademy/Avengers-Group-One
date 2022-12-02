package com.chroma.appsCommon;
import com.chroma.pages.AgentPage;
import com.chroma.pages.BulkDeletePage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public static AgentPage agentPage;

    public static StudentAdmissionPage studentAdmissionPage;
    public static BulkDeletePage bulkDeletePage;


    public void initializeAllPages() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        agentPage = new AgentPage();
        studentAdmissionPage = new StudentAdmissionPage();
        bulkDeletePage = new BulkDeletePage();


    }

}
