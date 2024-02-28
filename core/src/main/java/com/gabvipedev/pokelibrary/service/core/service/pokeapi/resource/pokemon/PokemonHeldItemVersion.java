package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.version.Version;

public class PokemonHeldItemVersion {

	private NamedApiResource<Version> version;
	private Integer rarity;
	
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	
}
