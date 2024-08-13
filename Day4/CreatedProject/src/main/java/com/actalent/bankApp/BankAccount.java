package com.actalent.bankApp;

import java.util.Date;

public class BankAccount {
    private String accountName;
    public int accNo;
    public String accType;
    public double balance;
    public Date createdDate;
    public void accept(){

    }
    public void show(){

    }
    public double calculateIntertest(Ibank bankimpl){
        return bankimpl.calculate(balance);
    }

}
