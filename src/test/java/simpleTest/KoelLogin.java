package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class KoelLogin {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startBeforeEveryTest(){
        System.setProperty("webdriver.chome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10,200);
//        fluentWait = new FluentWait<>(driver.)
//                .pollingEvery(Duration.ofMillis(200))
//                .withTimeout(Duration.ofSeconds(10))
//                .ignoring(NoSuchElementException.class)
//                .ignoring(ElementClickInterceptedException.class)
//                .ignoring(StaleElementReferenceException.class);
        driver.get("https://bbb.testpro.io");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
//        Thread.sleep(2000);
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


        By homeIconLocator = By.className("home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeIconLocator));
        WebElement homeIcon = driver.findElement(homeIconLocator);

        Assert.assertTrue(homeIcon.isDisplayed());

        Thread.sleep(1000);

        By circlePlaylistCreatLocator = By.xpath("//*[@class='fa fa-plus-circle create']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(circlePlaylistCreatLocator));
        WebElement circlePlaylistCreat = driver.findElement(circlePlaylistCreatLocator);
        circlePlaylistCreat.click();

        By dropDownMenuLocator = By.xpath("//*[text()='New Playlist']");
        WebElement dropDownMenu = driver.findElement(dropDownMenuLocator);
        dropDownMenu.click();

        By textFolderNewPlaylistLocator = By.xpath("//*[@placeholder='↵ to save']");
        WebElement textFolderNewPlaylist = driver.findElement(textFolderNewPlaylistLocator);
        textFolderNewPlaylist.sendKeys("PlayList123123");
        driver.findElement(By.xpath("//*[@placeholder='↵ to save']")).sendKeys(Keys.ENTER);

    }

    @Test
    public void loginToKoel_incorrectLogin() throws InterruptedException {
        By emailLoginField = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailLoginField);
        emailField.sendKeys("akelizarovav@gmail.com");

        By emailPasswordField = By.cssSelector("[type='password']");
        WebElement emailPassword = driver.findElement(emailPasswordField);
        emailPassword.sendKeys("wrongPassword");

        By loginButtonLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();


        By errorFrameLocator = By.className("error");
        for (int i = 0; i<50;i++)
            try {
                driver.findElement(errorFrameLocator);
                break;
            }catch (NoSuchElementException err){
                try{
                    Thread.sleep(200);
                }catch (InterruptedException e){}
            }
//        WebElement errorFrame = driver.findElement(errorFrameLocator);
//
//        Assert.assertTrue(errorFrame.isDisplayed());



    }



}
