package com.alporan.hangmangame.apiTmdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Genre implements Serializable {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Genre{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
