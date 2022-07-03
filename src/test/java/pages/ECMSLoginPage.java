package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ECMSLoginPage extends CommonMethods {


    @FindBy(id="login_id")
    public WebElement loginTextFieldUsername;

    @FindBy(id="login_password")
    public WebElement loginTextFieldPassword;


    @FindBy(id="signinButton")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Please sign in']")
    public WebElement signInMessage;

    @FindBy(xpath = "//*[text()='Which browser is best to use?']")
    public WebElement browsernMessage;

    @FindBy(xpath = "//*[text()='Forgot password']")
    public WebElement forgotPasswordLink;


    public ECMSLoginPage(){
        PageFactory.initElements(driver, this);
    }
}



