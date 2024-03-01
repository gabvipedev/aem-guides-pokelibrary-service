package com.gabvipedev.pokelibrary.service.core.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.PokeApiService;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.ability.Ability;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.evolutionchain.ChainLink;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.evolutionchain.EvolutionChain;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.PokemonAbility;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.PokemonType;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonspecies.PokemonSpecies;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.type.Type;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokeApiUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode getJsonNodeFromResponse(CloseableHttpResponse response) throws IOException {
        if (response.getStatusLine().getStatusCode() == 200) {
            return objectMapper.readTree(response.getEntity().getContent());
        } else {
            throw new IOException("Failed to get response. HTTP Error: " + response.getStatusLine().getStatusCode());
        }
    }

    public static <T> T deserializeJsonNode(JsonNode jsonNode, Class<T> valueType) throws IOException {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.treeToValue(jsonNode, valueType);
    }

    public static <T> List<T> deserializeJsonArray(JsonNode jsonArrayNode, Class<T> elementType) throws IOException {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(jsonArrayNode.toString(),
                TypeFactory.defaultInstance().constructCollectionType(List.class, elementType));
    }

    public static CloseableHttpResponse executeHttpGetRequest(String apiUrl, CloseableHttpClient httpClient) throws IOException {
        return HttpClients.createDefault().execute(new HttpGet(apiUrl));
    }

    public static Map<String, PokemonSpecies> getPokemonNamesFromChain(EvolutionChain evolutionChain, PokeApiService pokeApiService) throws IOException {
        Map<String, PokemonSpecies> pokemonMap = new HashMap<>();
        ChainLink currentChainLink = evolutionChain.getChain();
        List<String> ids = new ArrayList<>();
        while (currentChainLink != null) {
            NamedApiResource species = currentChainLink.getSpecies();
            if (species != null) {
                int id = StringUtils.extractIdFromUrl(species.getUrl());
                PokemonSpecies specie = pokeApiService.getSpecie(id);
                pokemonMap.put(species.getName(), specie);
            }
            if (currentChainLink.getEvolvesTo() != null && !currentChainLink.getEvolvesTo().isEmpty()) {
                currentChainLink = currentChainLink.getEvolvesTo().get(0);
            } else {
                currentChainLink = null;
            }
        }
        return pokemonMap;
    }

    /**
     *
     * @param pokeApiService
     * @param pokemon
     * @return
     * @throws IOException
     */
    public static List<Ability> getPokemonAbility(PokeApiService pokeApiService, Pokemon pokemon) throws IOException {
        List<Ability> result = new ArrayList<>();
        if(!pokemon.getAbilities().isEmpty()){
            for(PokemonAbility abilityResource : pokemon.getAbilities()){
                NamedApiResource<Ability> resource = abilityResource.getAbility();
                if(resource.getName() !=null){
                    result.add(pokeApiService.getAbility(resource.getName()));
                }

            }
        }
        return  result;
    }

    public static List<Type> getPokemonTypes(PokeApiService pokeApiService, Pokemon pokemon) throws IOException{
        List<Type> result = new ArrayList<>();
        if(!pokemon.getTypes().isEmpty()){
            for(PokemonType typeResource: pokemon.getTypes()){
                NamedApiResource<Type> resource = typeResource.getType();
                if(resource.getName() != null){
                    result.add(pokeApiService.getType(resource.getName()));
                }
            }
        }
        return result;
    }



}
