package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DocumentPage extends CommonMethods {

    @FindBy(xpath = "//*[@class='title-display']")
    public WebElement documentMainTitle;

    @FindBy(xpath= "//*[@id='fielded']")
    public WebElement fieldedView;

    @FindBy(xpath= "//*[@id='rawXml']")
    public WebElement rawXmlView;

    @FindBy(xpath= "//*[text()='Document types']")
    public WebElement documentsType;

    @FindBy(xpath= "//*[text()='Doc_language (la)']")
    public WebElement docLangField;

    @FindBy(xpath= "//*[text()='+ Add new ']")
    public WebElement addNewField;

    @FindBy(xpath= "//*[text()='Article URL(s)']")
    public WebElement articleUrlHeading;

    @FindBy(xpath= "//*[text()='+ add another ']")
    public WebElement addAnotherHeading;

    @FindBy(xpath= "//*[@class='text-brand-blue h5']")
    public WebElement contributorsField;


    @FindBy(xpath = "//*[text()='CORP (Terms)']")
    public WebElement corpItemsHeading;

    @FindBy(xpath = "//*[@id='term-CORP-0']")
    public WebElement corpItemTextField;

    @FindBy(xpath = "//*[@class='input-group-text term-actions ng-tns-c231-85 ng-star-inserted']/i")
    public WebElement searchButtonCorp;



    public DocumentPage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyDocumentMainTitle(){Assert.assertTrue(documentMainTitle.isDisplayed());}

    public void verifyFieldedView(){
        Assert.assertTrue(fieldedView.isDisplayed());
    }

    public void verifyRawXml(){
        Assert.assertTrue(rawXmlView.isDisplayed());
    }

    public void verifyDocumentsTypeField(){
        Assert.assertTrue(documentsType.isDisplayed());
    }

    public void verifyDocumentsLangField(){
        Assert.assertTrue(docLangField.isDisplayed());
    }

    public void verifyAddNew(){
        Assert.assertTrue(addNewField.isDisplayed());
    }

    public void verifyArticleUrl(){
        Assert.assertTrue(articleUrlHeading.isDisplayed());
    }

    public void verifyAddAnother(){
        Assert.assertTrue(addAnotherHeading.isDisplayed());
    }

    public void verifyContributorsField(){
        Assert.assertTrue(contributorsField.isDisplayed());
    }





    public void verifyCorpHeading(){
        Assert.assertTrue(corpItemsHeading.isDisplayed());
        Assert.assertTrue(corpItemTextField.isDisplayed());
        sendText(corpItemsHeading, "vvbbcdd");
    }


    public void verifyCorpSearchButton() {
        Assert.assertTrue(searchButtonCorp.isDisplayed());
        click(searchButtonCorp);

    }
}
