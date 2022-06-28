package pageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
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
    public String createPlaylist(String playListName) {
        getCirclePlaylistCreat().click();
        getDropDownMenuNewPlaylist().click();
        getTextFolderNewPlaylist().sendKeys(playListName);
        getTextFolderNewPlaylist().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];

    }
    private WebElement getPlayList(String playlistID){
        return driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistID+"']"));
    }

    public boolean checkPlaylist(String playlistID, String playlistName) {
        try {
            return getPlayList(playlistID).isDisplayed() && getPlayList(playlistID).getText().equals(playlistName);
        }catch (NoSuchElementException err){
            return false;
        }
    }
    private WebElement getEditField(){
        By editFieldLocator = By.xpath("//*[@class='playlist playlist editing']/input");
        wait.until(ExpectedConditions.elementToBeClickable(editFieldLocator));
        return driver.findElement(editFieldLocator);
    }

    public void renamePlaylist(String playlistID, String newName) {
        WebElement playlist = getPlayList(playlistID);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", playlist);

        Actions act = new Actions(driver);
        act.doubleClick(playlist).perform();
        getEditField().sendKeys(Keys.CONTROL+"A");
        getEditField().sendKeys(newName);
        getEditField().sendKeys(Keys.ENTER);

        By secondGreenLocator = By.xpath("//*[@class='success show' and contains (text(), '"+newName+"')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondGreenLocator));


    }
}
