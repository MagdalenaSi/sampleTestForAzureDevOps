package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BasePage;

public class HomePage extends BasePage {
    private WebDriverWait wait;

    @FindBy(className ="heading")
    WebElement header;

    @FindBy(xpath ="//a[@href='/drag_and_drop']")
    WebElement dragAndDropLink;

    @FindBy(xpath ="//a[@href='/frames']")
    WebElement framesLink;


    public HomePage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }

    public String displayHomePageHeader(){
        return header.getText();
    }

}
