package org.example;

import com.actalent.bankApp.BankAccount;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();
        bankAccount.accept();
        System.out.println(bankAccount.calculateIntertest((b)->6.8));
        S a = new S();
        a.s1="Abid";
        a.s2="Shaik";
        Function<S, String> pankaj = (b)->b.s1+b.s2;
        System.out.println(pankaj.apply(a) );

    }

}
class S {
    public String s1;
    public String s2;

}