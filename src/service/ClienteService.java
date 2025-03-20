package service;

import database.BancoDeDadosClientes;
import model.Cliente;
public class ClienteService {
    private BancoDeDadosClientes bancoDeDadosClientes;

    public ClienteService(BancoDeDadosClientes bancoDeDadosClientes) {
        this.bancoDeDadosClientes = bancoDeDadosClientes;
    }

    public void registrarCliente(String nome, String cpf, String endereco) {
        Cliente cliente = new Cliente(nome, cpf, endereco);
        bancoDeDadosClientes.salvarCliente(cpf, cliente);
    }

    public Cliente consultarCliente(String cpf) {
        return bancoDeDadosClientes.buscarCliente(cpf);
    }
}
