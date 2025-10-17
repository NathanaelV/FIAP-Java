package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        String nomePokemon, tipo, tipoBusca;
        HashMap<String, String> pokedex = new HashMap<>();
        ArrayList<String> pokemons;

        do {
            try {
                do {
                    nomePokemon = JOptionPane.showInputDialog("Digite o NOME do Pokemon. ('FIM' para sair").toUpperCase();

                    if (!nomePokemon.equalsIgnoreCase("fim")) {
                        if (!pokedex.containsKey(nomePokemon)) {
                            tipo = JOptionPane.showInputDialog("Digite o TIPO do Pokemon").toUpperCase();
                            pokedex.put(nomePokemon, tipo);
                        } else {
                            JOptionPane.showMessageDialog(null, "Pokemon já cadastrado, digite OUTRO nome");
                        }
                    }
                } while (!nomePokemon.equalsIgnoreCase("fim"));

                tipoBusca  = JOptionPane.showInputDialog("Digite um TIPO para buscar os Pokémons").toUpperCase();
                pokemons = new ArrayList<>();

                if (pokedex.containsValue(tipoBusca)) {
                    for (Map.Entry<String, String> pokemon : pokedex.entrySet()) {
                        if (pokemon.getValue().equals(tipoBusca)) {
                            pokemons.add(pokemon.getKey());
                        }
                    }
                }

                JOptionPane.showMessageDialog(null, String.format("Pokemons do tipo %s\n%s", tipoBusca, pokemons));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Deu ruim: " + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null,
                "Deseja Continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);
    }
}
