package org.soujava.cost.street.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.easycassandra.SetData;

@Entity
public class Country implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String name;
	
	@SetData
	private Set<String> state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getState() {
		return state;
	}

	public void setState(Set<String> state) {
		this.state = state;
	}
	
	
	
}
