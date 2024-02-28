package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.pokemonshape;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.NamedApiResource;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.language.Language;

public class AwesomeName {

	private String awesomeName;
	private NamedApiResource<Language> language;
	
	public String getAwesomeName() {
		return awesomeName;
	}
	public void setAwesomeName(String awesomeName) {
		this.awesomeName = awesomeName;
	}
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}
	
}
