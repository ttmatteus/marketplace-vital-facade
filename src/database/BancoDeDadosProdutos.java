package database;

import model.Produto;
public class BancoDeDadosProdutos extends BancoDeDados {
    public void salvarProduto(int id, Produto produto) {
        salvar(String.valueOf(id), produto);
    }

    public Produto buscarProduto(int id) {
        return (Produto) buscar(String.valueOf(id));
    }
}
