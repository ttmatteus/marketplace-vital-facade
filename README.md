# 🛒 Sistema de Vendas - Facade Pattern

## Sobre o Projeto
Seja bem-vindo ao **Sistema de Vendas**! Aqui usamos o padrão **Facade** para deixar tudo mais simples e direto ao ponto. Em vez de se preocupar com um monte de serviços separados, você usa apenas a `SistemaVendasFacade` e pronto! Sem dor de cabeça.

## Como Funciona?
Nos bastidores, o sistema está dividido em algumas partes:

- **📦 Modelos (`model`)**:
    - `Cliente`: Representa um cliente.
    - `Produto`: Representa um produto.
- **⚙️ Serviços (`service`)**:
    - `ClienteService`: Cuida do cadastro e busca de clientes.
    - `ProdutoService`: Consulta produtos.
    - `CarrinhoService`: Gerencia os produtos no carrinho.
    - `CompraService`: Finaliza compras.
- **💾 Banco de Dados Simulado (`database`)**:
    - `BancoDeDadosClientes`: Simula um banco de clientes.
    - `BancoDeDadosProdutos`: Simula um banco de produtos.
- **🎛️ Facade (`facade`)**:
    - `SistemaVendasFacade`: O "controle remoto" do sistema. Com ele, você pode:
        - Registrar clientes 📝
        - Consultar clientes pelo CPF 🔍
        - Consultar produtos pelo ID 🏷️
        - Processar compras 💰

## Exemplo de Uso
```java
SistemaVendasFacade sistema = new SistemaVendasFacade();

// Registrar um cliente
sistema.registrarCliente("Teteu", "000.000.000-00", "Rua Teste, 1234");

// Consultar um cliente
Cliente cliente = sistema.consultarCliente("000.000.000-00");

// Consultar um produto
Produto produto = sistema.consultarProduto(1);

// Finalizar uma compra
List<Produto> produtos = List.of(produto);
sistema.processarCompra(cliente, produtos);
```

## Por que usar o Facade Pattern?
- **Simplifica** a interação com o sistema, sem precisar chamar mil serviços diferentes.
- **Organiza** melhor o código, deixando tudo mais claro.
- **Facilita a manutenção**, porque agora você mexe em um lugar só.



