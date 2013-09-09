package org.soujava.cost.street.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
public class CostState implements Serializable{

	private static final long serialVersionUID = 1780881914603713614L;

	private String state;
	
	private String country;
	
	private Double value;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("state",state).append("country",country).append("value",value).toString();
	}
	
	@Override
	public boolean equals(Object obj) {
	  if(obj instanceof CostState){
	   CostState other=CostState.class.cast(obj);
	   return new EqualsBuilder().append(state, other.state).append(country, other.country).isEquals();
	  }
	  return false;
	}
	
	@Override
	public int hashCode() {
	    return new HashCodeBuilder().append(state).append(country).toHashCode();
	}
	
}
