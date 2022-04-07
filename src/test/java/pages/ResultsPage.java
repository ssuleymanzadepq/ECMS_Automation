package pages;

import com.sun.javaws.jnl.RContentDesc;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class ResultsPage extends CommonMethods {

    @FindBy(xpath="//*[@class='ag-root ag-unselectable ag-layout-normal']")
    public WebElement resultItemFields;


    @FindBy(xpath="//div[@class='facet-list-container ng-tns-c130-24']/div/div/span")
    public List<WebElement> listOfFacets;


    @FindBy(xpath="//*[@id='disciplines']/div/span")
    public WebElement disciplinesTab;

    @FindBy(xpath="//*[@id='products']/div/span")
    public WebElement products;

    @FindBy(xpath="//*[@id='abstract']/div/span")
    public WebElement abstractField;

    @FindBy(xpath="//*[@id='fullText']/div/span")
    public WebElement fullText;

    @FindBy(xpath="//*[@id='sourceType']/div/span")
    public WebElement publicationSourceType;

    @FindBy(xpath="//*[@id='documentType']/div/span")
    public WebElement documentType;

    @FindBy(xpath="//*[@id='documentSection']/div/span")
    public WebElement documentSection;

    @FindBy(xpath="//*[@id='termCount']/div/span")
    public WebElement termCount;

    @FindBy(xpath="//*[@id='pq1Business']/div/span")
    public WebElement pqBusiness;

    @FindBy(xpath="//*[@id='providers']/div/span")
    public WebElement providers;

    @FindBy(xpath="//*[@id='publishers']/div/span")
    public WebElement publishers;

    @FindBy(xpath="//*[@id='databaseType']/div/span")
    public WebElement databaseType;


    @FindBy(xpath="//*[@id='documentStatus']/div/span")
    public WebElement documentStatus;

    @FindBy(xpath="//*[@id='mr3Fields']/div/span")
    public WebElement mr3Fields;

    @FindBy(xpath="//*[@id='activeRestrictions']/div/span")
    public WebElement activeRestrictions;

    @FindBy(xpath="//*[@id='publicationSubjects']/div/span")
    public WebElement publicationSubjects;

    @FindBy(xpath="//*[@id='contentTier']/div/span")
    public WebElement ContentTier;

    @FindBy(xpath="//*[@id='bundle_code']/div/span")
    public WebElement bundleCodes;




    public ResultsPage(){
        PageFactory.initElements(driver, this);
    }


    public void verifyListOfResult(){
        Assert.assertTrue(resultItemFields.isDisplayed());
    }

    public void verifyTheFacets(){
        String disc = disciplinesTab.getText();
        Assert.assertTrue(disc.equals("Disciplines"));

        String productsval = products.getText();
        Assert.assertTrue(productsval.equals("Products"));

        String abstractval = abstractField.getText();
        Assert.assertTrue(abstractval.equals("Abstract"));

        String fulTextValue = fullText.getText();
        Assert.assertTrue(fulTextValue.equals("Full Text"));

        String pst = publicationSourceType.getText();
        Assert.assertTrue(pst.equals("Publication Source Type"));

        String doctype = documentType.getText();
        Assert.assertTrue(doctype.equals("Document Type"));

        String docSection = documentSection.getText();
        Assert.assertTrue(docSection.equals("Document Section"));

        String term = termCount.getText();
        Assert.assertTrue(term.equals("Term Count"));

        String pq1 = pqBusiness.getText();
        Assert.assertTrue(pq1.equals("PQ One Business"));

        String providersVal = providers.getText();
        Assert.assertTrue(providersVal.equals("Providers"));

        String publishersVal = publishers.getText();
        Assert.assertTrue(publishersVal.equals("Publishers"));

        String dbType = databaseType.getText();
        Assert.assertTrue(dbType.equals("Database Type"));

        String docStatus = documentStatus.getText();
        Assert.assertTrue(docStatus.equals("Document Status"));

        String mr3 = mr3Fields.getText();
        Assert.assertTrue(mr3.equals("MR3 Fields"));


        String activeVal = activeRestrictions.getText();
        Assert.assertTrue(activeVal.equals("Active Restrictions"));


        String pub = publicationSubjects.getText();
        Assert.assertTrue(pub.equals("Publication Subjects"));


        String ConTier = ContentTier.getText();
        Assert.assertTrue(ConTier.equals("Content Tier"));


        String bundleCodesVal = bundleCodes.getText();
        Assert.assertTrue(bundleCodesVal.equals("Bundle Codes"));

    }

}
