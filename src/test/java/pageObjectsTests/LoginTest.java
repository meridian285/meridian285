package pageObjectsTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BaseTest;
import pageObjects.LoginPage;


public class LoginTest extends BaseTest {
    @Test
    public void loginTest_incorrect_credentials_loggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate(url);
        loginPage.loginToApp("akelizarovav@gmail.com", "te$t$tudent1");
        Assert.assertTrue(loginPage.isRedFrame());
    }

}
