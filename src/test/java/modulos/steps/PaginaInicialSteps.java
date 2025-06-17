package modulos.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import modulos.paginas.PaginaInicialPage;
import modulos.utils.DriverConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class PaginaInicialSteps {

    private WebDriver navegador;
    private PaginaInicialPage paginaInicial;

    @Before
    public void before() {
        DriverConfig.configurarDriverDoNavegadorWeb();
        navegador = DriverConfig.retornarDriverDoNavegador();
        paginaInicial = new PaginaInicialPage(navegador);

    }

    //CT1
    @Dado("que o usuario acessou a pagina Inicial")
    public void que_o_usuario_acessou_a_pagina_inicial() {

        navegador.get("https://www.amazon.com.br/s?k=bola&__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=15U5IT3LHEAGV&sprefix=bola%2Caps%2C205&ref=nb_sb_noss_1");
        navegador.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        //String tituloDaPagina = navegador.getTitle();
        // if (!tituloDaPagina.equals("Amazon Prime")) {
        //    navegador.navigate().refresh();
        // }

    }

    @Quando("digitar um produto valido")
    public void digitar_um_produto_valido() {
        paginaInicial.digitarNoCampoPesquisar("Bola");
    }

    @E("selecionar o botao da Lupa para submeter a pesquisa")
    public void selecionar_o_botao_da_lupa_para_submeter_a_pesquisa() {
        paginaInicial.submeterBusca();
    }

    @Entao("exibe a pagina do produto com sucesso")
    public void exibe_a_pagina_do_produto_com_sucesso() {
        String textoAtual = navegador.findElement(By.cssSelector("h2.a-size-base.a-spacing-small.a-spacing-top-small.a-text-normal")).getText();
        System.out.println("texto da tag h2: " + textoAtual);
        Assert.assertTrue(textoAtual.contains("resultados para \"Bola\""));

    }

    //CT2
    @Quando("digitar um produto")
    public void digitar_um_produto() {
        paginaInicial.digitarNoCampoPesquisar("pedaço de um foguete de verdade");
    }

    @Entao("exibe a pagina com a mensagem de insucesso para a busca do produto")
    public void exibe_a_pagina_com_a_mensagem_de_insucesso_para_a_busca_do_produto() {
        String textoAtual = navegador.findElement(By.xpath("//div[@class='s-no-outline']//h2")).getText();
        System.out.println("texto da tag h2: " + textoAtual);
        Assert.assertEquals("Nenhum resultado para pedaço de um foguete de verdade.", textoAtual);

    }

    //CT3
    @Entao("deve exibir no maximo ate {int} sugestoes de pesquisa para o termo inicial pesquisado")
    public void deve_exibir_no_maximo_ate_sugestoes_de_pesquisa_para_o_termo_inicial_pesquisado(int valorEsperado) throws InterruptedException {
        Thread.sleep(5);
        List<WebElement> qtdOpcoesSugeridas = navegador.findElements(By.cssSelector(".s-suggestion"));
        System.out.println(qtdOpcoesSugeridas.size());
        Assert.assertTrue(qtdOpcoesSugeridas.size() <= valorEsperado);
    }

    @After
    public void after() {
        DriverConfig.fecharDriverDoNavegador();
    }

}
