package org.soujava.cost.street.api;

/**
 *
 * @author otaviojava
 */
public interface CostOperations {
    
    String save(CostUnit bean);
    
    CostCity getCity(String cityName);
    
    CostState getState(String stateName);
    
    CostCountry getCountry(String countryName);
    
    
}
