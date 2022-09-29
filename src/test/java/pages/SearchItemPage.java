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

    @FindBy(xpath="//*[@title='Show Preferences']")
    public WebElement settingsOption;

    @FindBy(xpath="//*[text()='CONFIGURATIONS |']")
    public WebElement configurationsettingsOption;

    @FindBy(xpath="//*[text()='Columns Shown']")
    public WebElement columnShownsettingsOption;

    @FindBy(xpath="//*[text()='Facet Panel:']")
    public WebElement facetPanelsettingsOption;

    @FindBy(xpath="//*[text()='Facet Favorites']")
    public WebElement facetFavsettingsOption;

    @FindBy(xpath="//*[text()='Facet Categories Shown']")
    public WebElement facetCategoriesShownsettingsOption;

    @FindBy(xpath="//*[text()='Filters']")
    public WebElement filtersettingsOption;

    @FindBy(xpath="//*[text()='No. of Results Shown: ']")
    public WebElement NoOfResultsettingsOption;

    @FindBy(xpath="//*[text()='Document View']")
    public WebElement docViewsettingsOption;

    @FindBy(xpath="(//*[text()='Bulk Edit'])[2]")
    public WebElement bulkEditsettingsOption;

    @FindBy(xpath="(//*[@role='menuitem'])[1]")
    public WebElement fullResultsOption;

    @FindBy(xpath="(//*[@role='menuitem'])[2]")
    public WebElement documentSetOption;

    @FindBy(xpath="//*[@id='AddTerms']")
    public WebElement addButton;

    @FindBy(xpath="//*[@id='DeleteTerms']")
    public WebElement deleteButton;

    @FindBy(xpath="//*[@id='ReplaceTerms']")
    public WebElement replaceButton;

    @FindBy(xpath="//*[@id='clear-set-toolbar-button']")
    public WebElement clearSetOption;

    @FindBy(xpath="//*[text()='Clear Sorts']")
    public WebElement clearSortOption;




    public SearchItemPage(){
        PageFactory.initElements(driver, this);
    }


    public void verifyAndSearchItem(String item){
        sendText(searchTextfield, item);
        click(searchButton);
    }

    public void verifyAndClickfullResultsOption(){
        Assert.assertTrue(documentSetOption.isDisplayed());
        click(fullResultsOption);
        Assert.assertTrue(replaceButton.isDisplayed());
        Assert.assertTrue(deleteButton.isDisplayed());
        Assert.assertTrue(addButton.isDisplayed());
    }

    public void verifyAndClickDocumentSetOption(){
        click(documentSetOption);
    }

    public void verifyAndClickBulkEdit(){
        click(bulkEditsettingsOption);
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

    public void clickOnSettingsOption(){
        click(settingsOption);
    }


    public void verifySettingsOptions(){
        Assert.assertTrue(facetCategoriesShownsettingsOption.isDisplayed());
        Assert.assertTrue(facetFavsettingsOption.isDisplayed());
        Assert.assertTrue(facetPanelsettingsOption.isDisplayed());
        Assert.assertTrue(columnShownsettingsOption.isDisplayed());
        Assert.assertTrue(configurationsettingsOption.isDisplayed());
        Assert.assertTrue(bulkEditsettingsOption.isDisplayed());
        Assert.assertTrue(docViewsettingsOption.isDisplayed());
        Assert.assertTrue(NoOfResultsettingsOption.isDisplayed());
        Assert.assertTrue(filtersettingsOption.isDisplayed());
    }

    public void verifyClearSetOption(){
        Assert.assertTrue(clearSetOption.isEnabled());
        Assert.assertTrue(clearSetOption.isDisplayed());
    }

    public void verifyClearSortOption(){
        Assert.assertTrue(clearSortOption.isEnabled());
        Assert.assertTrue(clearSortOption.isDisplayed());
    }


}

