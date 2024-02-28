package com.gabvipedev.pokelibrary.service.core.service.pokeapi;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berry.Berry;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berryfirmness.BerryFirmness;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berryflavor.BerryFlavor;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.contesteffect.ContestEffect;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.contesttype.ContestType;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.evolutionchain.EvolutionChain;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.move.Move;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonspecies.PokemonSpecies;
import org.eclipse.jetty.util.IO;

import java.io.IOException;
import java.util.List;

public interface PokeApiService {
    public Pokemon getPokemon(int idName) throws IOException;
    public List<Pokemon> getAllPokemons() throws  IOException;
    public Move getMove(int id) throws IOException;
    public EvolutionChain getEvolutionChain(int id) throws IOException;
    public List<PokemonSpecies> getSpecies(List<Integer> ids) throws IOException;
    public PokemonSpecies getSpecie(int id) throws IOException;
    public Berry getBerry(String idName) throws IOException;
    public BerryFirmness getBerryFirmness(String idName) throws IOException;
    public BerryFlavor getBerryFlavor(String idName) throws IOException;
    public ContestType getContestType(String idName) throws IOException;
    public ContestEffect getContestEffect(String idName) throws IOException;
}
