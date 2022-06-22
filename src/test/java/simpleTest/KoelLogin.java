package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KoelLogin {

      @Test
    public void loginToKoel() throws InterruptedException {
          System.setProperty("webdriver.chome.driver", "chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://bbb.testpro.io");

          By emailLoginField = By.xpath("//*[@type='email']");
          WebElement emailField = driver.findElement(emailLoginField);


          By emailPasswordField = By.cssSelector("[type='password']");
          WebElement emailPassword = driver.findElement(emailPasswordField);


          By loginButtonLocator = By.tagName("button");
          WebElement loginButton = driver.findElement(loginButtonLocator);

          emailField.sendKeys("akelizarovav@gmail.com");
          emailPassword.sendKeys("te$t$tudent");
          loginButton.click();
          Thread.sleep(3000);
          By homeIconLocator = By.className("home");
          WebElement homeIcon = driver.findElement(homeIconLocator);

          Assert.assertTrue(homeIcon.isDisplayed());

          Thread.sleep(2000);

          driver.quit();

      }
    @Test
    public void loginToKoel_incorrectLogin() throws InterruptedException {
        System.setProperty("webdriver.chome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");

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

        Thread.sleep(2000);

        driver.quit();


    }
}
