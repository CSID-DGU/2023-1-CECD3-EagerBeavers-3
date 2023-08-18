public class Main{	public static void main(String[] args) {

		FastReader sc = new FastReader();
		OutputStream outputstream = System.out;
		PrintWriter out = new PrintWriter(outputstream);

		long n = sc.nextLong();
		long[] arr = new long[14];
		for(int i = 1; i <= 13; i++){
			arr[i] = (long)Math.pow(10, i)-(long)Math.pow(10, i-1);
		}
		long total = 0;
		/*for(int i = 1; i <= 13; i++) out.print(arr[i] + " ");
		out.println();*/
		for(int i = 1; i <= 13; i++){
			if(total+(long)i*arr[i]>=n){
				long ans = n-total;
				long rest = ans;
				//System.out.println(rest);
				if(ans%i!=0){
					ans /= i;
					ans++;
				} else {
					ans /= i;
				}
				ans += (long)Math.pow(10, i-1)-1;
				String str = Long.toString(ans);
				int ind = (rest%i==0) ? i-1 : (int)(rest%i)-1;
				//System.out.println(ind);
				out.println(str.charAt(ind));
				break;
			}
			total = total+(long)i*arr[i];
			//System.out.println(total);
		}
		out.close();
	}
}