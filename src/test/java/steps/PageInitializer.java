package steps;

import pages.*;

public class PageInitializer {
    public static ECMSLoginPage login;
    public static SearchItemPage search;
    public static ResultsPage result;
    public static DocumentPage details;
    public static BatchQueuePage batch;
    public static ReportingPage report;


    public static void initializeObject(){

        login = new ECMSLoginPage();
        search = new SearchItemPage();
        result = new ResultsPage();
        details = new DocumentPage();
        batch = new BatchQueuePage();
        report = new ReportingPage();
    }
}
