package org.delta.bank.people;

public class OwnerFactory {

    public Owner createOwner(String name, String lastName){
        return new Owner(name, lastName);
    }
}
