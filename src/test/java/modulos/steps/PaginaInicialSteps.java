package modulos.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;

public class PaginaInicialSteps {

    private static WebDriver navegador;

    @Before
    @DisplayName("Executar antes de cada teste")
    public void before() {
        navegador.get("https://www.amazon.com.br/");

    }

    @Dado("que o usuario acessou a pagina Inicial")
    public void que_o_usuario_acessou_a_pagina_inicial() {

    }

    @Quando("digitar um produto valido")
    public void digitar_um_produto_valido() {

    }

    @E("selecionar o botão da Lupa para processar a pesquisa")
    public void selecionar_o_botão_da_lupa_para_processar_a_pesquisa() {

    }

    @Entao("exibe a pagina do produto com sucesso")
    public void exibe_a_pagina_do_produto_com_sucesso() {
    }

    @After
    @DisplayName("Executar depois de cada teste")
    public void after() {
        navegador.quit();
    }

}
