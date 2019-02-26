package ThreadDemo1;


public class ThreadSyncDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer2);
        t1.setName("Customer-1");
        t2.setName("Customer-2");
        t1.start();
        t2.start();
    }
}