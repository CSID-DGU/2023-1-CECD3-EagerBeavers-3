public class Main{	public static void main(String[] args) {
		// TODO Auto-generated method stub

	FastReader in=new FastReader();
	HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();

	int n=in.nextInt();
	int r=in.nextInt();
	 
	double theta=(double)360/(double)n;
	 
	double b=1-((double)2/(double)(1-Math.cos((double)2*Math.PI/(double)n)));
	double x=Math.sqrt(1-b)-1;
	double ans=(double)r/(double)x;
	System.out.println(ans);





	}
}