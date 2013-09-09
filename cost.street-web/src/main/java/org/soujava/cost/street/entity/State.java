package org.soujava.cost.street.entity;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.easycassandra.MapData;

@Entity
public class State implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String name;
	
	@MapData
	private Map<String, Double> values;
	
	@Column
	private Double total;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Double> getValues() {
		return values;
	}

	public void setValues(Map<String, Double> values) {
		this.values = values;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
}
