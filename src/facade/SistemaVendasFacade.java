package facade;

import model.Cliente;
import model.Produto;
import service.ClienteService;
import service.ProdutoService;
import service.CarrinhoService;
import service.CompraService;
import database.BancoDeDadosClientes;
import database.BancoDeDadosProdutos;

import java.util.List;

public class SistemaVendasFacade {
    private ClienteService clienteService;
    private ProdutoService produtoService;
    private CarrinhoService carrinhoService;
    private CompraService compraService;

    public SistemaVendasFacade() {
        BancoDeDadosClientes bancoDeDadosClientes = new BancoDeDadosClientes();
        BancoDeDadosProdutos bancoDeDadosProdutos = new BancoDeDadosProdutos();
        this.clienteService = new ClienteService(bancoDeDadosClientes);
        this.produtoService = new ProdutoService(bancoDeDadosProdutos);
        this.carrinhoService = new CarrinhoService();
        this.compraService = new CompraService();
        System.out.println("Sistema de Vendas inicializado com sucesso!");
    }

    public void registrarCliente(String nome, String cpf, String endereco) {
        System.out.println("\n=== Registrando um novo cliente ===");
        clienteService.registrarCliente(nome, cpf, endereco);
        System.out.println("Cliente '" + nome + "' registrado com sucesso!");
    }

    public Cliente consultarCliente(String cpf) {
        System.out.println("\n=== Consultando cliente por CPF ===");
        Cliente cliente = clienteService.consultarCliente(cpf);
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Endereço: " + cliente.getEndereco());
        } else {
            System.out.println("Cliente não encontrado!");
        }
        return cliente;
    }

    public Produto consultarProduto(int id) {
        System.out.println("\n=== Consultando produto por ID ===");
        Produto produto = produtoService.consultarProduto(id);
        if (produto != null) {
            System.out.println("Produto encontrado:");
            System.out.println("ID: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$" + produto.getPreco());
        } else {
            System.out.println("Produto não encontrado!");
        }
        return produto;
    }

    public void processarCompra(Cliente cliente, List<Produto> produtos) {
        System.out.println("\n=== Processando uma compra ===");
        compraService.processarCompra(cliente, produtos);
        System.out.println("Compra processada com sucesso!");
    }
}