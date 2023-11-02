package org.delta.bank.print;

import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.people.Owner;

public interface LoggerInterface {
    void log(String message);

    void logAccountInfo(BaseBankAccount account);

    void logAccountCreation(BaseBankAccount account);

    void logOwnerCreation(Owner owner);

}
