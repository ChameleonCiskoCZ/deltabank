package org.delta.bank.people;

import com.google.inject.Inject;
import org.delta.bank.print.LoggerService;

public class OwnerFactory {

    @Inject private LoggerService loggerService;




    public Owner createOwner(String firstName, String lastName) {
        Owner owner = new Owner(firstName,lastName);
        loggerService.logOwnerCreation(owner);

        return owner;
    }
}
