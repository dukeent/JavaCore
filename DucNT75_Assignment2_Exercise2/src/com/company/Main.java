package com.company;

import Entity.EastAsiaCountries;
import Management.ManageEastAsiaCountries;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ManageEastAsiaCountries mn = new ManageEastAsiaCountries();
        ArrayList<EastAsiaCountries> eastAsiaCountries = new ArrayList<>();
        //Insert test cases:
        eastAsiaCountries.add(new EastAsiaCountries("VN", "Viet Nam", 331698, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("IDN", "Indonesia", 1811570, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("LAOS", "Laos", 230800, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("CPC", "Cambodia", 176520, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("MM", "Myanmar", 653290, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("MLS", "Malaysia", 328550, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("BRI", "Brunei", 5270, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("PLP", "Philippines", 298170, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("TL", "Thailand", 510890, "Nice"));
        eastAsiaCountries.add(new EastAsiaCountries("SGP", "Singapore", 700, "Nice"));
        while (true) {
            int choice = mn.Menu();
            switch (choice) {
                case 1:
                    mn.addCountryInformation(eastAsiaCountries);
                    break;
                case 2:
                    mn.getRecentlyEnteredInformation(eastAsiaCountries);
                    break;
                case 3:
                    System.out.println("Enter the name you want to search for: ");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.nextLine().toLowerCase().trim();
                    mn.searchInformationByName(eastAsiaCountries,name);
                    break;
                case 4:
                    mn.sortInformationByAscendingOrder(eastAsiaCountries);
                    break;
                case 5:
                    return;
            }
        }
    }
}
