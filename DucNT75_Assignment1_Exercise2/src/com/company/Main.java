package com.company;

import Entity.Person;
import Validation.Validation;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PaymentManagement pm = new PaymentManagement();
        System.out.println("======= Shopping program ==========");

        int[] bills = pm.getBills();
        int walletValue = Validation.getInt("input value of wallet: ");

        Person person = new Person();
        Person.Wallet wallet = person.new Wallet(walletValue);

        System.out.println("This is total of bill: " + pm.calcTotal(bills));

        if (wallet.payMoney(pm.calcTotal(bills))) {
            System.out.println("You can buy it.");
        } else {
            System.out.println("You can't buy it");
        }

    }
}
