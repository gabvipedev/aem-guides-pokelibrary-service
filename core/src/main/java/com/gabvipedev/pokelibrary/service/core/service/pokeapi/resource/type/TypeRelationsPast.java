package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.type;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.generation.Generation;

public class TypeRelationsPast {
    
    private NamedApiResource<Generation> generation;
    private TypeRelations damageRelations;
    
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }
    public TypeRelations getDamageRelations() {
        return damageRelations;
    }
    public void setDamageRelations(TypeRelations damageRelations) {
        this.damageRelations = damageRelations;
    }
}
