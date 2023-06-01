package yonetim_paket_bank;

import java.util.ArrayList;
import java.util.List;

public class GenelHesap {
    protected int accountNumber;
    protected double balance;
    protected List<String> islemGecmisiGoruntule;
    public GenelHesap(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.islemGecmisiGoruntule = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}

