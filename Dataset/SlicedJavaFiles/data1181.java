public class Main{	public static void main(String args[])
	{
		new Thread(null, new TestClass(),"TESTCLASS",1<<18).start();
	}
}