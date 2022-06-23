package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class KoelLogin {
    private WebDriver driver;

    @BeforeMethod
    public void startBeforeEveryTest(){
        System.setProperty("webdriver.chome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void loginToKoel() throws InterruptedException {
        By emailLoginField = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailLoginField);
        emailField.sendKeys("akelizarovav@gmail.com");

        By emailPasswordField = By.cssSelector("[type='password']");
        WebElement emailPassword = driver.findElement(emailPasswordField);
        emailPassword.sendKeys("te$t$tudent");

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();



        Thread.sleep(3000);
        By homeIconLocator = By.className("home");
        WebElement homeIcon = driver.findElement(homeIconLocator);

        Assert.assertTrue(homeIcon.isDisplayed());

        By circlePlaylistCreatLocator = By.xpath("//*[@class='fa fa-plus-circle create']");
        WebElement circlePlaylistCreat = driver.findElement(circlePlaylistCreatLocator);
        circlePlaylistCreat.click();

        By dropDownMenuLocator = By.xpath("//*[text()='New Playlist']");
        WebElement dropDownMenu = driver.findElement(dropDownMenuLocator);
        dropDownMenu.click();

        By textFolderNewPlaylistLocator = By.xpath("//*[@placeholder='↵ to save']");
        WebElement textFolderNewPlaylist = driver.findElement(textFolderNewPlaylistLocator);
        textFolderNewPlaylist.sendKeys("PlayList123123");
        driver.findElement(By.xpath("//*[@placeholder='↵ to save']")).sendKeys(Keys.ENTER);

        Thread.sleep(3000);


    }

//    @Test
//    public void loginToKoel_incorrectLogin() throws InterruptedException {
//        By emailLoginField = By.xpath("//*[@type='email']");
//        WebElement emailField = driver.findElement(emailLoginField);
//        emailField.sendKeys("akelizarovav@gmail.com");
//
//        By emailPasswordField = By.cssSelector("[type='password']");
//        WebElement emailPassword = driver.findElement(emailPasswordField);
//        emailPassword.sendKeys("wrongPassword");
//
//        By loginButtonLocator = By.tagName("button");
//        WebElement loginButton = driver.findElement(loginButtonLocator);
//        loginButton.click();
//
//        Thread.sleep(300);
//
//        By errorFrameLocator = By.className("error");
//        WebElement errorFrame = driver.findElement(errorFrameLocator);
//
//        Assert.assertTrue(errorFrame.isDisplayed());
//    }



}
