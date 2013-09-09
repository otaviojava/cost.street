package org.soujava.cost.street.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CityCompleteName implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column
	private String name;
	
	@Column
	private String state;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
