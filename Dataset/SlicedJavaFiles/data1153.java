public class Main{	public static void main(String args[]){
		PrintWriter pw=new PrintWriter(System.out);
		InputReader ip=new InputReader(System.in);
		
		long n;
		n=ip.nextLong();
		s=ip.nextLong();

		if(s>n){
			pw.println("0");
		}
		else{
			long l=0,r=n;
			boolean possible=false;
			long mid=0;
			int it=100;
			while(it-->0){
				mid = (l+r)/2;
				if(check(mid)){
					r=mid;
					possible = true;
				}
				else{
					l=mid+1;
				}
		//		pw.println(mid);
		//		pw.println(l+" "+r);
			}
			if(possible){
				pw.println(n-l+1);
			}	
			else{
				pw.println("0");
			}
		}
		
		pw.close();
	}
}