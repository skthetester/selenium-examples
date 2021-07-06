import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserManipulation {
    @Test
    public void test() {
        //01. Start WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sivak\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //03. Open a Webpage
        /*Waits till the page is loaded for the next action*/
        /*Preferred*/
        driver.get("https://testingchief.com");

        //04. Another way to open a webpage
        /*DOES NOT wait till the page is loaded for the next action*/
        driver.navigate().to("https://google.com");
        /*navigate() has additional methods to go back and forth*/
        driver.navigate().to("https://testingchief.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        //02. Close WebDriver
        driver.close();
        driver.quit();
    }
}
