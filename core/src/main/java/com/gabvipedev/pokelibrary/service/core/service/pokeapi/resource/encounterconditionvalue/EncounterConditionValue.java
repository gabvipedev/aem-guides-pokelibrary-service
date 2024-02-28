package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.encounterconditionvalue;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.encountercondition.EncounterCondition;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;

public class EncounterConditionValue implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private NamedApiResource<EncounterCondition> condition;
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
	public NamedApiResource<EncounterCondition> getCondition() {
		return condition;
	}
	public void setCondition(NamedApiResource<EncounterCondition> condition) {
		this.condition = condition;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
