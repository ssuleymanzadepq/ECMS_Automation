package steps;

import pages.ECMSLoginPage;
import pages.DocumentPage;
import pages.ResultsPage;
import pages.SearchItemPage;

public class PageInitializer {
    public static ECMSLoginPage login;
    public static SearchItemPage search;
    public static ResultsPage result;
    public static DocumentPage details;


    public static void initializeObject(){

        login = new ECMSLoginPage();
        search = new SearchItemPage();
        result = new ResultsPage();
        details = new DocumentPage();
    }
}
