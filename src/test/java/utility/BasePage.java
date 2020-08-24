package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
}
