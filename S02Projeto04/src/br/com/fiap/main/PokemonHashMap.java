package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemons = new HashMap<>();

        do {
            try {
                String nome, tipo;

                // Cadastro de pokémon e seu tipo
                do {
                    nome = JOptionPane.showInputDialog("Digite o NOME de um pokémon ou digite FIM para encerrar").toUpperCase();

                    if (!nome.equals("FIM")) {
                        if (pokemons.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Este pokémon já foi cadastrado!");
                        } else {
                            tipo = JOptionPane.showInputDialog("Digite o TIPO do pokémon informado anteriormente").toUpperCase();
                            pokemons.put(nome, tipo);
                        }
                    }
                } while (!nome.equals("FIM"));

                // Busca de pokemons pelo seu tipo
                String escolha = JOptionPane.showInputDialog("Digite um tipo de pokemon a sua escolha").toUpperCase();

                ArrayList<String> nomesEncontrados = new ArrayList<>();
                for (Map.Entry<String, String> pokemon : pokemons.entrySet()) {
                    if (pokemon.getValue().equals(escolha)) {
                        nomesEncontrados.add(pokemon.getKey());
                    }
                }

                // Só mostra se houver tipos cadastrados
                if (nomesEncontrados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum pokémon do tipo: " + escolha);
                } else {
                    JOptionPane.showMessageDialog(null, "Os pokémons do tipo: " + escolha + " são:\n" + nomesEncontrados);
                }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de Programa", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
