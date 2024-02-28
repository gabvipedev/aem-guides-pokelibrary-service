package com.gabvipedev.pokelibrary.service.core.service.pokeapi;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.evolutionchain.EvolutionChain;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.move.Move;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.io.IOException;
import java.util.List;

public interface PokeApiService {
    public Pokemon getPokemon(int idName) throws IOException;
    public List<Pokemon> getAllPokemons() throws  IOException;
    public Move getMove(int id) throws IOException;
    public EvolutionChain getEvolutionChain(int id) throws IOException;
    public List<PokemonSpecies> getSpecies(List<Integer> ids) throws IOException;
    public PokemonSpecies getSpecie(int id) throws IOException;
}
