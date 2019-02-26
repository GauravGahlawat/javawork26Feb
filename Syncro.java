package ThreadDemo1;

public class Syncro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First fnew = new First();
		Second ss = new Second(fnew,"Welcome");
		Second ss1 = new Second(fnew,"Thread");
		Second ss2 = new Second(fnew,"Programmer");

	}

}
