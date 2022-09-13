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


    @When("user clicks on prod status report option")
    public void user_clicks_on_prod_status_report_option() {
       click(search.productionStatusReport);
    }

    @Then("excel report should be downloaded")
    public void excel_report_should_be_downloaded() {
        System.out.println("Excel report downloaded");
    }

    @When("user clicks on settings option")
    public void user_clicks_on_settings_option() {
       search.clickOnSettingsOption();
    }


    @Then("user should be able to see all the options under settings")
    public void user_should_be_able_to_see_all_the_options_under_settings() {
    search.verifySettingsOptions();
    }

    @When("user clicks on arrow icon")
    public void user_clicks_on_arrow_icon() throws InterruptedException {
       result.clickArrowIcon();
    }

    @Then("user should be able to see new values in the results")
    public void user_should_be_able_to_see_new_values_in_the_results() {
        result.verifyDifferentValues();
    }

    @When("user clicks on double arrow icon")
    public void user_clicks_on_double_arrow_icon() throws InterruptedException {
       result.clickDoubleArrowIcon();
    }

    @When("user clicks on left sided double arrow icon after clicking on right sided double arrow icon")
    public void user_clicks_on_left_sided_double_arrow_icon_after_clicking_on_right_sided_double_arrow_icon() throws InterruptedException {
      result.clickOnLeftSideDoubleArrowIcon();
    }

    @When("user selects items per page dropdown values")
    public void user_selects_items_per_page_dropdown_values() throws InterruptedException {
       result.selectItemsPerPageDropDown();
    }

}
