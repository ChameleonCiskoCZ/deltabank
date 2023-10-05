package org.delta.bank;

import org.delta.bank.account.BankAccount;
import org.delta.bank.account.StudentBankAccount;
import org.delta.bank.moneyTransfer.MoneyTransferService;
import people.Owner;

public class Bank {
    public void run() throws Exception {
        System.out.println("helo bank");
        Owner owner = new Owner("pes","peso");
        BankAccount bank = new BankAccount(owner, "547477", 5550);
        BankAccount bank2 = new BankAccount(owner, "547477", 5550);

        MoneyTransferService moneyTransferService = new MoneyTransferService();
        moneyTransferService.transferMoney(bank, bank2, 200);

        BankAccount  studentAccount = new StudentBankAccount(owner, "447777", 5000);
}
}
