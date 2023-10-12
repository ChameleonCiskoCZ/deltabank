package org.delta.bank.interest;

import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.account.SavingBankAccount;
import org.delta.bank.account.StudentBankAccount;

public class InterestCalculatorService {

    public static final double SAVING_ACC_INTEREST = 8;
    public static final double STUDENT_ACC_INTEREST = 2;

    public static final double BANK_ACC_INTEREST = 1;

    public double CalcInterest(BaseBankAccount bankAccount, double value) {
        if (bankAccount instanceof StudentBankAccount) {

            return calc(value, STUDENT_ACC_INTEREST);
        } else if (bankAccount instanceof SavingBankAccount) {
            return calc(value, SAVING_ACC_INTEREST);
        } else if (bankAccount != null) {
            return calc(value, BANK_ACC_INTEREST);
        } else return value;
    }
    public double calc(double value, double interest){
        value = value + value / 100 * interest;
        return value;
    }
}
