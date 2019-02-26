package ThreadDemo1;

import java.util.concurrent.SynchronousQueue;

public class Customer implements Runnable {
    @Override
    public void run() {
        Bank bank = Bank.getInstance();
        BankAccount account = bank.getAccount(123456);
        synchronized (account)
        {
        	account.deposit(100);
        	account.withdraw(200);
        }
    }
}