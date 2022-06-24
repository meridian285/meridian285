package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

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

    private WebElement getCirclePlaylistCreat(){
        By circlePlaylistCreatLocator = By.xpath("//*[@class='fa fa-plus-circle create']");
        wait.until(ExpectedConditions.elementToBeClickable(circlePlaylistCreatLocator));
        return driver.findElement(circlePlaylistCreatLocator);
    }
    private WebElement getDropDownMenuNewPlaylist(){
        By dropDownMenuLocator = By.xpath("//*[text()='New Playlist']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropDownMenuLocator));
        return driver.findElement(dropDownMenuLocator);
    }
    private WebElement getTextFolderNewPlaylist(){
        By textFolderNewPlaylistLocator = By.xpath("//*[@placeholder='↵ to save']");
        return driver.findElement(textFolderNewPlaylistLocator);
    }
    public void createPlaylist(String playListName) {
        getCirclePlaylistCreat().click();
        getDropDownMenuNewPlaylist().click();
        getTextFolderNewPlaylist().sendKeys(playListName);
        getTextFolderNewPlaylist().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        String url = driver.getCurrentUrl();
        String[] parts = url.split("/");

        System.out.println(parts[5]);
    }


}
