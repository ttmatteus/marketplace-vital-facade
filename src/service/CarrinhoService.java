package service;

import model.CarrinhoDeCompras;
import  model.Cliente;
public class CarrinhoService {
    public CarrinhoDeCompras criarCarrinho(Cliente cliente) {
        return new CarrinhoDeCompras();
    }
}
