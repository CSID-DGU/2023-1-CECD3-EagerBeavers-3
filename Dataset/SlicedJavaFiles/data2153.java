public class Main{	public static void main(String args[]) throws Exception
	{
		new Thread(null, new Solution1(),"Solution1",1<<26).start();
	}
}