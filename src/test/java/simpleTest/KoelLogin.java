package simpleTest;

import org.openqa.selenium.By;
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


        By emailPasswordField = By.cssSelector("[type='password']");
        WebElement emailPassword = driver.findElement(emailPasswordField);


        By loginButtonLocator = By.tagName("button1");
        WebElement loginButton = driver.findElement(loginButtonLocator);

        emailField.sendKeys("akelizarovav@gmail.com");
        emailPassword.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(3000);
        By homeIconLocator = By.className("home");
        WebElement homeIcon = driver.findElement(homeIconLocator);

        Assert.assertTrue(homeIcon.isDisplayed());
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

        Thread.sleep(300);

        By errorFrameLocator = By.className("error");
        WebElement errorFrame = driver.findElement(errorFrameLocator);

        Assert.assertTrue(errorFrame.isDisplayed());
    }

    @Test
    public void properties(){
        String url = driver.getCurrentUrl();
        System.out.println(url);

        String title =driver.getTitle();
        System.out.println(title);

        List<WebElement> divs = driver.findElements(By.tagName("div"));
        System.out.println(divs.size());

        WebElement div0 = divs.get(0);
    }
}
