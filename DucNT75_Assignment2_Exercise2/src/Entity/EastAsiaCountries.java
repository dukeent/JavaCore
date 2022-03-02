package Entity;


public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries> {
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-20s%-20s%-20.1f%-20s\n", this.countryCode, this.countryName, this.totalArea, this.countryTerrain);
    }

    @Override
    public int compareTo(EastAsiaCountries o) {
        if (this.countryName.toLowerCase().compareTo(o.getCountryName().toLowerCase()) == 0) {
            return (int) (super.totalArea - o.getTotalArea());
        } else {
            return this.countryName.toLowerCase().compareTo(o.getCountryName().toLowerCase());
        }
    }
}
