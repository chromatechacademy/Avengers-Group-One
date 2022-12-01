package com.chroma.stepDefinitions;

import org.openqa.selenium.By;

import com.chroma.appsCommon.PageInitializer;
import com.chroma.pages.AgentPage;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AgentPageStepDef extends PageInitializer {

    // Add step definitions in this class
    // NOTE: Every step definitions class Extends PageInitializer
    // PageInitializer extends WebDriverUtils

    @Given("an admin user is on the Real Estate login page {string}")
    public void an_admin_user_is_on_the_Real_Estate_login_page(String url) throws InterruptedException {
       WebDriverUtils.driver.get(url);
       

    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) throws InterruptedException {
        WebDriverUtils.driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("admin@mexil.it");
        WebDriverUtils.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
        WebDriverUtils.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        CommonUtils.waitForClickability(agentPage.agentsButton);
        agentPage.agentsButton.click();
       

    }

    @Then("user is navigated to the agents page")
    public void user_is_navigated_to_the_agents_page() {

    }

    @When("As an admin user, I am able to add an agent with an unique credentials")
    public void as_an_admin_user_I_am_able_to_add_an_agent_with_an_unique_credentials() throws InterruptedException {
        String AddButton = WebDriverUtils.driver.findElement(By.xpath("//button[normalize-space()='Add Now']")).getText();
        System.out.println(AddButton);
        WebDriverUtils.driver.findElement(By.xpath("//button[normalize-space()='Add Now']")).click();
        Thread.sleep(2000);
        

    }

    @When("the agent is added, I am able to verify that the agent is listed as active with the exact credentials")
    public void the_agent_is_added_I_am_able_to_verify_that_the_agent_is_listed_as_active_with_the_exact_credentials() {

    }

    @Then("the newly created agents information matches the information that I had created it with")
    public void the_newly_created_agent_s_information_matches_the_information_that_I_had_created_it_with() {
        
    }
    
    @Then("I am able to log into the website with the new agents credentials")
    public void i_am_able_to_log_into_the_website_with_the_new_agent_s_credentials() {
        
    }
}