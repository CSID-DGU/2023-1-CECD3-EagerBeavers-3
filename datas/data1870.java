public class Main{	public static void main(String[] args) throws Exception
	{
		new Thread(null, new Runnable()
		{
			@Override
			public void run()
			{
				new main().solve();
			}
		}, "1", 1 << 26).start();
	}
}