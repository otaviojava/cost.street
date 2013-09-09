package org.soujava.cost.street.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
public class CostCity implements Serializable{

	private static final long serialVersionUID = 1L;

	private String city;
	
	private String state;
	
	private String country;
	
	private Double value;
	
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("city",city).append("state",state).append("country",country).append("value",value).toString();
	}
	
	@Override
	public boolean equals(Object obj) {
	  if(obj instanceof CostCity){
	   CostCity other=CostCity.class.cast(obj);
	   return new EqualsBuilder().append(state, other.state).append(country, other.country).append(city, other.city).isEquals();
	  }
	  return false;
	}
	
	@Override
	public int hashCode() {
	    return new HashCodeBuilder().append(state).append(country).append(city).toHashCode();
	}
	
}
