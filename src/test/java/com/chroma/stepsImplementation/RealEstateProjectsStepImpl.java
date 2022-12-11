package com.chroma.stepsImplementation;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.web.CommonUtils;

public class RealEstateProjectsStepImpl extends PageInitializer {
    public static void optionsUnderProjectsButton(String expectedAddNewProject, String expectedProjects,
            String expectedActive, String expectedArchived) {
        String actualAddNewProject = projectsPage.actualAddNewProjectsText.getText();
        CommonUtils.assertEquals(actualAddNewProject, expectedArchived);
        String actualProjects = projectsPage.actualProjectText.getText();
        CommonUtils.assertEquals(actualProjects, expectedArchived);
        String actualActive = projectsPage.actualActiveText.getText();
        CommonUtils.assertEquals(actualActive, expectedArchived);
        String actualArchived = projectsPage.actualArchivedText.getText();
        CommonUtils.assertEquals(actualArchived, expectedArchived);
    }
}