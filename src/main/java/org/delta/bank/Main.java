package org.delta.bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bank bank = new Bank();
        try {
            bank.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}