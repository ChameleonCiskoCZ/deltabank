package org.delta.bank.print;

import org.delta.bank.account.BaseBankAccount;
import org.delta.bank.people.Owner;

public class LoggerService implements LoggerInterface {
    private final Logger logger = new Logger();

    public void log(String message) {
        logger.log(message);
    }

}
