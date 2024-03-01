package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource;

public class NamedApiResource<T extends PokeApiResource<PokeApiResource>> {

	private String name;
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
