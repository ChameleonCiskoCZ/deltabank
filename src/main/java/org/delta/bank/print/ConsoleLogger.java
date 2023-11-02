package org.delta.bank.print;

import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.people.Owner;

public class ConsoleLogger implements LoggerInterface {
    public void log(String message) {
        System.out.println(message);
    }

    public void logAccountInfo(BaseBankAccount account) {
        String accountInfo = String.format("%s %s owned by %s contains %.2f",
                account.getClass().getSimpleName(),
                account.getAccountNumber(),
                account.getOwner().getLastname(),
                account.getBalance());

        System.out.println(accountInfo);
    }

    public void logAccountCreation(BaseBankAccount account) {
        String accountInfo = String.format("Created a %s %s owned by %s",
                account.getClass().getSimpleName(),
                account.getAccountNumber(),
                account.getOwner().getLastname());

        System.out.println(accountInfo);
    }

    public void logOwnerCreation(Owner owner) {
        String ownerInfo = String.format("Created an owner: %s %s",
                owner.getFirstname(),
                owner.getLastname());

        System.out.println(ownerInfo);
    }

}
