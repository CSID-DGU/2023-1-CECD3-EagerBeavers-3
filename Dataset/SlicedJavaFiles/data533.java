public class Main{	public static void main(String[] args) throws Exception {
		Reader sc=new Reader();
		StringBuilder finalAnswer=new StringBuilder();
		//finalAnswer.append(1).append('\n');
		int t=sc.nextInt();
		while(t-->0) {
			int count=0;
			int n=sc.nextInt();
			if(n==2 || n==4) {
				finalAnswer.append("YES").append('\n');
				count++;
			}
			if(n%2==0 && count==0){
				n/=2;
				if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n) {
					finalAnswer.append("YES").append('\n');
					count++;
				}
				else {
					n*=2;
				}
			}
			if(n%4==0 && count==0) {
				n/=4;
				if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n) {
					finalAnswer.append("YES").append('\n');
					count++;
				}
			}
			if(count==0){
				finalAnswer.append("NO").append('\n');
			}
		}
		System.out.println(finalAnswer);
	}
}