package com.chroma.stepDefinitions;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends PageInitializer {

    @Before
    public void start(Scenario scenario) {
        CucumberLogUtils.scenario = scenario;
        setUp();
        initializeAllPages(); 
    }

    @After
    public void end() {
        tearDown();
    }

}
