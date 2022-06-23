package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,5,200);
    }

    public boolean isMainPage() {
        By homeIconLocator = By.className("home");
        try{
            wait .until(ExpectedConditions.visibilityOfElementLocated(homeIconLocator));
            return true;
        }catch (TimeoutException err){
            return false;
        }
    }
}
