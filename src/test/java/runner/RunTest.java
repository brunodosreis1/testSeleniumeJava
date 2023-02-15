package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = { },
        features = "src/test/resources/features",
        tags = {"@finalizar-compras-no-site"},
        glue = {"steps"}
)
public class RunTest {

    public static WebDriver driver;

    @BeforeClass
    public static void star() {
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void stop() {
        driver.quit();
    }

}
