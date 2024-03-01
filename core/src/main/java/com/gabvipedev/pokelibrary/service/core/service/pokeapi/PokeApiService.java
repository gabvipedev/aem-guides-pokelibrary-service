package com.gabvipedev.pokelibrary.service.core.service.pokeapi;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.ability.Ability;
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
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.type.Type;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.version.Version;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.versiongroup.VersionGroup;
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
    public SuperContestEffect getSuperContestEffect(int id) throws IOException;
    EncounterMethod getEncounterMethod(String idName) throws IOException;
    EncounterCondition getEncounterCondition(String idName) throws IOException;
    EncounterConditionValue getEncounterConditionValue(String idName) throws IOException;
    EvolutionTrigger getEvolutionTrigger(String idName) throws IOException;
    Generation getGeneration(String idName) throws IOException;
    Pokedex getPokedex(String idName) throws IOException;
    Version getVersion(String idName) throws IOException;
    VersionGroup getVersionGroup(String idName) throws IOException;
    Item getItem(String idName) throws IOException;
    ItemAttribute getItemAttribute(String idName) throws IOException;
    ItemCategory getItemCategory(String idName) throws IOException;
    ItemFlingEffect getItemFlingEffect(String idName) throws IOException;
    ItemPocket getItemPocket(String idName) throws IOException;
    Location getLocation(String idName) throws  IOException;
    LocationArea getLocationArea(String idName) throws  IOException;
    Region getRegion(String idName) throws IOException;
    Machine getMachine(String idName) throws IOException;
    Ability getAbility(String idName) throws IOException;
    Type getType(String idName) throws IOException;
    <T> T getResource(String resourceName, Class<T> resourceType) throws IOException;
}
