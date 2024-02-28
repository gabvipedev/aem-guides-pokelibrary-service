package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.encountercondition;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.encounterconditionvalue.EncounterConditionValue;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;

public class EncounterCondition implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Name> names;
	private List<NamedApiResource<EncounterConditionValue>> values;
	
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
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<NamedApiResource<EncounterConditionValue>> getValues() {
		return values;
	}
	public void setValues(List<NamedApiResource<EncounterConditionValue>> values) {
		this.values = values;
	}
	
}
