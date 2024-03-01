package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.ability;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.VerboseEffect;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.generation.Generation;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;

public class Ability implements PokeApiResource<PokeApiResource>, Localizable {

	private Integer id;
	private String name;
	@JsonProperty("is_main_series")
	private Boolean isMainSeries;
	private NamedApiResource<Generation> generation;
	private List<Name> names;
	@JsonProperty("effect_entries")
	private List<VerboseEffect> effectEntries;
	@JsonProperty("effect_changes")
	private List<AbilityEffectChange> effectChanges;
	@JsonProperty("flavor_text_entries")
	private List<AbilityFlavorText> flavorTextEntries;
	private List<AbilityPokemon> pokemon;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsMainSeries() {
		return isMainSeries;
	}
	public void setIsMainSeries(Boolean isMainSeries) {
		this.isMainSeries = isMainSeries;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}
	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}
	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}
	public List<AbilityEffectChange> getEffectChanges() {
		return effectChanges;
	}
	public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
		this.effectChanges = effectChanges;
	}
	public List<AbilityFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}
	public List<AbilityPokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(List<AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
	}
	
}
