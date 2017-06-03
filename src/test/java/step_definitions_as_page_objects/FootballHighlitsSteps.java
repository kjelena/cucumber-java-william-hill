package step_definitions_as_page_objects;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import helpers.StepBase;
import locators.FootballHighlitsLocators;
import locators.WilliamHillStartPageLocators;


// Scope for current step definition is not configured, need more time. We can implement, that only steps from this class will be initialized for specific feature.
// If such functionality will be added our steps will be isolated as page object and this is better then classic pageObject because we don't need to maintain additional level with code.
public class FootballHighlitsSteps extends StepBase{
    
    @Given("^I have pressed home button for first football game$")
    public void press_home_btn() throws Throwable {
        Button().Click(FootballHighlitsLocators.FootballClubHomeBtn);
    }
    
    @Given("^I have selected first football event$")
    public void press_first_event_btn() throws Throwable {
        Button().Click(FootballHighlitsLocators.FootballClubEventBtn);
    }
}