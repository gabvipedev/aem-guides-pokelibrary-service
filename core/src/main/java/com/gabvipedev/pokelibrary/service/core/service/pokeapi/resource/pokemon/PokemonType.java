package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.type.Type;
import com.gabvipedev.pokelibrary.service.core.utils.StringUtils;

public class PokemonType implements PokeApiResource<PokeApiResource> {

	private Integer slot;
	private NamedApiResource<Type> type;
	
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public NamedApiResource<Type> getType() {
		return type;
	}
	public void setType(NamedApiResource<Type> type) {
		this.type = type;
	}
	public Integer getId(){
		return StringUtils.extractIdFromUrl(this.type.getUrl());
	}
	public String getName(){
		return this.type.getName();
	}
	
}
