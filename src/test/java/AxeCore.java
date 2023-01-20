import com.deque.html.axecore.results.ResultType;
import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import com.deque.html.axecore.selenium.AxeBuilder;
import com.deque.html.axecore.selenium.AxeReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

import static com.deque.html.axecore.selenium.AxeReporter.getReadableAxeResults;

public class AxeCore {
    @Test(priority = 1)
    public void ChromeTest(){
        //Use WebDriverManager to get correct driver (exe file)
        WebDriverManager.chromedriver().setup();

        //Start WebDriver
        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.ca");
        driver.manage().window().maximize();
        driver.get("https://testingchief.com");

        //test accessibility
        Results result = new AxeBuilder().analyze(driver);
        List<Rule> violations = result.getViolations();
        AxeReporter.writeResultsToJsonFile("D:\\Code\\java-workspace\\selenium-examples\\src\\test\\results\\testAccessibility", result);
//        AxeReporter.writeResultsToTextFile(
//                "src/test/java/results/testAccessibility", AxeReporter.getAxeResultString());

        AssertJUnit.assertEquals("Violations found", 0, violations.size());

//        driver.close();
        driver.quit();
    }

}
