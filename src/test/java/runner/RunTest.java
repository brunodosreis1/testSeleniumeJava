package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = { },
        features = "src/test/resources/features",
        tags = {"@cadastro-sucesso"},
        glue = {"steps"}
)
public class RunTest extends RunBase {
    @AfterClass
    public static void stop() {
        getDriver().quit();
    }

}
