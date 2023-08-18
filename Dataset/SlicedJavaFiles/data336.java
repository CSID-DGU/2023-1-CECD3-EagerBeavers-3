public class Main{	public static void main(String [] argv)
	{
		String filePath=null;
		if(argv.length>0)filePath=argv[0];
		C c = new C(filePath);
	}
}