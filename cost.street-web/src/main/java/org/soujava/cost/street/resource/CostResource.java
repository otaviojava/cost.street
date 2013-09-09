package org.soujava.cost.street.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.soujava.cost.street.api.CostCity;
import org.soujava.cost.street.api.CostCountry;
import org.soujava.cost.street.api.CostState;
import org.soujava.cost.street.api.CostUnit;
import org.soujava.cost.street.api.CostOperations;

/**
 *
 * @author otaviojava
 */
@Path("/cost")
@RequestScoped
public class CostResource implements CostOperations{

	private static final String DEFAULT_COUNTRY = "Brazil";
	@Inject
	private Schudule schudule;
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public String save(CostUnit bean) {
        return Boolean.TRUE.toString();
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get(){
    
        return "it's wokring";
    }



    @GET
    @Path("/city/{city}")
    @Produces(MediaType.APPLICATION_JSON)
	@Override
	public CostCity getCity(@PathParam("city")String cityName) {
		CostCity costCity=new CostCity();
		costCity.setCity(cityName);
		costCity.setCountry(DEFAULT_COUNTRY);
		costCity.setValue(1230d);
		return costCity;
	}

    @GET
    @Path("/state/{state}")
    @Produces(MediaType.APPLICATION_JSON)
	@Override
	public CostState getState(@PathParam("state")String stateName) {
		CostState costState=new CostState();
		costState.setCountry(DEFAULT_COUNTRY);
		costState.setState(stateName);
		costState.setValue(1234234d);
		return costState;
	}

    @GET
    @Path("/country/{country}")
    @Produces(MediaType.APPLICATION_JSON)
	@Override
	public CostCountry getCountry(@PathParam("country")String countryName) {
		CostCountry costCountry=new CostCountry();
		costCountry.setCountry(DEFAULT_COUNTRY);
		costCountry.setValue(2345234523452345234554d);
		return costCountry;
	}
    
}
