package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class BatchQueuePageSteps extends CommonMethods {
    @When("user clicks on batch queue option")
    public void user_clicks_on_batch_queue_option() {
      search.clickOnBatchQueueOption();
    }

    @Then("user should be able to see batch queue options on page")
    public void user_should_be_able_to_see_batch_queue_options_on_page() {
        batch.verifyBatchQueuePageOptions();
    }

    @Then("user verify process details options on batch queue page")
    public void user_verify_process_details_options_on_batch_queue_page() {
      batch.verifyBatchQueuePageHeadings();}
}
