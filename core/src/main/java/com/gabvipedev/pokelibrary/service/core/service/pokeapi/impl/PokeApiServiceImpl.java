package com.gabvipedev.pokelibrary.service.core.service.pokeapi.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.PokeApiService;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.config.PokeApiConfig;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berry.Berry;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berryfirmness.BerryFirmness;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berryflavor.BerryFlavor;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.contesteffect.ContestEffect;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.contesttype.ContestType;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.encountercondition.EncounterCondition;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.encounterconditionvalue.EncounterConditionValue;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.encountermethod.EncounterMethod;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.evolutionchain.EvolutionChain;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.evolutiontrigger.EvolutionTrigger;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.generation.Generation;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.item.Item;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.itemattribute.ItemAttribute;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.itemcategory.ItemCategory;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.itemflingeffect.ItemFlingEffect;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.itempocket.ItemPocket;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.location.Location;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.locationarea.LocationArea;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.machine.Machine;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.move.Move;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokedex.Pokedex;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonspecies.PokemonSpecies;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.region.Region;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.supercontesteffect.SuperContestEffect;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.version.Version;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.versiongroup.VersionGroup;
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
    public Berry getBerry(String idName) throws IOException{
        return getPokeApiData(configuration.berryEndpoint() + "/" + idName, Berry.class);
    }
    public BerryFirmness getBerryFirmness(String idName) throws IOException{
        return getPokeApiData(configuration.berryFirmnessEndpoint() + "/" + idName, BerryFirmness.class);
    }
    public BerryFlavor getBerryFlavor(String idName) throws IOException{
        return getPokeApiData(configuration.berryFirmnessEndpoint() + "/" + idName, BerryFlavor.class);
    }
    public ContestType getContestType(String idName) throws IOException{
        return getPokeApiData(configuration.contestTypeEndpoint() + "/" + idName, ContestType.class);
    }
    public ContestEffect getContestEffect(String idName) throws IOException{
        return getPokeApiData(configuration.contestEffectEndpoint() + "/" + idName, ContestEffect.class);
    }
    public SuperContestEffect getSuperContestEffect(int id) throws IOException{
        return getPokeApiData(configuration.superContestEffectEndpoint() + "/" + id, SuperContestEffect.class);
    }
    public EncounterMethod getEncounterMethod(String idName) throws IOException{
        return getPokeApiData(configuration.encounterMethodEndpoint() + "/" + idName, EncounterMethod.class);
    }
    public EncounterCondition getEncounterCondition(String idName) throws IOException{
        return getPokeApiData(configuration.encounterConditionsEndpoint() + "/" + idName, EncounterCondition.class);
    }
    public EncounterConditionValue getEncounterConditionValue(String idName) throws IOException{
        return getPokeApiData(configuration.encounterConditionsEndpoint() + "/" + idName, EncounterConditionValue.class);
    }
    @Override
    public EvolutionChain getEvolutionChain(int id) throws IOException {
        return getPokeApiData(configuration.evolutionEndpoint() + "/" + id, EvolutionChain.class);
    }
    @Override
    public EvolutionTrigger getEvolutionTrigger(String idName) throws IOException {
        return getPokeApiData(configuration.evolutionEndpoint() + "/" + idName, EvolutionTrigger.class);
    }
    @Override
    public Generation getGeneration(String idName) throws IOException {
        return getPokeApiData(configuration.generationEndpoint() + "/" + idName, Generation.class);
    }
    @Override
    public Pokedex getPokedex(String idName) throws IOException {
        return getPokeApiData(configuration.pokedexEndpoint() + "/" + idName, Pokedex.class);
    }
    @Override
    public Version getVersion(String idName) throws IOException {
        return getPokeApiData(configuration.versionEndpoint() + "/" + idName, Version.class);
    }
    @Override
    public VersionGroup getVersionGroup(String idName) throws IOException {
        return getPokeApiData(configuration.versionGroupEndpoint() + "/" + idName, VersionGroup.class);
    }
    @Override
    public Item getItem(String idName) throws IOException {
        return getPokeApiData(configuration.itemEndpoint() + "/" + idName, Item.class);
    }
    @Override
    public ItemAttribute getItemAttribute(String idName) throws IOException {
        return getPokeApiData(configuration.itemAttributesEndpoint() + "/" + idName, ItemAttribute.class);
    }
    @Override
    public ItemCategory getItemCategory(String idName) throws IOException {
        return getPokeApiData(configuration.itemCategoriesEndpoint() + "/" + idName, ItemCategory.class);
    }
    @Override
    public ItemFlingEffect getItemFlingEffect(String idName) throws IOException {
        return getPokeApiData(configuration.itemFlingEffectsEndpoint() + "/" + idName, ItemFlingEffect.class);
    }
    @Override
    public ItemPocket getItemPocket(String idName) throws IOException {
        return getPokeApiData(configuration.itemPocketEndpoint() + "/" + idName, ItemPocket.class);
    }
    @Override
    public Location getLocation(String idName) throws IOException {
        return getPokeApiData(configuration.locationEndpoint() + "/" + idName, Location.class);
    }
    @Override
    public LocationArea getLocationArea(String idName) throws IOException {
        return getPokeApiData(configuration.locationAreaEndpoint() + "/" + idName, LocationArea.class);
    }
    @Override
    public Region getRegion(String idName) throws IOException {
        return getPokeApiData(configuration.regionsEndpoint() + "/" + idName, Region.class);
    }
    @Override
    public Machine getMachine(String idName) throws IOException {
        return getPokeApiData(configuration.machineEndpoint() + "/" + idName, Machine.class);
    }


    private <T> T getPokeApiData(String endpoint, Class<T> clazz) throws IOException {
        String apiUrl = configuration.pokeApiBaseUrl() + endpoint;
        try (CloseableHttpResponse response = PokeApiUtils.executeHttpGetRequest(apiUrl, httpClient)) {
            JsonNode rootNode = PokeApiUtils.getJsonNodeFromResponse(response);
            return PokeApiUtils.deserializeJsonNode(rootNode, clazz);
        }
    }


}
