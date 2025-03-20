package service;

import database.BancoDeDadosProdutos;
import model.Produto;
public class ProdutoService {
    private BancoDeDadosProdutos bancoDeDadosProdutos;

    public ProdutoService(BancoDeDadosProdutos bancoDeDadosProdutos) {
        this.bancoDeDadosProdutos = bancoDeDadosProdutos;
    }

    public Produto consultarProduto(int id) {
        return bancoDeDadosProdutos.buscarProduto(id);
    }
}
