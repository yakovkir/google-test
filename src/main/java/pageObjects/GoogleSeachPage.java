package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.Setup;

/**
 * Created by ad on 22.06.2015.
 */
public class GoogleSeachPage {

    public static final String HTTPS_WWW_GOOGLE_COM_UA = "https://www.google.com.ua/";
    private WebDriver driver;

    @FindBy(id = "lst-ib")
    WebElement searchField;

    @FindBy(xpath = ".//*[@id='rso']/div[2]/li[1]/div/h3/a")
    WebElement firstResult;


    public void search(String s) {
        driver = Setup.getDriver();
        driver.get(HTTPS_WWW_GOOGLE_COM_UA);

        searchField.sendKeys(s);
        searchField.sendKeys(Keys.ENTER);
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getFirstResult() {
        return firstResult;
    }
}
