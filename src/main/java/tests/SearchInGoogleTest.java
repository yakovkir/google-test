package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GoogleSeachPage;
import setup.Setup;

import static org.junit.Assert.assertTrue;

/**
 * Created by ad on 22.06.2015.
 */
public class SearchInGoogleTest {

    public static final String SELENIUM = "selenium";
    public static final String VALUE = "value";
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = Setup.getDriver();
    }

    @Test
    public void serchInGoogle() {

        GoogleSeachPage page = PageFactory.initElements(driver, GoogleSeachPage.class);
        page.search(SELENIUM);

        assertTrue(driver.getTitle().contains(SELENIUM));
        assertTrue(page.getSearchField().getAttribute(VALUE).contains(SELENIUM));
        assertTrue(page.getFirstResult().getText().toLowerCase().contains(SELENIUM));
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
