package org.soujava.cost.street.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.soujava.cost.street.api.CostCity;
import org.soujava.cost.street.api.CostCountry;
import org.soujava.cost.street.api.CostState;
import org.soujava.cost.street.api.CostUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        CostClient costClient=new CostClient();
        
        CostCountry country=costClient.getCountry("Brazil");
        CostCity costCity=costClient.getCity("Salvador");
        CostState costState=costClient.getState("Bahia");
        String sucess=costClient.save(new CostUnit());
//    	useFile();
    }

	private static void useFile() throws IOException {
		Path path=Paths.get("saida.txt");
         if(Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS)){
            
           String strLine = null;
           BufferedReader reader= Files.newBufferedReader(path, Charset.forName("UTF-8"));
             while ((strLine = reader.readLine()) != null) {
               CostUnit controle=CostUnit.valueof(strLine.split("\\|"));
               
             }
         }
	}
}
