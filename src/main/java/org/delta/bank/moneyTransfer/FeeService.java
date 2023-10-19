package org.delta.bank.moneyTransfer;

import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.account.SavingBankAccount;
import org.delta.bank.account.StudentBankAccount;

public class FeeService {
    public static final double STARTING_FEE_VALUE = 1000;
    public static final double FEE_SAVINGS = 10;
    public static final double FEE_CLASSIC = 1;
    public double CalculateFee(BaseBankAccount bankAccount, double value){
        if(bankAccount instanceof StudentBankAccount) {
            return 0;
        } else if (bankAccount instanceof SavingBankAccount) {
            return Calc(value, FEE_SAVINGS);
        } else if (bankAccount != null) {
            return Calc(value, FEE_CLASSIC);
        } else return 0;



    }
    public double Calc(double value, double fee){
        if (value > STARTING_FEE_VALUE){
            value=value/100*fee;
            return value;
        } else return 0;
    }
}
