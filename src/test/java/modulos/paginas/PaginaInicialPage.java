package modulos.paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicialPage {

    WebDriver navegador;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement campoParaEscreverABusca;

    @FindBy(id = "nav-search-submit-button")
    private WebElement botaoSubmeterBusca;

    public PaginaInicialPage(WebDriver navegador) {
        this.navegador = navegador;
        PageFactory.initElements(this.navegador, this);
    }

    public PaginaInicialPage digitarNoCampoPesquisar(String palavra) {
        campoParaEscreverABusca.clear();
        campoParaEscreverABusca.sendKeys(palavra);
        return this;
    }

    public PaginaInicialPage submeterBusca() {
        botaoSubmeterBusca.click();
        return this;
    }
}
