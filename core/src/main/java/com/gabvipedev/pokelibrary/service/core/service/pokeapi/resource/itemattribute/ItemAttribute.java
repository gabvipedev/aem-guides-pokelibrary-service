package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.itemattribute;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Description;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.item.Item;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;

public class ItemAttribute implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;
	private List<Name> names;
	private List<Description> descriptions;
	
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
	public List<NamedApiResource<Item>> getItems() {
		return items;
	}
	public void setItems(List<NamedApiResource<Item>> items) {
		this.items = items;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<Description> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	
}
