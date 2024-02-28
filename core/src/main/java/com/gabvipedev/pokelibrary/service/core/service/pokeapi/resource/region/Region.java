package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.region;

import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.generation.Generation;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.location.Location;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokedex.Pokedex;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.versiongroup.VersionGroup;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;



public class Region implements PokeApiResource, Localizable {

	private Integer id;
	private List<NamedApiResource<Location>> locations;
	private String name;
	private List<Name> names;
	private NamedApiResource<Generation> mainGeneration;
	private List<NamedApiResource<Pokedex>> pokedexes;
	private List<NamedApiResource<VersionGroup>> versionGroups;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<NamedApiResource<Location>> getLocations() {
		return locations;
	}
	public void setLocations(List<NamedApiResource<Location>> locations) {
		this.locations = locations;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public NamedApiResource<Generation> getMainGeneration() {
		return mainGeneration;
	}
	public void setMainGeneration(NamedApiResource<Generation> mainGeneration) {
		this.mainGeneration = mainGeneration;
	}
	public List<NamedApiResource<Pokedex>> getPokedexes() {
		return pokedexes;
	}
	public void setPokedexes(List<NamedApiResource<Pokedex>> pokedexes) {
		this.pokedexes = pokedexes;
	}
	public List<NamedApiResource<VersionGroup>> getVersionGroups() {
		return versionGroups;
	}
	public void setVersionGroups(List<NamedApiResource<VersionGroup>> versionGroups) {
		this.versionGroups = versionGroups;
	}
	
}
