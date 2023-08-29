public class Main{	public static void main(String[] args)throws IOException {
		Reader.init(System.in);
		long n=Reader.nextLong();
		s=Reader.nextLong();
		long lo=1,hi=n,mid;
		while(lo<hi){
			mid=(lo+hi)/2;
			if(diff(mid)>=s)
				hi=mid;
			else
				lo=mid+1;
		}
		if(diff(lo)>=s)
			System.out.println(n-lo+1);
		else
			System.out.println(0);
	}
}