import sun.util.resources.CurrencyNames_el_CY;

/**
 * Created by Tushar on 1/12/2015.
 */
public class Euro extends Currency {
    private static String currencyName="Euro";
    public Euro( String countryName){
        super(countryName,currencyName);
    }
}
