package steps;

import cucumber.api.java.pt.Dado;
import pages.CadastroPage;
import pages.SiteComprasPage;
import runner.RunTest;

public class siteComprasSteps extends RunTest {

    SiteComprasPage siteComprasPage = new SiteComprasPage(driver);

    @Dado("^que eu estou no site de compras$")
    public void que_eu_estou_no_site_de_compras() {
        siteComprasPage.acessarSite();
    }

}
