package org.delta.bank.moneyTransfer;

import org.delta.bank.account.BankAccount;

public class ValidationService {
    public void validateSourceAccountForMoneyTransfer(BankAccount sourceAcc, double value) throws Exception {
        if (sourceAcc.getBalance()>value) throw new Exception("");
    }

}
