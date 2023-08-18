public class Main{	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int inv = 0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++)
			for (int j = i+1; j < arr.length; j++)
				if(arr[i] > arr[j])
					inv++;
		
		
		boolean odd = (inv%2)!=0;
		int q = sc.nextInt();
		for (int i = 0; i < q; i++)
		{
			int l = sc.nextInt();
			int r = sc.nextInt();
			int sz = r-l+1;
			int tot = (sz*(sz-1))/2;
			if(tot%2 != 0)
				odd = !odd;
			if(odd)
				pw.println("odd");
			else
				pw.println("even");
		}
		
		pw.flush();
		pw.close();
	}
}