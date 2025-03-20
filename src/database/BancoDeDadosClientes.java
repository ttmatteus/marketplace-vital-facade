package database;

import model.Cliente;

public class BancoDeDadosClientes extends BancoDeDados {
    public void salvarCliente(String cpf, Cliente cliente) {
        salvar(cpf, cliente);
    }

    public Cliente buscarCliente(String cpf) {
        return (Cliente) buscar(cpf);
    }
}
