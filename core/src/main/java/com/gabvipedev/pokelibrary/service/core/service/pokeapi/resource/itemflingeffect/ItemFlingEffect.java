package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.itemflingeffect;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Effect;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.item.Item;

import java.util.List;

public class ItemFlingEffect implements PokeApiResource<PokeApiResource> {

	private Integer id;
	private String name;
	private List<Effect> effectEntries;
	private List<NamedApiResource<Item>> items;
	
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
	public List<Effect> getEffectEntries() {
		return effectEntries;
	}
	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}
	public List<NamedApiResource<Item>> getItems() {
		return items;
	}
	public void setItems(List<NamedApiResource<Item>> items) {
		this.items = items;
	}
	
}
