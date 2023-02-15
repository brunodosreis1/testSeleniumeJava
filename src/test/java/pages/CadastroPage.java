package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;
    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    private By email_page = By.id("email");

    public void clicarParaCadastro() {
        driver.findElement(By.cssSelector("#top_header > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")).click();
    }

    public void preencherCadastro() {
        waitElementBePresent(By.id("user"), 10);
        driver.findElement(By.id("user")).sendKeys("Testes");
        driver.findElement(email_page).sendKeys(getRandomEmail());
        driver.findElement(By.id("password")).sendKeys("testes123");
    }

    public void clicarEmCadastrar() {
        driver.findElement(By.id("btnRegister")).click();
    }

    public void confirmarCadastro() {
        waitElementBePresent(By.id("swal2-title"), 20);
        String texto_confirmacao = driver.findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("o cadastro não foi finalizado!", "Cadastro realizado!", texto_confirmacao);
        System.out.println(texto_confirmacao);
    }


}
