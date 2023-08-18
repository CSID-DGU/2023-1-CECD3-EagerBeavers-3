public class Main{	public static void main(String [] argv)
	{
		//String filePath="input.txt";
        String filePath=null;
        if(argv.length>0)filePath=argv[0];
		new C(filePath);
	}
}