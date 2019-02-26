package ThreadDemo1;

class Count extends Thread
{
	Count()
	{
		super("my extending thread");
		System.out.println("my thread created" + this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("printing the count : " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("my thread interrupted");			
		}
		System.out.println("My thread run is over");
	}
}
public class ExtendingExample {
	public static void main(String args[])
	{
		Count cnt = new Count();
		try
		{
			while(cnt.isAlive())
			{
				System.out.println("MAIN tHREAD WILL BE ALIVE TILL THE CHILD THREAD IS LIVE");
				Thread.sleep(1200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
	}

}
