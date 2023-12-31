package org.delta.bank;

import com.google.inject.AbstractModule;
import org.delta.bank.print.ConsoleLogger;
import org.delta.bank.print.LoggerInterface;

public class BankInjector extends AbstractModule {
    @Override
    protected void configure() {
        this.bind(LoggerInterface.class).to((Class<? extends LoggerInterface>) ConsoleLogger.class);
    }
}
