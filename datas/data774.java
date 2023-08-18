public class Main{	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputReader in=new InputReader(System.in);
		OutputWriter out=new OutputWriter(System.out);
		int n=in.readInt();
		String s=in.readString();
		int low[]=new int[26];
		int upper[]=new int[26];
		boolean islow[]=new boolean[26];
		boolean isupper[]=new boolean[26];
		Arrays.fill(low,Integer.MAX_VALUE);
		Arrays.fill(upper, Integer.MAX_VALUE);
		
		int ans[]=new int[n];
		int finalsans=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			int c=s.charAt(i);
			if(c>='a'&&c<='z'){
				islow[c-'a']=true;
			}
			else{
				isupper[c-'A']=true;
			}
			
		}
		
		
		for(int i=n-1;i>=0;i--){
			int c=s.charAt(i);
			
			if(c>='a'&&c<='z'){
				low[c-'a']=i;
			}
			else{
				upper[c-'A']=i;
			}
			
			
			for(int j=0;j<26;j++){
				if(islow[j]==true){
					ans[i]=Math.max(ans[i], low[j]);
				}
			}
          for(int j=0;j<26;j++){
        	  if(isupper[j]==true){
        		  ans[i]=Math.max(ans[i], upper[j]);
				}
			}
          
          finalsans=Math.min(ans[i]-i+1, finalsans);
		}
		

		System.out.println(finalsans);
		
		
	}
}