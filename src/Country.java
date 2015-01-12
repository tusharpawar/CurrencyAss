/**
 * Created by Tushar on 1/12/2015.
 */
public  class  Country {
    private String countryName;
    public Currency currency;
    public Country(String name){
        this.countryName=name;
    }
    public Currency getCurrency()
    {
        if(countryName.equals("India"))
             currency=new Rupee("India");
        else if(countryName.equals("USA"))
             currency=new Dollar("USA");
        else if(countryName.equals("UK"))
            currency=new Euro("UK");

        return currency;

    }

}
