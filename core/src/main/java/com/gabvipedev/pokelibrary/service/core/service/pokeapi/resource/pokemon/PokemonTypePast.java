package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.generation.Generation;

import java.util.List;

public class PokemonTypePast {

    private NamedApiResource<Generation> generation;
    private List<PokemonType> types;
    
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }
    public List<PokemonType> getTypes() {
        return types;
    }
    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }
}
