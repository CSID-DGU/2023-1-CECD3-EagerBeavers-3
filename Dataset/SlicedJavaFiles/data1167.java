public class Main{	public static void main(String[] args){
		InputReader in = new InputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = 1;
		for(int zxz=0;zxz<t;zxz++){
			// my code starts here
			long n = in.nextLong();
			long s = in.nextLong();
			long start=0,end=n;
			long ans=n+1;
			while(start<=end){
				long mid = start+(end-start)/2;
				if(mid-digitSum(mid)>=s){
					ans = mid;
					end = mid-1;
				}
				else{
					start=mid+1;
				}
			}
			System.out.println(n-ans+1);
			// my code ends here
		}
	}
}