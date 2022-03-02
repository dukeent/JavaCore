package Management;

import Entity.EastAsiaCountries;
import Validation.Validation;

import java.util.ArrayList;
import java.util.Collections;

public class ManageEastAsiaCountries {
    Validation val = new Validation();

    public int checkExistID(ArrayList<EastAsiaCountries> eastAsiaCountries, String code) {
        for (int i = 0; i < eastAsiaCountries.size(); i++) {
            if (eastAsiaCountries.get(i).getCountryCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public int Menu() {
        int i;
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia\n" +
                "2. Display the information of country you've just input\n" +
                "3. Search the information of country by user-entered name\n" +
                "4. Display the information of countries sorted name in ascending order  \n" +
                "5. Exit ");
        System.out.println("==========================================================================");
        i = val.getInt(1, 5, "Please choice one option: ");
        return i;
    }


    public void addCountryInformation(ArrayList<EastAsiaCountries> eastAsiaCountries) {
        if (eastAsiaCountries.size() >= 11) {
            System.out.println("Can't add more. East Asia Countries only has only 11 countries");
        } else {
            String code;
            while (true) {
                code = val.getString("Enter country code: ");
                if (checkExistID(eastAsiaCountries, code) >= 0) {
                    System.out.println("This country already exist");
                } else {
                    break;
                }
            }
            String name = val.getString("Enter country name: ");
            float area = val.getFloat(0, Double.MAX_VALUE, "Enter total Area: ");
            String terrain = val.getString("Enter terrain of country: ");
            eastAsiaCountries.add(new EastAsiaCountries(code, name, area, terrain));
        }
    }

    public void getRecentlyEnteredInformation(ArrayList<EastAsiaCountries> eastAsiaCountries) {
        if (eastAsiaCountries.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
            int id = eastAsiaCountries.size();
            eastAsiaCountries.get(id - 1).display();
        }
    }

    public void searchInformationByName(ArrayList<EastAsiaCountries> eastAsiaCountries, String name) {
        int flag = 0;
        System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountries e : eastAsiaCountries) {
            if (e.getCountryName().equalsIgnoreCase(name)) {
                e.display();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("No Result!");
        }
    }

    public void sortInformationByAscendingOrder(ArrayList<EastAsiaCountries> eastAsiaCountries) {
        System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
        Collections.sort(eastAsiaCountries);
        for (EastAsiaCountries e : eastAsiaCountries) {
            e.display();
        }
    }
}
