package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;
import utils.ExcelReader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LoginSteps extends CommonMethods {

    @Given("Login to google")
    public void login_to_google() {
        openBrowserAndLaunchApplication();
    }

    @When("user enters username and password for login")
    public void user_enters_username_and_password_for_login() {
        sendText(login.loginTextFieldUsername, ConfigReader.getPropertyValue("username"));
        sendText(login.loginTextFieldPassword, ConfigReader.getPropertyValue("password"));
    }


    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.signInButton);
    }

    @Then("user navigated to homepage")
    public void user_navigated_to_homepage() {
        System.out.println("Test");
    }


    @When("user enters credentials from excel file using {string} and logged in")
    public void user_enters_credentials_from_excel_file_using_and_logged_in(String sheetName) {
        List<Map<String, String>> newLogin = ExcelReader.excelIntoListMap(Constants.TESTDATA_FILEPATH, sheetName);

        for (Map<String, String> loginUser : newLogin) {
            sendText(login.loginTextFieldUsername, loginUser.get("username"));
            sendText(login.loginTextFieldPassword, loginUser.get("password"));
            click(login.signInButton);
        }
    }

    @When("user enters credentials {string} and {string} and clicked on logged in")
    public void user_enters_credentials_and_and_clicked_on_logged_in(String username, String password) {
        sendText(login.loginTextFieldUsername, username);
        sendText(login.loginTextFieldPassword, password);
        click(login.signInButton);
    }

}
