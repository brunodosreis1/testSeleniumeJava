package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunTest;
import support.Utils;


public class CadastroPage extends RunTest {

    private By email_page = By.id("email");

    public void clicarParaCadastro() {
        getDriver().findElement(By.cssSelector("#top_header > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > a")).click();
    }

    public void preencherCadastro() {
        Utils.waitElementBePresent(By.id("user"), 10);
        getDriver().findElement(By.id("user")).sendKeys("Testes");
        getDriver().findElement(email_page).sendKeys(Utils.getRandomEmail());
        getDriver().findElement(By.id("password")).sendKeys("testes123");
    }

    public void clicarEmCadastrar() {
        getDriver().findElement(By.id("btnRegister")).click();
    }

    public void confirmarCadastro() {
        Utils.waitElementBePresent(By.id("swal2-title"), 20);
        String textoLoginSucesso = getDriver().findElement(By.id("swal2-title")).getText();
        Assert.assertEquals("Os textos não são iguais!", "Cadastro realizado!", textoLoginSucesso);
    }


}
