package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class BatchQueuePage extends CommonMethods {


    @FindBy(xpath = "//*[text()='Go back']")
    public WebElement goBackOption;

    @FindBy(xpath = "//*[text()='Refresh']")
    public WebElement refreshOption;

    @FindBy(xpath = "//a[@title='485 rows']")
    public WebElement pageNumbers;

    @FindBy(xpath = "//*[text()='My requests']")
    public WebElement myRequestsOption;

    @FindBy(xpath = "//*[text()='All requests']")
    public WebElement allRequestsOption;

    @FindBy(xpath = "//*[text()='Autofit columns']")
    public WebElement autofitColumns;

    @FindBy(xpath = "//small[@class='text-muted']")
    public WebElement noteOption;

    @FindBy(xpath = "//*[text()='Details']")
    public WebElement detailsHeading;

    @FindBy(xpath = "//*[text()='Process Id']")
    public WebElement processId;

    @FindBy(xpath = "//*[text()='Type']")
    public WebElement type;

    @FindBy(xpath = "//*[text()='Request']")
    public WebElement requestsHeading;

    @FindBy(xpath = "//*[text()='Total documents']")
    public WebElement totalDocumentsHeading;

    @FindBy(xpath = "//*[text()='Completed documents']")
    public WebElement completedDocumentsHeading;

    @FindBy(xpath = "//*[text()='Pending documents']")
    public WebElement pendingDocumentsHeading;

    @FindBy(xpath = "//*[text()='Edited documents']")
    public WebElement editedDocumentsHeading;

    @FindBy(xpath = "//*[text()='Errored documents']")
    public WebElement erroredDocumentsHeading;


    @FindBy(xpath = "//*[text()='Requested date']")
    public WebElement requestedDateHeading;

    @FindBy(xpath = "//*[text()='Completed date']")
    public WebElement completedDateHeading;

    @FindBy(xpath = "//*[text()='Requested By']")
    public WebElement requestedByHeading;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement statusHeading;

    public BatchQueuePage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyBatchQueuePageOptions(){
        Assert.assertTrue(goBackOption.isDisplayed());
        Assert.assertTrue(refreshOption.isDisplayed());
        Assert.assertTrue(pageNumbers.isDisplayed());
        Assert.assertTrue(myRequestsOption.isDisplayed());
        Assert.assertTrue(allRequestsOption.isDisplayed());
        Assert.assertTrue(autofitColumns.isDisplayed());
        Assert.assertTrue(noteOption.isDisplayed());
    }

    public void verifyBatchQueuePageHeadings(){
        Assert.assertTrue(statusHeading.isDisplayed());
        Assert.assertTrue(requestedByHeading.isDisplayed());
        Assert.assertTrue(completedDateHeading.isDisplayed());
        Assert.assertTrue(requestedDateHeading.isDisplayed());
        Assert.assertTrue(erroredDocumentsHeading.isDisplayed());
        Assert.assertTrue(editedDocumentsHeading.isDisplayed());
        Assert.assertTrue(pendingDocumentsHeading.isDisplayed());
        Assert.assertTrue(completedDocumentsHeading.isDisplayed());
        Assert.assertTrue(totalDocumentsHeading.isDisplayed());
        Assert.assertTrue(requestsHeading.isDisplayed());
        Assert.assertTrue(processId.isDisplayed());
        Assert.assertTrue(type.isDisplayed());
        Assert.assertTrue(detailsHeading.isDisplayed());
    }
}
