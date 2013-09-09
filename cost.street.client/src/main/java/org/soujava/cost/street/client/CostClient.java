
package org.soujava.cost.street.client;

import org.soujava.cost.street.api.CostCity;
import org.soujava.cost.street.api.CostCountry;
import org.soujava.cost.street.api.CostOperations;
import org.soujava.cost.street.api.CostState;
import org.soujava.cost.street.api.CostUnit;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;


public class CostClient implements CostOperations{
    private WebResource webResource;
    private Client client;
    private static final String BASE_URI = "http://otaviojava.com.br/cost.street-web/resource";

    public CostClient() {
        com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
        client = Client.create(config);
        webResource = client.resource(BASE_URI).path("cost");
    }

   

    public String get() throws UniformInterfaceException {
        WebResource resource = webResource;
        return resource.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public String save( CostUnit requestEntity) throws UniformInterfaceException {
        return webResource.type(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(String.class, requestEntity) ;
    }

    public CostCountry getCountry(String country) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("country/{0}", new Object[]{country}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(CostCountry.class);
    }

    public CostCity getCity( String city) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("city/{0}", new Object[]{city}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(CostCity.class);
    }

    public CostState getState(String state) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("state/{0}", new Object[]{state}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(CostState.class);
    }
    
    public void close() {
        client.destroy();
    }



}
