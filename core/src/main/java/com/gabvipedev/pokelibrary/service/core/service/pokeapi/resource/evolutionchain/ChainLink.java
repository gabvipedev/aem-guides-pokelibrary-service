package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.evolutionchain;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonspecies.PokemonSpecies;

import java.util.List;

public class ChainLink {

	private Boolean isBaby;
	private NamedApiResource<PokemonSpecies> species;
	private List<EvolutionDetail> evolutionDetails;
	private List<ChainLink> evolvesTo;
	
	public Boolean getIsBaby() {
		return isBaby;
	}
	public void setIsBaby(Boolean isBaby) {
		this.isBaby = isBaby;
	}
	public NamedApiResource<PokemonSpecies> getSpecies() {
		return species;
	}
	public void setSpecies(NamedApiResource<PokemonSpecies> species) {
		this.species = species;
	}
	public List<EvolutionDetail> getEvolutionDetails() {
		return evolutionDetails;
	}
	public void setEvolutionDetails(List<EvolutionDetail> evolutionDetails) {
		this.evolutionDetails = evolutionDetails;
	}
	public List<ChainLink> getEvolvesTo() {
		return evolvesTo;
	}
	public void setEvolvesTo(List<ChainLink> evolvesTo) {
		this.evolvesTo = evolvesTo;
	}
	
}
