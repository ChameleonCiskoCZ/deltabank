package org.delta.bank.moneyTransfer;

import org.delta.bank.account.BankAccount;


public class MoneyTransferService {
    private final ValidationService sourceAccountValidation;
    private final FeeService feeService;
    public MoneyTransferService(){
        this.sourceAccountValidation = new ValidationService();
        this.feeService = new FeeService();
    }
    public void transferMoney(BankAccount sourceAcc, BankAccount destinationAccount, double value) throws Exception {
        this.sourceAccountValidation.validateSourceAccountForMoneyTransfer(sourceAcc, value);

        sourceAcc.setBalance(sourceAcc.getBalance()-(value+this.feeService.CalculateFee(sourceAcc,value)));
        destinationAccount.setBalance(sourceAcc.getBalance()+value);
    }
    public void transferMoneyByATM(BankAccount sourceAcc, double value) throws Exception {

        this.sourceAccountValidation.validateSourceAccountForMoneyTransfer(sourceAcc, value);
        sourceAcc.setBalance(sourceAcc.getBalance()-(value+this.feeService.CalculateFee(sourceAcc, value)));
    }
}
