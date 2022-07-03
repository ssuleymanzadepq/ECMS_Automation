package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class SearchItemPageSteps extends CommonMethods {

    @When("user search for the {string} in search field")
    public void user_search_for_the_in_search_field(String item) {

        search.verifyAndSearchItem(item);
    }


    @When("user clicks on search button")
    public void user_clicks_on_search_button() throws InterruptedException {
        System.out.println("Operation is done in previous step");
        Thread.sleep(1000);
    }

    @When("user clicks on reporting dropdown")
    public void user_clicks_on_reporting_dropdown() {
       search.clickOnReportingdropdown();
    }


    @Then("user should be able to see all the reporting options")
    public void user_should_be_able_to_see_all_the_reporting_options() {
        search.verifyReportingDropdownAndOptions();
    }
}
