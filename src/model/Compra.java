package model;

import java.util.List;
public class Compra {
    private  Cliente cliente;
    private List<Produto> produtos;
    private double total;

    public Compra(Cliente cliente, List<Produto> produtos, double total) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = total;
    }
}
