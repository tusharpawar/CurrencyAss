/**
 * Created by Tushar on 1/12/2015.
 */
public abstract class Currency {
    private String countryName;
    private String name;

    public Currency(String countryName, String name) {

        this.countryName = countryName;
        this.name=name;
    }
    public String print(){
        return name;
    }

}
