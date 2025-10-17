package br.com.fiap.dao;

import br.com.fiap.to.PokemonTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonDAO {
    public ArrayList<PokemonTO> findAll() {
        ArrayList<PokemonTO> pokemons = new ArrayList<PokemonTO>();

        PokemonTO pokemon = new PokemonTO(1L, "Bulbasaur", 0.71, 6.89, "Grama/Veneno", LocalDate.now().minusMonths(6));
        pokemons.add(pokemon);

        pokemon = new PokemonTO(4L, "Charmander", 0.61, 8.48, "Fogo", LocalDate.now().minusMonths(6));
        pokemons.add(pokemon);

        pokemon = new PokemonTO(7L, "Squirtle", 0.51, 8.98, "Água", LocalDate.now().minusMonths(6));
        pokemons.add(pokemon);

        return pokemons;
    }
}
