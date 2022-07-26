package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class ReportingSteps extends CommonMethods {


    @When("user clicks on provisional reports option")
    public void user_clicks_on_provisional_reports_option() {
       report.verifyAndClickProvisionalReportsOption();
    }

    @When("user selects date from calendar")
    public void user_selects_date_from_calendar() {
        report.verifyAndClicktodaysReportsOption();
    }
    @When("user clicks on download option")
    public void user_clicks_on_download_option() {
        report.clickDownload();
    }
    @Then("user verify error message or downloaded report")
    public void user_verify_error_message_or_downloaded_report() {
        report.verifyAndDownloadReportAndErrorMessage();
    }

}
