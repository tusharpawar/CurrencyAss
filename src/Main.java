/**
 * Created by Tushar on 1/12/2015.
 */
import java.io.*;
public class Main {
    public static void main(String [] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String countryName=br.readLine();
        Country country=new Country(countryName);
        System.out.println(""+country.getCurrency().print());


    }
}
