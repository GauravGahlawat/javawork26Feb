package ThreadDemo1;

public class BankAccount {
    private Integer balance;
    private Integer accountNumber;
    public BankAccount(Integer accountNumber, Integer initialBalance) {
    this.accountNumber = accountNumber;
    balance = initialBalance;
    }
    public BankAccount(Integer accountNumber) {
    this(accountNumber, 0);
    }
    public Integer getBalance() {
    return balance;
    }
    public Integer getAccountNumber() {
    return accountNumber;
    }
    public void deposit(Integer amount) {
          balance = balance + amount;
          System.out.println(Thread.currentThread().getName() + " depositing the amount "+amount+" updated balance =  " + balance);
    }
public Integer withdraw(Integer amount) {
  System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount + " from the account " + accountNumber);
  if (balance < amount) {
    System.out.println("OOPS, NO BALANCE LEFT TO WITHDRAW FOR "+Thread.currentThread().getName());
    return 0;
  }
  balance = balance - amount;
  System.out.println(Thread.currentThread().getName() + " successfully withdrow the amount. balance left =  " + balance);
  return amount;
}
}