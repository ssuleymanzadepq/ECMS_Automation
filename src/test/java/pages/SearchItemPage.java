package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SearchItemPage extends CommonMethods {

    @FindBy(xpath="//*[@id='searchTerm']")
    public WebElement searchTextfield;

    @FindBy(xpath="//button[@class='btn btn-primary btn-sm perform-search-button']")
    public WebElement searchButton;

    @FindBy(id="reportingDropdown")
    public WebElement reportingDropdown;

    @FindBy(xpath="//*[text()='Provisional Reports']")
    public WebElement provisionalReports;

    @FindBy(xpath="//*[text()='Prod Status Report']")
    public WebElement productionStatusReport;

    @FindBy(xpath="//*[text()=' Term Report Help']")
    public WebElement termReportHelp;

    @FindBy(xpath="//*[text()=' Status Report Help']")
    public WebElement statusReportHelp;

    @FindBy(xpath="//*[text()='Batch Queues']")
    public WebElement batchQueues;




    public SearchItemPage(){
        PageFactory.initElements(driver, this);
    }


    public void verifyAndSearchItem(String item){
        sendText(searchTextfield, item);
        click(searchButton);
    }

    public void clickOnReportingdropdown(){
        Assert.assertTrue(reportingDropdown.isDisplayed());
        click(reportingDropdown);
    }

    public void verifyReportingDropdownAndOptions(){
        Assert.assertTrue(provisionalReports.isDisplayed());
        Assert.assertTrue(productionStatusReport.isDisplayed());
        Assert.assertTrue(termReportHelp.isDisplayed());
        Assert.assertTrue(statusReportHelp.isDisplayed());
    }

    public void clickOnBatchQueueOption(){
        Assert.assertTrue(batchQueues.isDisplayed());
        click(batchQueues);
    }


}

