package steps;

import pages.ECMSLoginPage;
import pages.SearchItemPage;

public class PageInitializer {
    public static ECMSLoginPage login;
    public static SearchItemPage search;


    public static void initializeObject(){

        login = new ECMSLoginPage();
        search = new SearchItemPage();
    }
}
