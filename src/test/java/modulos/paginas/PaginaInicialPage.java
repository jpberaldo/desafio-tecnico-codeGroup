package modulos.paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicialPage {

   WebDriver navegador;

    public PaginaInicialPage(WebDriver navegador) {
        this.navegador = navegador;
        PageFactory.initElements(this.navegador, this);
    }
}
