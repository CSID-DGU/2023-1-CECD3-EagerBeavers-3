public class Main{	public static void main(String[] args) throws IOException {
	
	Reader.init(System.in);
	PrintWriter out=new PrintWriter(System.out);
	long n=Reader.nextInt();
	long k=Reader.nextLong();
	long v=8*n+8*k+4;
	long v2=(long) Math.sqrt(v);
	long v3=2*n+2;
	//long v4=(v3+v2)/2;
	long v5=(v3-v2)/2;
	out.println(v5);
	
	
	
	
	
	out.flush();
	}
}