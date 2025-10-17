package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
        pessoa.put("Raphael", 18);
        pessoa.put("Leonardo", 25);
        pessoa.put("Michelangelo", 18);

        for (Map.Entry<String, Integer> valor : pessoa.entrySet()) {
            System.out.printf("Chave: %s\tValor: %d\n", valor.getKey(), valor.getValue());
        }
    }
}
