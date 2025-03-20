package service;

import model.Compra;
import model.Cliente;
import model.Produto;

import java.util.List;
public class CompraService {
    public void processarCompra(Cliente cliente, List<Produto> produtos) {
        double total = produtos.stream().mapToDouble(Produto::getPreco).sum();
        Compra Compra = new Compra(cliente, produtos, total);
    }
}
