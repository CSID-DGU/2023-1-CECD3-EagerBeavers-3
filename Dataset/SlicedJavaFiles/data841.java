public class Main{	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i=0;i<prime.length-1;i++) {
			if ((prime[i]+prime[i+1]+1) > n || k == 0)
				break;
			if (isPrime(prime[i]+prime[i+1]+1))
				k--;
		}
		
		if (k == 0)
			outnl("YES");
		else
			outnl("NO");
	}
}