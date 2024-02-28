package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.gender;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.util.List;

public class Gender {

	private Integer id;
	private String name;
	private List<PokemonSpeciesGender> pokemonSpeciesDetails;
	private List<NamedApiResource<PokemonSpecies>> requiredForEvolution;
	
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
	public List<PokemonSpeciesGender> getPokemonSpeciesDetails() {
		return pokemonSpeciesDetails;
	}
	public void setPokemonSpeciesDetails(List<PokemonSpeciesGender> pokemonSpeciesDetails) {
		this.pokemonSpeciesDetails = pokemonSpeciesDetails;
	}
	public List<NamedApiResource<PokemonSpecies>> getRequiredForEvolution() {
		return requiredForEvolution;
	}
	public void setRequiredForEvolution(List<NamedApiResource<PokemonSpecies>> requiredForEvolution) {
		this.requiredForEvolution = requiredForEvolution;
	}
	
}
