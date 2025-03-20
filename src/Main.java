import model.Cliente;
import model.Produto;
import facade.SistemaVendasFacade;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaVendasFacade facade = new SistemaVendasFacade();

        facade.registrarCliente("Matteus Guylherme", "123.456.789-00", "Rua Teste, 123");

        Cliente cliente = facade.consultarCliente("123.456.789-00");

        Produto produto = new Produto(1, "Notebook", 3500.00);

        facade.processarCompra(cliente, List.of(produto));

        System.out.println("\n=== Validação concluída! ===");
    }
}