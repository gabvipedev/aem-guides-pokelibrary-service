package com.gabvipedev.pokelibrary.service.core.service.pokeapi.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd = PokeApiConfig.Configuration.class)
public interface PokeApiConfig {

    @ObjectClassDefinition(name = "PokeLibrary - PokeAPI Configuration")
    @interface Configuration {
        @AttributeDefinition(name = "PokeAPI URL", description = "PokeApi base endpoint")
        String pokeApiBaseUrl() default "https://pokeapi.co/api/v2/";

        @AttributeDefinition(name = "PokemonEndpoint", description = "The URL of the Pokemon endpoint")
        String pokemonEndpoint() default "pokemon";

        @AttributeDefinition(name = "MoveEndpoint", description = "The URL of the Move endpoint")
        String moveEndpoint() default "move";

        @AttributeDefinition(name = "MoveEndpoint", description = "The URL of the Move endpoint")
        String evolutionEndpoint() default "evolution-chain";

        @AttributeDefinition(name = "MoveEndpoint", description = "The URL of the Move endpoint")
        String speciesEndpoint() default "pokemon-species";

        @AttributeDefinition(name = "Berry Endpoint", description = "The URL of the Move endpoint")
        String berryEndpoint() default "berry";
        @AttributeDefinition(name = "Berry Firmness Endpoint", description = "The URL of the Berry Firmness endpoint")
        String berryFirmnessEndpoint() default "berry-firmness";
        @AttributeDefinition(name = "Berry Flavour Endpoint", description = "The URL of the Berry Firmness endpoint")
        String berryFlavorEndpoint() default "berry-flavor";
        @AttributeDefinition(name = "Contest Type Endpoint", description = "The URL of the Berry Firmness endpoint")
        String contestTypeEndpoint() default "contest-type";
        @AttributeDefinition(name = "Contest Type Endpoint", description = "The URL of the Berry Firmness endpoint")
        String contestEffectEndpoint() default "contest-effect";
        @AttributeDefinition(name = "Supper Contest Effect Endpoint", description = "The URL of the Berry Firmness endpoint")
        String superContestEffectEndpoint() default "super-contest-effect";
        @AttributeDefinition(name = "EncounterMethod Endpoint", description = "The URL of the Berry Firmness endpoint")
        String encounterMethodEndpoint() default "encounter-method";
        @AttributeDefinition(name = "EncounterMethod Conditions", description = "The URL of the Berry Firmness endpoint")
        String encounterConditionsEndpoint() default "encounter-condition";
        @AttributeDefinition(name = "EncounterMethod Conditions Value", description = "The URL of the Berry Firmness endpoint")
        String encounterConditionsValueEndpoint() default "encounter-condition-value";
        @AttributeDefinition(name = "EncounterMethod Conditions Value", description = "The URL of the Berry Firmness endpoint")
        String evolutionTriggerEndpoint() default "evolution-trigger";
        @AttributeDefinition(name = "Generation", description = "The URL of the Berry Firmness endpoint")
        String generationEndpoint() default "generation";
        @AttributeDefinition(name = "Pokedex", description = "The URL of the Berry Firmness endpoint")
        String pokedexEndpoint() default "pokedex";
        @AttributeDefinition(name = "Version", description = "The URL of the Berry Firmness endpoint")
        String versionEndpoint() default "version";
        @AttributeDefinition(name = "Version Group", description = "The URL of the Berry Firmness endpoint")
        String versionGroupEndpoint() default "version-group";
        @AttributeDefinition(name = "Item", description = "The URL of the Berry Firmness endpoint")
        String itemEndpoint() default "item";
        @AttributeDefinition(name = "Item Attribute", description = "The URL of the Berry Firmness endpoint")
        String itemAttributesEndpoint() default "item-attribute";
        @AttributeDefinition(name = "Item Category", description = "The URL of the Berry Firmness endpoint")
        String itemCategoriesEndpoint() default "item-category";
        @AttributeDefinition(name = "Item Fling Effects", description = "The URL of the Berry Firmness endpoint")
        String itemFlingEffectsEndpoint() default "item-fling-effect";
        @AttributeDefinition(name = "Item Pocket", description = "The URL of the Berry Firmness endpoint")
        String itemPocketEndpoint() default "item-pocket";
        @AttributeDefinition(name = "Location", description = "The URL of the Berry Firmness endpoint")
        String locationEndpoint() default "location";
        @AttributeDefinition(name = "Location Area", description = "The URL of the Berry Firmness endpoint")
        String locationAreaEndpoint() default "location-area";
        @AttributeDefinition(name = "Pal Park Area", description = "The URL of the Berry Firmness endpoint")
        String palParkAreasEndpoint() default "pal-park-area";
        @AttributeDefinition(name = "Regions", description = "The URL of the Berry Firmness endpoint")
        String regionsEndpoint() default "region";
        @AttributeDefinition(name = "Machine", description = "The URL of the Berry Firmness endpoint")
        String machineEndpoint() default "machine";
        @AttributeDefinition(name = "Machine", description = "The URL of the Berry Firmness endpoint")
        String abilitiesEndpoint() default "ability";
        @AttributeDefinition(name = "Type", description = "The URL of the Berry Firmness endpoint")
        String typeEndpoint() default "type";
    }

}
