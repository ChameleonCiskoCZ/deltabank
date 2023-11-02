package org.delta.bank.people;

import org.delta.bank.print.LoggerService;

import java.util.ArrayList;
import java.util.List;

public class OwnerService {
    private List<Owner> owners;
    private OwnerFactory ownerFactory;
    private LoggerService loggerService;

    public OwnerService() {
        owners = new ArrayList<>();
        ownerFactory = new OwnerFactory();
        loggerService = new LoggerService();
    }

    public Owner addOwner(String firstName, String lastName) {
        Owner owner = ownerFactory.createOwner(firstName, lastName);
        storeOwner(owner);
        return owner;
    }

    private void storeOwner(Owner owner) {
        owners.add(owner);
    }
}
