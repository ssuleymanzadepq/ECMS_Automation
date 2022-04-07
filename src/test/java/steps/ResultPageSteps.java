package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class ResultPageSteps extends CommonMethods {

    @Then("user verifies the items shown in the list")
    public void user_verifies_the_items_shown_in_the_list() {
       result.verifyListOfResult();
    }

    @Then("user verifies left panel facets")
    public void user_verifies_left_panel_facets(DataTable dataTable) {
        List<String> expectedTabs = dataTable.asList();

        List<String> actualTabs = new ArrayList<>();


        for (WebElement ele: result.listOfFacets
             ) {
            actualTabs.add(ele.getText());
        }

        System.out.println(expectedTabs);
        System.out.println(actualTabs);

result.verifyTheFacets();
    }

    }
