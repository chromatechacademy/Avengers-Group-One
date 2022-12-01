package com.chroma.appsCommon;
import com.chroma.pages.AddClassPage;
import com.chroma.pages.DashboardPage;
import com.chroma.pages.LoginPage;
import com.chroma.pages.SelectCriteriaPage;
import com.chroma.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AddClassPage addClassPage;
    public static SelectCriteriaPage selectCriteriaPage;

    public void initializeAllPages() {

        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addClassPage = new AddClassPage();
        selectCriteriaPage = new SelectCriteriaPage();

        
    }

}
