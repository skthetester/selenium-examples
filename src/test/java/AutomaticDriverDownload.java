import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutomaticDriverDownload {
    @Test(priority = 1)
    public void ChromeTest(){
        //Use WebDriverManager to get correct driver (exe file)
        WebDriverManager.chromedriver().setup();

        //Start WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.ca");
        driver.close();
        driver.quit();
    }

    @Test(priority = 2)
    public void FirefoxTest(){
        //Use WebDriverManager to get correct driver (exe file)
        WebDriverManager.firefoxdriver().setup();

        //Start WebDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.ca");
        driver.close();
        driver.quit();
    }

    @Test(priority = 3)
    public void EdgeTest(){
        //Use WebDriverManager to get correct driver (exe file)
        WebDriverManager.edgedriver().setup();

        //Start WebDriver
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.ca");
        driver.close();
        driver.quit();
    }
}
