package org.delta.bank.people;

import org.delta.bank.print.LoggerService;

public class OwnerFactory {

    private LoggerService loggerService;

    public OwnerFactory() {
        this.loggerService = new LoggerService();
    }

    public Owner createOwner(String firstName, String lastName) {
        Owner owner = new Owner(firstName, lastName);
        loggerService.logOwnerCreation(owner);

        return owner;
    }
}
