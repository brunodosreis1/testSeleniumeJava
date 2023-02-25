package pages;

import org.openqa.selenium.WebDriver;
import support.Utils;

public class SiteComprasPage extends Utils {

    WebDriver driver;

    public SiteComprasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite() {
        getDriver().get("http://automationpratice.com.br/");
    }
}
