package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonform;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemon.Pokemon;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.versiongroup.VersionGroup;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;

public class PokemonForm implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private Integer order;
	private Integer formOrder;
	private Boolean isDefault;
	private Boolean isBattleOnly;
	private String formName;
	private NamedApiResource<Pokemon> pokemon;
	private PokemonFormSprites sprites;
	private NamedApiResource<VersionGroup> versionGroup;
	private List<Name> names;
	private List<Name> formNames;
	
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
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Integer getFormOrder() {
		return formOrder;
	}
	public void setFormOrder(Integer formOrder) {
		this.formOrder = formOrder;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	public Boolean getIsBattleOnly() {
		return isBattleOnly;
	}
	public void setIsBattleOnly(Boolean isBattleOnly) {
		this.isBattleOnly = isBattleOnly;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public PokemonFormSprites getSprites() {
		return sprites;
	}
	public void setSprites(PokemonFormSprites sprites) {
		this.sprites = sprites;
	}
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<Name> getFormNames() {
		return formNames;
	}
	public void setFormNames(List<Name> formNames) {
		this.formNames = formNames;
	}
	
}
