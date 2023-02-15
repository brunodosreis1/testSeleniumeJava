package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.ComprasPage;
import runner.RunTest;

public class FazerComprasSteps extends RunTest {

    ComprasPage comprasPage = new ComprasPage(driver);

    @Dado("^que eu estou no carrinho de compras$")
    public void que_eu_estou_no_carrinho_de_compras() {
        comprasPage.acessarSitedeCompras();
        comprasPage.acessarCarrinhodeCompras();
    }

    @Então("^tenho que preencher meus dados$")
    public void tenho_que_preencher_meus_dados() {
        comprasPage.preencherNome("Bruno");
        comprasPage.preencherSobrenome("Silva");
        comprasPage.preencherCompanyName("Qazando");
        comprasPage.preencherEmail("testes123@hotmail.com");
        comprasPage.selecionarCountry();
        comprasPage.selecionarCity();
        comprasPage.preencherZipCode("38400-046");
        comprasPage.preencherEndereco("Adelino Franco");
        comprasPage.preencherNotes("finalizar compra");
    }

    @Então("^clico em salvar$")
    public void clico_em_salvar() throws InterruptedException {
        comprasPage.scrollDown();
        comprasPage.clicarEmSalvar();
    }

    @Então("^escolho a forma de pagamento$")
    public void escolho_a_forma_de_pagamento() {
        comprasPage.clicarEmFormadePagamento();
    }

    @Então("^clico em place Order$")
    public void clico_em_place_Order() {
        comprasPage.finalizarCompra();
    }

    @Então("^minha compra é finalizada com sucesso$")
    public void minha_compra_é_finalizada_com_sucesso() {
        comprasPage.confirmarCompra();
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }
}
