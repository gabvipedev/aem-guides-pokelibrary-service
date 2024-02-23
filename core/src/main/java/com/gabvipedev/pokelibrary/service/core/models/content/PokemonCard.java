/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.gabvipedev.pokelibrary.service.core.models.content;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.PokeApiService;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.common.NamedAPIResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.evolution.EvolutionChain;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.moves.MoveDetail;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.Move;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.Species;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.beans.pokemon.species.PokemonSpecies;
import com.gabvipedev.pokelibrary.service.core.utils.PokeApiUtils;
import com.gabvipedev.pokelibrary.service.core.utils.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PokemonCard {
    @SlingObject
    private Resource currentResource;
    @SlingObject
    private ResourceResolver resourceResolver;

    @OSGiService
    private PokeApiService pokeApiService;

    private Pokemon pokemon;
    List<String> movesNames = new ArrayList<>();


    @PostConstruct
    protected void init() throws IOException {
        pokemon = pokeApiService.getPokemon(1);

        EvolutionChain evolutionChain = pokeApiService.getEvolutionChain(1);

        Map<String, PokemonSpecies> evolution = PokeApiUtils.getPokemonNamesFromChain(evolutionChain, pokeApiService);

        List<Move> movesUrl = pokemon.getMoves();
        for(Move move : movesUrl){
           movesNames.add(StringUtils.capitalizeWords(move.getMove().getName()));
        }
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public List<String> getMovesNames() {
        return movesNames;
    }
}
