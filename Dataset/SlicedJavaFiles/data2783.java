public class Main{	public static void main(String[] args) throws IOException,NumberFormatException{
		try {
			FastScanner sc=new FastScanner();
			int t=sc.nextInt();
			while(t-->0) {
				int a=sc.nextInt(),b=sc.nextInt();
				int count=0;
				while(a!=0&&b!=0) {
					if(a>b) {
						int temp=a;
						a=b;
						b=temp;
					}
				    count+=(b/a);
				    b=b%a;
				}
				System.out.println(count);
			}			
			
		}
		catch(Exception e) {
			return ;
		}

	}
}