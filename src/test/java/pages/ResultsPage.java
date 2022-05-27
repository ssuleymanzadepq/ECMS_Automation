package pages;

import com.sun.javaws.jnl.RContentDesc;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends CommonMethods {

    @FindBy(xpath = "//*[@class='ag-root ag-unselectable ag-layout-normal']")
    public WebElement resultItemFields;


    @FindBy(xpath = "//div[@class='facet-list-container ng-tns-c130-24']/div/div/span")
    public List<WebElement> listOfFacets;

    @FindBy(xpath = "//div[@class='ag-center-cols-container']/div")
    public List<WebElement> listOfSearchItems;


    @FindBy(xpath = "//*[@id='disciplines']/div/span")
    public WebElement disciplinesTab;

    @FindBy(xpath = "//*[@id='products']/div/span")
    public WebElement products;

    @FindBy(xpath = "//*[@id='abstract']/div/span")
    public WebElement abstractField;

    @FindBy(xpath = "//*[@id='fullText']/div/span")
    public WebElement fullText;

    @FindBy(xpath = "//*[@id='sourceType']/div/span")
    public WebElement publicationSourceType;

    @FindBy(xpath = "//*[@id='documentType']/div/span")
    public WebElement documentType;

    @FindBy(xpath = "//*[@id='documentSection']/div/span")
    public WebElement documentSection;

    @FindBy(xpath = "//*[@id='termCount']/div/span")
    public WebElement termCount;

    @FindBy(xpath = "//*[@id='pq1Business']/div/span")
    public WebElement pqBusiness;

    @FindBy(xpath = "//*[@id='providers']/div/span")
    public WebElement providers;

    @FindBy(xpath = "//*[@id='publishers']/div/span")
    public WebElement publishers;

    @FindBy(xpath = "//*[@id='databaseType']/div/span")
    public WebElement databaseType;


    @FindBy(xpath = "//*[@id='documentStatus']/div/span")
    public WebElement documentStatus;

    @FindBy(xpath = "//*[@id='mr3Fields']/div/span")
    public WebElement mr3Fields;

    @FindBy(xpath = "//*[@id='activeRestrictions']/div/span")
    public WebElement activeRestrictions;

    @FindBy(xpath = "//*[@id='publicationSubjects']/div/span")
    public WebElement publicationSubjects;

    @FindBy(xpath = "//*[@id='contentTier']/div/span")
    public WebElement ContentTier;

    @FindBy(xpath = "//*[@id='bundle_code']/div/span")
    public WebElement bundleCodes;


    @FindBy(xpath = "//*[@id='total-pages-toolbar-display']")
    public WebElement numbersOfResults;

    @FindBy(xpath = "//*[@id='document-set-count']")
    public WebElement documentSetField;

    @FindBy(xpath = "//*[@id='items-per-page']")
    public WebElement itemsPerPageField;

    @FindBy(xpath = "//*[@title='Bulk Edit']")
    public WebElement bulkEditOption;

    @FindBy(xpath = "//*[@title='Clear Set']")
    public WebElement clearSetField;

    @FindBy(xpath = "//*[@title='Clear Sorts']")
    public WebElement clearSortField;

    @FindBy(xpath = "//*[@title='Export']")
    public WebElement exportField;

    @FindBy(xpath = "//*[@title='Auto Fit Columns']")
    public WebElement autoFitColumns;

    @FindBy(xpath = "//*[@title='Auto Fit Table']")
    public WebElement autoFitTableField;


    public ResultsPage() {
        PageFactory.initElements(driver, this);
    }


    public void verifyListOfResult() {
        Assert.assertTrue(resultItemFields.isDisplayed());
    }

    public void verifyTheFacets() {
        String disc = disciplinesTab.getText();
        Assert.assertEquals("Disciplines", disc);
        //  Assert.assertTrue(disc.equals("Disciplines"));

        String productsval = products.getText();
        Assert.assertEquals("Products", productsval);
        // Assert.assertTrue(productsval.equals("Products"));

        String abstractval = abstractField.getText();
        Assert.assertEquals("Abstract", abstractval);
        // Assert.assertTrue(abstractval.equals("Abstract"));

        String fulTextValue = fullText.getText();
        // Assert.assertTrue(fulTextValue.equals("Full Text"));
        Assert.assertEquals("Full Text", fulTextValue);

        String pst = publicationSourceType.getText();
        //  Assert.assertTrue(pst.equals("Publication Source Type"));
        Assert.assertEquals("Publication Source Type", pst);

        String doctype = documentType.getText();
        //Assert.assertTrue(doctype.equals("Document Type"));
        Assert.assertEquals("Document Type", doctype);

        String docSection = documentSection.getText();
        Assert.assertEquals("Document Section", docSection);
        //Assert.assertTrue(docSection.equals("Document Section"));

        String term = termCount.getText();
        Assert.assertEquals("Term Count", term);
        // Assert.assertTrue(term.equals("Term Count"));

        String pq1 = pqBusiness.getText();
        Assert.assertEquals("PQ One Business", pq1);
        //Assert.assertTrue(pq1.equals("PQ One Business"));

        String providersVal = providers.getText();
        // Assert.assertTrue(providersVal.equals("Providers"));
        Assert.assertEquals("Providers", providersVal);

        String publishersVal = publishers.getText();
        Assert.assertEquals("Publishers", publishersVal);
        // Assert.assertTrue(publishersVal.equals("Publishers"));


        String dbType = databaseType.getText();
        Assert.assertEquals("Database Type", dbType);
        // Assert.assertTrue(dbType.equals("Database Type"));

        String docStatus = documentStatus.getText();
        //  Assert.assertTrue(docStatus.equals("Document Status"));
        Assert.assertEquals("Document Status", docStatus);

        String mr3 = mr3Fields.getText();
        Assert.assertEquals("MR3 Fields", mr3);
        // Assert.assertTrue(mr3.equals("MR3 Fields"));


        String activeVal = activeRestrictions.getText();
        Assert.assertEquals("Active Restrictions", activeVal);
        // Assert.assertTrue(activeVal.equals("Active Restrictions"));


        String pub = publicationSubjects.getText();
        Assert.assertEquals("Publication Subjects", pub);
        //  Assert.assertTrue(pub.equals("Publication Subjects"));


        String ConTier = ContentTier.getText();
        Assert.assertEquals("Content Tier", ConTier);


        //  Assert.assertTrue(ConTier.equals("Content Tier"));


        String bundleCodesVal = bundleCodes.getText();
        Assert.assertEquals("Bundle Codes", bundleCodesVal);

        String resultValue = numbersOfResults.getText();
        System.out.println(resultValue);
        Assert.assertTrue(numbersOfResults.isDisplayed());
        Assert.assertTrue(documentSetField.isDisplayed());
        Assert.assertTrue(itemsPerPageField.isDisplayed());
        Assert.assertTrue(bulkEditOption.isDisplayed());
        Assert.assertTrue(clearSetField.isDisplayed());
        Assert.assertTrue(clearSortField.isDisplayed());
        Assert.assertTrue(autoFitColumns.isDisplayed());
        Assert.assertTrue(autoFitTableField.isDisplayed());
        Assert.assertTrue(exportField.isDisplayed());

        List<String> listOfItems = new ArrayList<>();
        for (WebElement ele : listOfSearchItems) {
            listOfItems.add(ele.getText());
        }
        System.out.println(listOfItems);

    }

}
