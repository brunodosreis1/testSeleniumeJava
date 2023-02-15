package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

import java.time.Duration;

public class ComprasPage extends Utils {

    WebDriver driver;
    public ComprasPage(WebDriver driver) {
        this.driver = driver;
    }

    private By first_name = By.id("fname");
    private By last_name = By.id("lname");
    private By company_name = By.id("cname");
    private By selectCountry = By.id("country");
    private By states_city = By.id("city");
    private By zipCode = By.id("zip");
    private By fullAddress = By.id("faddress");
    private By addNotes = By.id("messages");
    private By emailAddresse = By.id("email");

    public void acessarSitedeCompras() {
        driver.get("http://www.automationpratice.com.br/");
    }

    public void acessarCarrinhodeCompras() {

        driver.findElement(By.cssSelector("#root > div.mobile-header.sticky-header.sticky-color--golden.mobile-header-bg-color--golden.section-fluid.d-lg-block.d-xl-none > div > div > div > div.mobile-right-side > ul > li:nth-child(3) > a > span")).click();
        waitElementBePresent(By.cssSelector("#offcanvas-add-cart > div.offcanvas-add-cart-wrapper > ul.offcanvas-cart-action-button > li:nth-child(2) > a"), 20);
        driver.findElement(By.cssSelector("#offcanvas-add-cart > div.offcanvas-add-cart-wrapper > h4")).click();
        driver.findElement(By.cssSelector("#offcanvas-add-cart > div.offcanvas-add-cart-wrapper > ul.offcanvas-cart-action-button > li:nth-child(2) > a")).click();
    }

    public void preencherNome(String firstName) {
        waitElementBePresent(By.id("fname"), 20);
        driver.findElement(first_name).sendKeys(firstName);
    }
    public void preencherSobrenome(String lastName) {
        driver.findElement(last_name).sendKeys(lastName);
    }
    public void preencherCompanyName(String companyName) {
        driver.findElement(company_name).sendKeys(companyName);
    }
    public void selecionarCountry() {
        WebElement select_country = driver.findElement(By.id("country"));
        Select combobox = new Select(select_country);
        combobox.selectByVisibleText("usa");
    }
    public void selecionarCity() {
        WebElement select_city = driver.findElement(By.id("city"));
        Select combobox = new Select(select_city);
        combobox.selectByVisibleText("Aland Islands");
    }
    public void preencherZipCode(String zipc) {
        driver.findElement(zipCode).sendKeys(zipc);
    }
    public void preencherEndereco(String end) {
        driver.findElement(fullAddress).sendKeys(end);
    }
    public void preencherNotes(String adNotes) {
        driver.findElement(addNotes).sendKeys(adNotes);
    }
    public void preencherEmail(String emails) {
        driver.findElement(emailAddresse).sendKeys(emails);
    }

    public void clicarEmSalvar() {
        driver.findElement(By.cssSelector("#checkout_one > div > div > div:nth-child(1) > div > button")).click();
        }
    public void clicarEmFormadePagamento() {
        driver.findElement(By.id("css")).click();
    }
    public void finalizarCompra() {
        driver.findElement(By.cssSelector("#checkout_one > div > div > div:nth-child(2) > div:nth-child(2) > button")).click();
    }
    public void confirmarCompra() {
       String confirmarCompra = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div > div > div > div > div.col-lg-12 > div > div.col-lg-7.col-md-6 > div > h3")).getText();
        System.out.println(confirmarCompra);
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 1000)");
        Thread.sleep(2000);
    }





}
