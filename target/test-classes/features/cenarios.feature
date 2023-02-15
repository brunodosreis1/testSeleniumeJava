# language: pt

  @cadastro
  Funcionalidade: Cadastro cliente e Finalizar compra

  @cadastro-sucesso
  Cenário: Fazer cadastro no site
    Dado que eu estou no site de compras
    Quando eu clico em cadastro
    E tenho que preencher os dados
    E clico em cadastrar
    Então minha conta e criada


    @finalizar-compras-no-site
    Cenário: preencher meus dados e finalizar compra
      Dado que eu estou no carrinho de compras
      Então tenho que preencher meus dados
      E clico em salvar
      E escolho a forma de pagamento
      E clico em place Order
      Então minha compra é finalizada com sucesso