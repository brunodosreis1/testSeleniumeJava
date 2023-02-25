package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import runner.RunTest;
import support.Utils;

public class ComprasPage extends RunTest {

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
        getDriver().get("http://www.automationpratice.com.br/");

    }
    public void acessarCarrinhodeCompras() {

        getDriver().findElement(By.cssSelector("#root > div.mobile-header.sticky-header.sticky-color--golden.mobile-header-bg-color--golden.section-fluid.d-lg-block.d-xl-none > div > div > div > div.mobile-right-side > ul > li:nth-child(3) > a > span")).click();
        Utils.waitElementBePresent(By.cssSelector("#offcanvas-add-cart > div.offcanvas-add-cart-wrapper > ul.offcanvas-cart-action-button > li:nth-child(2) > a"), 20);
        getDriver().findElement(By.cssSelector("#offcanvas-add-cart > div.offcanvas-add-cart-wrapper > h4")).click();
        getDriver().findElement(By.cssSelector("#offcanvas-add-cart > div.offcanvas-add-cart-wrapper > ul.offcanvas-cart-action-button > li:nth-child(2) > a")).click();
    }

    public void preencherNome(String firstName) {
        Utils.waitElementBePresent(By.id("fname"), 20);
        getDriver().findElement(first_name).sendKeys(firstName);
    }
    public void preencherSobrenome(String lastName) {
        getDriver().findElement(last_name).sendKeys(lastName);
    }
    public void preencherCompanyName(String companyName) {
        getDriver().findElement(company_name).sendKeys(companyName);
    }
    public void selecionarCountry() {
        WebElement select_country = getDriver().findElement(By.id("country"));
        Select combobox = new Select(select_country);
        combobox.selectByVisibleText("usa");
    }
    public void selecionarCity() {
        WebElement select_city = getDriver().findElement(By.id("city"));
        Select combobox = new Select(select_city);
        combobox.selectByVisibleText("Aland Islands");
    }
    public void preencherZipCode(String zipc) {
        getDriver().findElement(zipCode).sendKeys(zipc);
    }
    public void preencherEndereco(String end) {
        getDriver().findElement(fullAddress).sendKeys(end);
    }
    public void preencherNotes(String adNotes) {
        getDriver().findElement(addNotes).sendKeys(adNotes);
    }
    public void preencherEmail(String emails) {
        getDriver().findElement(emailAddresse).sendKeys(emails);
    }

    public void clicarEmSalvar() {
        getDriver().findElement(By.cssSelector("#checkout_one > div > div > div:nth-child(1) > div > button")).click();
        }
    public void clicarEmFormadePagamento() {
        getDriver().findElement(By.id("css")).click();
    }
    public void finalizarCompra() {
        getDriver().findElement(By.cssSelector("#checkout_one > div > div > div:nth-child(2) > div:nth-child(2) > button")).click();
    }
    public void confirmarCompra() {
       String confirmarCompra = getDriver().findElement(By.cssSelector("body > div.fade.modal.show > div > div > div > div > div > div > div.col-lg-12 > div > div.col-lg-7.col-md-6 > div > h3")).getText();
        System.out.println(confirmarCompra);
    }

    public void aguardarTela() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 1000)");
        Thread.sleep(2000);
    }





}
