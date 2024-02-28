package com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource;


import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.language.Language;
import com.gabvipedev.pokelibrary.service.core.service.pokeapi.resource.versiongroup.VersionGroup;

public class VersionGroupFlavorText {

	private String text;
	private NamedApiResource<Language> language;
	private NamedApiResource<VersionGroup> versionGroup;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public NamedApiResource<Language> getLanguage() {
		return language;
	}
	public void setLanguage(NamedApiResource<Language> language) {
		this.language = language;
	}
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}
	
}
