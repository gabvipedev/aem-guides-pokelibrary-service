package com.gabvipedev.pokelibrary.service.core.service.pokeapi.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.PokeApiService;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.config.PokeApiConfig;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.evolutionchain.EvolutionChain;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.move.Move;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonspecies.PokemonSpecies;
import com.gabvipedev.pokelibrary.service.core.utils.PokeApiUtils;
import org.apache.http.client.config.RequestConfig;
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

    private CloseableHttpClient httpClient;

    private PokeApiConfig.Configuration configuration;

    @Activate
    protected void activate(PokeApiConfig.Configuration configuration) {
        this.configuration = configuration;
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)
                .setSocketTimeout(5000)
                .build();

        httpClient = HttpClients.custom()
                .setDefaultRequestConfig(requestConfig)
                .build();
    }

    public Pokemon getPokemon(int idOrName) throws IOException {
        return getPokeApiData(configuration.pokemonEndpoint() + "/" + idOrName, Pokemon.class);
    }

    @Override
    public List<Pokemon> getAllPokemons() throws IOException {
        String endpoint = configuration.pokemonEndpoint();
        return getPokeApiData(endpoint, List.class);
    }

    @Override
    public Move getMove(int idOrName) throws IOException {
        return getPokeApiData(configuration.moveEndpoint() + "/" + idOrName, Move.class);
    }

    @Override
    public EvolutionChain getEvolutionChain(int id) throws IOException {
        return getPokeApiData(configuration.evolutionEndpoint() + "/" + id, EvolutionChain.class);
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
        return getPokeApiData(configuration.speciesEndpoint() + "/" + id, PokemonSpecies.class);
    }

    private <T> T getPokeApiData(String endpoint, Class<T> clazz) throws IOException {
        String apiUrl = configuration.pokeApiBaseUrl() + endpoint;
        try (CloseableHttpResponse response = PokeApiUtils.executeHttpGetRequest(apiUrl, httpClient)) {
            JsonNode rootNode = PokeApiUtils.getJsonNodeFromResponse(response);
            return PokeApiUtils.deserializeJsonNode(rootNode, clazz);
        }
    }


}
