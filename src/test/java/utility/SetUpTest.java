package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUpTest {
    protected static WebDriver driver;
    private static String PAGE_URL="https://the-internet.herokuapp.com/";

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(PAGE_URL);
    }

    @AfterClass
    public static void closeDriver(){
        driver.close();
    }
}


