package ThreadDemo1;

public class InterThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Customer1 c = new Customer1();
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
	}

}
class Customer1
{
	int amount = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("Available Balance " + this.amount);
		System.out.println("Going to withdraw " + amount);
		
		if(this.amount < amount)
		{
			System.out.println("Insufficient balance waiting for deposit.");
			try
			{
				wait(); // interthread connection
			}
			catch(Exception e)
			{
				System.out.println("Interruption Occured");
			}
		}
		this.amount -= amount;
		System.out.println("detected amount :" + amount);
		System.out.println("balance amount :" + this.amount);
	}
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit " + amount);
		this.amount += amount;
		System.out.println("Available balance " + this.amount);
		System.out.println("Transaction Completed.\n");
		notify();
	}
}
