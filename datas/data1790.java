public class Main{	public static void main(String [] argv)
	{
		//String filePath="input.txt";
		//String filePath="D:\\_d\\learn\\coursera\\algorithms and design II\\data\\knapsack2.txt";
        String filePath=null;
		if(argv.length>0)filePath=argv[0];
		new A(filePath);
	}
}