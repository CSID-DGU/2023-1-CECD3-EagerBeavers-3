public class Main{	public static void main(String[] args) throws IOException{
		int n = nextInt(),
			k = nextInt(),
			a[] = new int[n];

		int s = 0;
		for (int i=2; i<=n; i++)
			if (prime(i))
				a[s++] = i;
		
		int m = 0;
		for (int i=2; i<s; i++)
			for (int j=i-1; j>0; j--)
				if (a[i] == a[j]+a[j-1]+1){
					m++;
					break;
				}
		
		if (m >= k) out.println("YES");
		else out.println("NO");
		out.flush();
	}
}