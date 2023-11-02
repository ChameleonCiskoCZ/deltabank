package org.delta.bank.interest;

import org.delta.bank.account.BaseBankAccount;

public class AddInterestToAccount {

    InterestCalculatorService interestCalculatorService = new InterestCalculatorService();


    public void add(BaseBankAccount bankAccount, double value)
    {
        bankAccount.setBalance(interestCalculatorService.CalcInterest(bankAccount, value));
    }
}
