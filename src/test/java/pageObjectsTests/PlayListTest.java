package pageObjectsTests;

import helper.TestDataGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlayListTest {
    private WebDriver driver;
    private String url;
    private String login;

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
    public void playListTest_create_playList_playListCreated() throws InterruptedException {
        String playListName = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(url);
        MainPage mainPage = loginPage.loginToApp("akelizarovav@gmail.com","te$t$tudent");
        Thread.sleep(2000);
        mainPage.createPlaylist(playListName);
//        Assert.assertTrue(mainPage.isMainPage());
    }
}
