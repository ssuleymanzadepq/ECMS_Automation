package steps;

import pages.ECMSLoginPage;
import pages.ResultDetailsPage;
import pages.ResultsPage;
import pages.SearchItemPage;

public class PageInitializer {
    public static ECMSLoginPage login;
    public static SearchItemPage search;
    public static ResultsPage result;
    public static ResultDetailsPage details;


    public static void initializeObject(){

        login = new ECMSLoginPage();
        search = new SearchItemPage();
        result = new ResultsPage();
        details = new ResultDetailsPage();
    }
}
