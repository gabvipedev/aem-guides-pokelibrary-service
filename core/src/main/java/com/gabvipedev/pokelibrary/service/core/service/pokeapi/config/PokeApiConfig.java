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
    }

}
