package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunTest;

public class cadastroSteps extends RunTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Quando("^eu clico em cadastro$")
    public void eu_clico_em_cadastro() {
    cadastroPage.clicarParaCadastro();
    }

    @Quando("^tenho que preencher os dados$")
    public void tenho_que_preencher_os_dados() {
    cadastroPage.preencherCadastro();
    }

    @Quando("^clico em cadastrar$")
    public void clico_em_cadastrar() throws InterruptedException {
    cadastroPage.clicarParaCadastro();
    }

    @Então("^minha conta e criada$")
    public void minha_conta_e_criada() {
    cadastroPage.confirmarCadastro();
    }

}
