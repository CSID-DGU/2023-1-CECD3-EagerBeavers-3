public class Main{	public static void main(String args[]) throws Exception
	{
		new Thread(null, new lc1(),"lc1",1<<26).start();
	}
}