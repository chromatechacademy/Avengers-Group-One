package com.chroma.appsCommon;
import com.chroma.pages.AgentPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AgentPage agentPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        agentPage = new AgentPage();

    }

}
