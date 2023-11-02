package org.delta.bank.account;

import com.google.inject.Inject;
import org.delta.bank.people.Owner;
import org.delta.bank.print.LoggerService;

import java.awt.*;

public class OwnerStringService {
    @Inject private Owner owner;
    @Inject private LoggerService loggerService;

    public String parseOwner() {
        String attr1 = owner.getFirstname();
        String attr2 = owner.getLastname();
        loggerService.log(attr1+attr2);
        return (attr1+attr2);
    }

}

