package org.delta.bank.print;

import com.google.inject.Inject;
import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.people.Owner;

public class LoggerService {
    @Inject ConsoleLogger consoleLogger;


    public void log(String message) {
        consoleLogger.log(message);
    }

    public void logAccountInfo(BaseBankAccount account) {
        consoleLogger.logAccountInfo(account);
    }

    public void logAccountCreation(BaseBankAccount account) {
        consoleLogger.logAccountCreation(account);
    }
    public void logOwnerCreation(Owner owner) {
        consoleLogger.logOwnerCreation(owner);
    }

}
