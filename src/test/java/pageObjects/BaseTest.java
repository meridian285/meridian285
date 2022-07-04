package pageObjects;

import com.github.javafaker.Faker;
import enums.BrowserTypes;
import helper.BrowserFabric;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected String url;
    protected Faker faker;

    @BeforeMethod
    public void startBeforeEveryTest(){
        BrowserTypes type = BrowserTypes.CHROME;
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
