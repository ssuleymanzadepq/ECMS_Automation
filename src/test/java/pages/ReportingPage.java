package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ReportingPage extends CommonMethods {

    @FindBy(xpath="//*[text()='Provisional Reports']")
    public WebElement provisionalReports;

    @FindBy(xpath="//*[@id='provisional-report-today']")
    public WebElement todaysDateOption;

    @FindBy(xpath="//*[@id='provisional-report-download']")
    public WebElement downloadOption;

    @FindBy(xpath="//li[@class='ng-tns-c154-12 ng-star-inserted']/span[2]|//*[@class='pi pi-times ng-tns-c154-12']")
    public WebElement errorMessage;


    public ReportingPage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyAndClickProvisionalReportsOption(){
        Assert.assertTrue(provisionalReports.isDisplayed());
        click(provisionalReports);
    }

    public void verifyAndClicktodaysReportsOption(){
        Assert.assertTrue(todaysDateOption.isDisplayed());
        click(todaysDateOption);
    }

    public void clickDownload(){
        Assert.assertTrue(downloadOption.isDisplayed());
        click(downloadOption);
    }

    public void verifyAndDownloadReportAndErrorMessage(){

       // driver.switchTo().alert();
        if(errorMessage.isDisplayed()){
          //  String message = errorMessage.getText();
         //   System.out.println("The error message received because data is not available::: " + message);
        }else{
            System.out.println("report downloaded from the system");
        }
    }
}
