package com.company;

import Validation.Validation;

public class PaymentManagement {
    public int[] getBills() {
        int a = Validation.getInt("input number of bill: ");
        int[] bills = new int[a];
        for (int i = 0; i < bills.length; i++) {
            bills[i] = Validation.getInt("input value of bill " + (i + 1) + ": ");
        }
        return bills;
    }

    public int calcTotal(int[] bills) {
        int res = 0;
        for (int i : bills) {
            res += i;
        }
        return res;
    }
}
