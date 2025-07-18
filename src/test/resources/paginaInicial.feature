#language: pt

Funcionalidade: Pagina Inicial

  @Positivo
    Cenario: Realizar pesquisa de produto com sucesso
      Dado que o usuario acessou a pagina Inicial
      Quando digitar um produto valido
      E selecionar o botao da Lupa para submeter a pesquisa
      Entao exibe a pagina do produto com sucesso

  @Negativo
    Cenario: Realizar pesquisa de um produto sem sucesso
      Dado que o usuario acessou a pagina Inicial
      Quando digitar um produto
      E selecionar o botao da Lupa para submeter a pesquisa
      Entao exibe a pagina com a mensagem de insucesso para a busca do produto

  @Positivo
    Cenario: Validar que seja exibido ate 10 sugestoes de pesquisa relacionadas ao termo inicial pesquisado
      Dado que o usuario acessou a pagina Inicial
      Quando digitar um produto valido
      Entao deve exibir no maximo ate 10 sugestoes de pesquisa para o termo inicial pesquisado
