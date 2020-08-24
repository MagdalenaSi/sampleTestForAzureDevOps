package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utility.SetUpTest;

public class HomeTest extends SetUpTest {
    private HomePage homePage;
    private String homeHeader = "Welcome to the-internet";

    @Test
    public void displayHomePage(){
        homePage = new HomePage(driver);
        Assert.assertEquals(homePage.displayHomePageHeader(),homeHeader);
    }
}
