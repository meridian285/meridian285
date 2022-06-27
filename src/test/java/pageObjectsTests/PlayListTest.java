package pageObjectsTests;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BaseTest;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlayListTest extends BaseTest {

    @Test
    public void playListTest_create_playList_playListCreated() throws InterruptedException {
        String playListName = faker.beer().name();
//        String playListName = TestDataGenerator.randomString(8);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(url);
        MainPage mainPage = loginPage.loginToApp("akelizarovav@gmail.com","te$t$tudent");
        Thread.sleep(2000);
        String playlistID = mainPage.createPlaylist(playListName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistID,playListName));
    }
    @Test
    public void playListTest_renameplayList_playlistRenamed() throws InterruptedException {
        String playListName = faker.beer().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(url);
        MainPage mainPage = loginPage.loginToApp("akelizarovav@gmail.com","te$t$tudent");
        Thread.sleep(2000);
        String playlistID = mainPage.createPlaylist(playListName);
        String newName = faker.ancient().god();
        mainPage.renamePlaylist(playlistID, newName);
        Assert.assertTrue(mainPage.checkPlaylist(playlistID,newName));
    }
}
