package com.gabvipedev.pokelibrary.service.core.service.pokeapi;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.evolution.EvolutionChain;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves.MoveDetail;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.Species;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.species.PokemonSpecies;

import java.io.IOException;
import java.util.List;

public interface PokeApiService {
    public Pokemon getPokemon(int idName) throws IOException;
    public List<Pokemon> getAllPokemons() throws  IOException;
    public MoveDetail getMove(int id) throws IOException;
    public EvolutionChain getEvolutionChain(int id) throws IOException;
    public List<PokemonSpecies> getSpecies(List<Integer> ids) throws IOException;
    public PokemonSpecies getSpecie(int id) throws IOException;
}
