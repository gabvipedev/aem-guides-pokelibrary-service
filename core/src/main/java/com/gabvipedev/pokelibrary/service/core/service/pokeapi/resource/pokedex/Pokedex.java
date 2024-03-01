package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokedex;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Description;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.region.Region;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.versiongroup.VersionGroup;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;

public class Pokedex implements PokeApiResource<PokeApiResource>, Localizable {

	private Integer id;
	private String name;
	private Boolean isMainSeries;
	private List<Description> descriptions;
	private List<Name> names;
	private List<PokemonEntry> pokemonEntries;
	private NamedApiResource<Region> region;
	private List<NamedApiResource<VersionGroup>> versionGroups;
	
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
	public List<Description> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<PokemonEntry> getPokemonEntries() {
		return pokemonEntries;
	}
	public void setPokemonEntries(List<PokemonEntry> pokemonEntries) {
		this.pokemonEntries = pokemonEntries;
	}
	public NamedApiResource<Region> getRegion() {
		return region;
	}
	public void setRegion(NamedApiResource<Region> region) {
		this.region = region;
	}
	public List<NamedApiResource<VersionGroup>> getVersionGroups() {
		return versionGroups;
	}
	public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
		this.versionGroups = versionGroups;
	}
	
}
