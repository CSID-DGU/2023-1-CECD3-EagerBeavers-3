public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long s = sc.nextLong();
		long i;
		for(i =s ; i-sum(i+"")<s;i++)
			if(i%10==0)i+=9;
		System.out.println(Math.max(0, n-i+1));
		
	}
}