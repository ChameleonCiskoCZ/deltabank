package org.delta.bank.moneyTransfer;

import org.delta.bank.account.BaseBankAccount;

public class ValidationService {
    public void validateSourceAccountForMoneyTransfer(BaseBankAccount sourceAcc, double value) throws Exception {
        if (sourceAcc.getBalance()<value) throw new Exception("");
    }

}
