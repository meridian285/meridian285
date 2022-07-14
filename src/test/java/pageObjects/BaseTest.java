package pageObjects;

import com.github.javafaker.Faker;
import enums.BrowserTypes;
import helper.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String url;
    protected Faker faker;
    protected String username;

    protected String password;

    @Parameters({"username, password, url, browser"})

    @BeforeMethod
    public void startBeforeEveryTest(String username, String pass, String url, String browser){
        this.username = username;
        this.password = pass;
        this.url = url;
        BrowserTypes type = browser.equals("Chrome") ? BrowserTypes.CHROME: BrowserTypes.FIREFOX;
        driver = BrowserFabric.getDriver(type);

        url = "https://bbb.testpro.io";
        faker = new Faker();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
        driver.quit();
    }
}
