package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.item.Item;

import java.util.List;

public class PokemonHeldItem {

	private NamedApiResource<Item> item;
	private List<PokemonHeldItemVersion> versionDetails;
	
	public NamedApiResource<Item> getItem() {
		return item;
	}
	public void setItem(NamedApiResource<Item> item) {
		this.item = item;
	}
	public List<PokemonHeldItemVersion> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
