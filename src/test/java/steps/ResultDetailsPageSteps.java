package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class ResultDetailsPageSteps extends CommonMethods {

    @When("user clicks on one of the results from the list of results")
    public void user_clicks_on_one_of_the_results_from_the_list_of_results() {
        result.clickOnFirstResult();
    }


    @Then("user verify the result details page")
    public void user_verify_the_result_details_page() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Test");
        details.verifyTitleBar();
        details.verifyFieldedView();
        details.verifyRawXml();
        details.verifyAddNew();
        details.verifyAddAnother();
        details.verifyArticleUrl();
        details.verifyDocumentsTypeField();
        details.verifyDocumentsLangField();
        details.verifyContributorsField();

    }
}
