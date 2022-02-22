/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG STRIX
 */
public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries>{
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries( String countryCode, String countryName, float totalArea,String countryTerrain) {
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
        // su dung print format de in ra theo yeu cau de bai
        System.out.printf("%-20s%-20s%-20f%-20s\n",this.countryCode, this.countryName, this.totalArea,this.countryTerrain );
    }
    //so sanh name va su dung collection sort de sap xep ten theo thu tu
    @Override
    public int compareTo(EastAsiaCountries o) {
        return o.getCountryName().compareTo(this.countryName);
    }
}
