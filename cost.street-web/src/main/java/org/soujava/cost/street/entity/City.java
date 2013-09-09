package org.soujava.cost.street.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import org.easycassandra.ListData;


@Entity
public class City implements Serializable{

	private static final long serialVersionUID = 3486824285354069862L;

	@EmbeddedId
	private CityCompleteName id;
	
	@Column
	private Double sum;
	
	@ListData
	private List<UUID> street;


	public CityCompleteName getId() {
		return id;
	}

	public void setId(CityCompleteName id) {
		this.id = id;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public List<UUID> getStreet() {
		return street;
	}

	public void setStreet(List<UUID> street) {
		this.street = street;
	}
	
}
