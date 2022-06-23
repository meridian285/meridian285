package pageObjectsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest {
    private WebDriver driver;
    private String url;
    @BeforeMethod
    public void startBeforeEveryTest(){
        System.setProperty("webdriver.chome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://bbb.testpro.io";
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void loginTest_correct_credentials_loggedToApp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(url);
        MainPage mainPage = loginPage.loginToApp("akelizarovav@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_incorrect_credentials_loggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(url);
        loginPage.loginToApp("akelizarovav@gmail.com", "te$t$tudent1");
        Assert.assertTrue(loginPage.isRedFrame());
    }

}
