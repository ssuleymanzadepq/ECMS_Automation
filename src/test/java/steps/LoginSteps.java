package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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

    @When("user is on login page")
    public void user_is_on_login_page() {
        String text = login.signInMessage.getText();
        Assert.assertEquals(text, "Please sign in");
    }

    @Then("user should be able to see message {string}")
    public void user_should_be_able_to_see_message(String message) {
       String browserText = login.browsernMessage.getText();
       Assert.assertEquals(browserText, message);
    }

    @Then("user should be able to see forgot password link")
    public void user_should_be_able_to_see_forgot_password_link() {
        Assert.assertTrue(login.forgotPasswordLink.isDisplayed());
        String text = login.forgotPasswordLink.getText();
        Assert.assertEquals(text, "Forgot password");
        click(login.forgotPasswordLink);
    }

}
