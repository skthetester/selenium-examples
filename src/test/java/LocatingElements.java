import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatingElements {
    @Test
    public void GoogleTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        /*05. Web Element Locators - Most Used and Most Important*/
        //id - use when it is unique and static
        //name - use when it is unique and static
        //css selector - most efficient and preferred - medium difficulty
        //xpath - easy to use but poor performance
        //class name - difficult to use, compound class names not supported (with spaces)
        //tagname - usually will have duplicates. use only when you will have to get more than 1 element of same tagname
        //linktext - works only for hyperlinks, use actual text
        //partiallinktext - works only for hyperlinks, use partial text

        WebElement searchElement = driver.findElement(By.name("q"));


        /*06. Perform Actions on WebElements*/
        searchElement.clear();
        searchElement.click();
        searchElement.sendKeys("software testing");
//        searchElement.sendKeys(Keys.ENTER);
        searchElement.sendKeys(Keys.TAB);

        //Additional interactions with a new webelement
        WebElement searchBtn = driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']"));
        searchBtn.click();

        driver.close();
        driver.quit();
    }
}
