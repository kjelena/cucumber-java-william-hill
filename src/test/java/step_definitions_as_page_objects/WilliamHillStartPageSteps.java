package step_definitions_as_page_objects;

import cucumber.api.java.en.Given;
import helpers.StepBase;
import locators.WilliamHillStartPageLocators;



// Scope for current step definition is not configured, need more time. We can implement, that only steps from this class will be initialized for specific feature.
// If such functionality will be added our steps will be isolated as page object and this is better then classic pageObject because we don't need to maintain additional level with code.
public class WilliamHillStartPageSteps extends StepBase{

    @Given("^I have opened William hill start page$")
    public void open_william_start_page() throws Throwable {
        Navigation().GoToUrl("http://sports.williamhill.com/sr-admin-set-white-list-cookie.html"); // Better to use related url with baseUrl + urlPath
    }

    @Given("^I have selected Football from navigation$")
    public void select_football() throws Throwable {
        Button().Click(WilliamHillStartPageLocators.NavFootballBtn);
    }


}