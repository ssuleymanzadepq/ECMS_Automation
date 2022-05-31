package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ResultDetailsPage extends CommonMethods {

    @FindBy(xpath = "//*[@class='title-display']")
    public WebElement titleResults;




    public ResultDetailsPage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyTitleBar(){
        Assert.assertTrue(titleResults.isDisplayed());
    }


}
