package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.itempocket;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.itemcategory.ItemCategory;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;

public class ItemPocket implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<ItemCategory>> categories;
	private List<Name> names;
	
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
	public List<NamedApiResource<ItemCategory>> getCategories() {
		return categories;
	}
	public void setCategories(List<NamedApiResource<ItemCategory>> categories) {
		this.categories = categories;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
