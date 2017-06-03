package step_definitions_as_page_objects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.StepBase;
import locators.FootballEventLocators;
import org.testng.Assert;


// Scope for current step definition is not configured, need more time. We can implement, that only steps from this class will be initialized for specific feature.
// If such functionality will be added our steps will be isolated as page object and this is better then classic pageObject because we don't need to maintain additional level with code.
public class FootballEvenetSteps extends StepBase{
    @When("^I enter bet (.*)$")
    public void i_print_title_and_URL(Double bet) throws Throwable {
        Input().Type(FootballEventLocators.BetInput, bet.toString());
    }

    @Then("^Price depends on odds calculated (.*)$")
    public void price_calculated(Double bet) throws Throwable {
        String value = Span().GetText(FootballEventLocators.OddsTxt);
        String[] values = value.split("/");
        int firstFootballClubOdds = Integer.valueOf(values[0]);
        int secondFootballClubOdds = Integer.valueOf(values[1]);
        double oddsRate = (double)firstFootballClubOdds / (double)secondFootballClubOdds;
        double price = Double.parseDouble(Span().GetText(FootballEventLocators.TotalReturnPriceTxt));
        double expectedPrice = Math.floor(((oddsRate+1) * bet) * 100) / 100;
        Assert.assertEquals(expectedPrice, price);
    }
}