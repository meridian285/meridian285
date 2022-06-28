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

    public void renamePlaylist(String playlistID, String newName) throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='success show']")));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)", "//*[@href='#!/playlist/" + playlistID + "']");

        //Instantiating Actions class
        Actions act = new Actions(driver);
        Actions actTxt = new Actions(driver);
        WebElement txtElement = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistID + "']/text()"));
        //Locate WebElement to perform double click
        WebElement btnElement = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playlistID + "']"));
        act.doubleClick(btnElement).perform();
        System.out.println(playlistID);
        actTxt.doubleClick(txtElement);

//        getPlayList(playlistID).sendKeys(Keys.CONTROL+"a");
        System.out.println(playlistID);
        Thread.sleep(3000);
//        getPlayList(playlistID).sendKeys("44444444444444444444");
//        getPlayList(playlistID).sendKeys(Keys.ENTER);

    }
}
