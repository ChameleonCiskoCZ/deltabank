package org.delta.bank;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        try {
            Injector injector = Guice.createInjector(new BankInjector());
            Bank bank = injector.getInstance(Bank.class);
            bank.run();
        } catch (Exception e) {
            System.out.println("error xd");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}