package org.delta.bank.people;

import com.google.inject.Inject;
import org.delta.bank.print.LoggerService;

import java.util.ArrayList;
import java.util.List;

public class OwnerService {
    private List<Owner> owners;
    @Inject private OwnerFactory ownerFactory;
    @Inject private LoggerService loggerService;

    public OwnerService() {
        owners = new ArrayList<>();
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
