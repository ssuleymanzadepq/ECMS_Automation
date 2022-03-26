package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SearchItemPage extends CommonMethods {

    @FindBy(xpath="//*[@id='searchTerm']")
    public WebElement searchTextfield;

    @FindBy(xpath="//button[@class='btn btn-primary btn-sm perform-search-button']")
    public WebElement searchButton;


    public SearchItemPage(){
        PageFactory.initElements(driver, this);
    }


    public void verifyAndSearchItem(String item){
        sendText(searchTextfield, item);
        click(searchButton);
    }
}

