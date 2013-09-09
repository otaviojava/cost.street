package org.soujava.cost.street.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@XmlRootElement
public class CostCountry implements Serializable {
    
	private static final long serialVersionUID = 1L;

	private String country;
	
	private Double value;

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
		return new ToStringBuilder(this).append("country",country).append("value",value).toString();
	}
	
	@Override
	public boolean equals(Object obj) {
	  if(obj instanceof CostCountry){
	     CostCountry other=CostCountry.class.cast(obj);
	     return new EqualsBuilder().append(country, other.country).isEquals();
	  }
	  return false;
	}
	
	@Override
	public int hashCode() {
	    return new HashCodeBuilder().append(country).toHashCode();
	}
	
}
