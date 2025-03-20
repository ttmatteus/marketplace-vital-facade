package database;

import java.util.HashMap;
import java.util.Map;
public class BancoDeDados {
    private Map<String, Object> dados;

    public BancoDeDados() {
        this.dados = new HashMap<>();
    }

    public void salvar(String chave, Object valor) {
        dados.put(chave, valor);
    }

    public Object buscar(String chave) {
        return dados.get(chave);
    }
}
