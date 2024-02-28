package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.nature;



import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.Name;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.PokeApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.berryflavor.BerryFlavor;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.stat.Stat;
import com.gabvipedev.pokelibrary.service.core.utils.locale.Localizable;

import java.util.List;

public class Nature implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private NamedApiResource<Stat> decreasedStat;
	private NamedApiResource<Stat> increasedStat;
	private NamedApiResource<BerryFlavor> hatesFlavor;
	private NamedApiResource<BerryFlavor> likesFlavor;
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
	public NamedApiResource<Stat> getDecreasedStat() {
		return decreasedStat;
	}
	public void setDecreasedStat(NamedApiResource<Stat> decreasedStat) {
		this.decreasedStat = decreasedStat;
	}
	public NamedApiResource<Stat> getIncreasedStat() {
		return increasedStat;
	}
	public void setIncreasedStat(NamedApiResource<Stat> increasedStat) {
		this.increasedStat = increasedStat;
	}
	public NamedApiResource<BerryFlavor> getHatesFlavor() {
		return hatesFlavor;
	}
	public void setHatesFlavor(NamedApiResource<BerryFlavor> hatesFlavor) {
		this.hatesFlavor = hatesFlavor;
	}
	public NamedApiResource<BerryFlavor> getLikesFlavor() {
		return likesFlavor;
	}
	public void setLikesFlavor(NamedApiResource<BerryFlavor> likesFlavor) {
		this.likesFlavor = likesFlavor;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
