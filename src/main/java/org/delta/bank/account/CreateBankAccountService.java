package org.delta.bank.account;

import com.google.inject.Inject;
import org.delta.bank.people.Owner;

import java.util.Random;

public class CreateBankAccountService {
    @Inject private AccountFactory factory;

    Random rnd = new Random();

    int accountNumber = rnd.nextInt(0, 1000000000);
    String accNumber = Integer.toString(accountNumber);
    public void createNewAccount(Owner owner, BaseBankAccount bankAccount, double balance) {
        if (bankAccount instanceof StudentBankAccount) {
            factory.createStudentAccount(owner, accNumber, balance);
        } else if (bankAccount instanceof SavingBankAccount) {
            factory.createSavingAccount(owner, accNumber, balance);
        } else if (bankAccount != null) {
            factory.createAccount(owner, accNumber, balance);
        }

    }


}
