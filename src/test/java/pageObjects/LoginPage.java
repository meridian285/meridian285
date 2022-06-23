package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,5,200);
    }

    private WebElement getEmailFiled(){
        By emailFieldLocator = By.xpath("//*[@type='email']");
        return driver.findElement(emailFieldLocator);
}
    private WebElement getPasswordField(){
        By emailPasswordField = By.cssSelector("[type='password']");
        return driver.findElement(emailPasswordField);
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));

    }
    public MainPage loginToApp(String userName, String password){
        getEmailFiled().sendKeys(userName);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public void navigate(String url){
        driver.get(url);
    }

    public boolean isRedFrame() {
        By errorLocator = By.className("error");
        try{
            wait .until(ExpectedConditions.visibilityOfElementLocated(errorLocator));
            return true;
        }catch (TimeoutException err){
            return false;
        }
    }
}
