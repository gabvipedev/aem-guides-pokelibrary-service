package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.locationarea;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.VersionEncounterDetail;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.Pokemon;

import java.util.List;

public class PokemonEncounter {

	private NamedApiResource<Pokemon> pokemon;
	private List<VersionEncounterDetail> versionDetails;
	
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public List<VersionEncounterDetail> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
