package com.gabvipedev.pokelibrary.service.core.service.pokeapi.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.PokeApiService;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.evolution.EvolutionChain;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves.MoveDetail;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.Species;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.species.PokemonSpecies;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.config.PokeApiConfig;
import com.gabvipedev.pokelibrary.service.core.utils.PokeApiUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component(service = PokeApiService.class, immediate = true)
@Designate(ocd = PokeApiConfig.Configuration.class)
public class PokeApiServiceImpl implements PokeApiService {

    private static final Logger LOG = LoggerFactory.getLogger(PokeApiServiceImpl.class);

    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    private PokeApiConfig.Configuration configuration;

    @Activate
    protected void activate(PokeApiConfig.Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Pokemon getPokemon(int idOrName) throws IOException {
        String apiUrl = configuration.pokeApiBaseUrl() + configuration.pokemonEndpoint() + "/" + idOrName;
        try (CloseableHttpResponse response = PokeApiUtils.executeHttpGetRequest(apiUrl)) {
            JsonNode jsonNode = PokeApiUtils.getJsonNodeFromResponse(response);
            return PokeApiUtils.deserializeJsonNode(jsonNode, Pokemon.class);
        }
    }

    @Override
    public List<Pokemon> getAllPokemons() throws IOException {
        String apiUrl = configuration.pokeApiBaseUrl() + configuration.pokemonEndpoint();
        try (CloseableHttpResponse response = PokeApiUtils.executeHttpGetRequest(apiUrl)) {
            JsonNode rootNode = PokeApiUtils.getJsonNodeFromResponse(response);
            return PokeApiUtils.deserializeJsonArray(rootNode, Pokemon.class);
        }
    }

    @Override
    public MoveDetail getMove(int idOrName) throws IOException {
        String apiUrl = configuration.pokeApiBaseUrl() + configuration.moveEndpoint() + "/" + idOrName;
        try (CloseableHttpResponse response = PokeApiUtils.executeHttpGetRequest(apiUrl)) {
            JsonNode rootNode = PokeApiUtils.getJsonNodeFromResponse(response);
            return PokeApiUtils.deserializeJsonNode(rootNode, MoveDetail.class);
        }
    }


    @Override
    public EvolutionChain getEvolutionChain(int id) throws IOException{
        String apiUrl = configuration.pokeApiBaseUrl() + configuration.evolutionEndpoint() + "/" + id;
        try (CloseableHttpResponse response = PokeApiUtils.executeHttpGetRequest(apiUrl)) {
            JsonNode rootNode = PokeApiUtils.getJsonNodeFromResponse(response);
            return PokeApiUtils.deserializeJsonNode(rootNode, EvolutionChain.class);
        }
    }

    public List<PokemonSpecies> getSpecies(List<Integer> ids) throws IOException {
        List<PokemonSpecies> speciesList = new ArrayList<>();
        for (int id : ids) {
            PokemonSpecies species = getSpecie(id);
            speciesList.add(species);
        }
        return speciesList;
    }

    public PokemonSpecies getSpecie(int id) throws IOException {
        String apiUrl = configuration.pokeApiBaseUrl() + configuration.speciesEndpoint() + "/" + id;
        try (CloseableHttpResponse response = PokeApiUtils.executeHttpGetRequest(apiUrl)) {
            JsonNode rootNode = PokeApiUtils.getJsonNodeFromResponse(response);
            return PokeApiUtils.deserializeJsonNode(rootNode, PokemonSpecies.class);
        }
    }


}
