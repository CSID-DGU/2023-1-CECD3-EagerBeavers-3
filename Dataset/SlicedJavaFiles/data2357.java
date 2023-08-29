public class Main{	public static void main(String[] args)
	{
		new Thread(null, new Runnable()
		{
			public void run()
			{
				try
				{
					soln();
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}, "1", 1 << 26).start();
	}
}