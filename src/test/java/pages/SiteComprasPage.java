package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class SiteComprasPage extends Utils {

    WebDriver driver;

    public SiteComprasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite() {
        driver.get("http://automationpratice.com.br/");
    }
}
