package org.soujava.cost.street.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author otaviojava
 */
@XmlRootElement
public class CostUnit implements Serializable{
        
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private String city;
    
    private String address;
    
    private String neighborhood;
    
    private String state;
    
    private Double value;
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


    @Override
    public String toString() {
    
    	return neighborhood+city +" - "+state+" R$ "+value;
    }
    
     public static CostUnit valueof(String[] strings) {
        CostUnit controle = new CostUnit();
        controle.setCity(strings[0]);
        controle.setAddress(strings[1]);
        controle.setNeighborhood(strings[2]);
        controle.setState(strings[3]);
        controle.setValue(new Double(strings[4]));

        return controle;
    }
}
