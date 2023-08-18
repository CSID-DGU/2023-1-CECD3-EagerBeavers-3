public class Main{    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
      //  Reader sc=new Reader();
        PrintWriter out=new PrintWriter(System.out);
        int t = sc.nextInt();
		while(t-->0) {
		    int n=sc.nextInt();
		     ArrayList<Integer> al[]=new ArrayList[n+1];
		     
		    for(int i=0;i<=n;i++)
		    al[i]=new ArrayList<>();
		    
		    al[0].add(1);
		    
		    int y;
		    y=sc.nextInt();
		    boolean flag=true;
		    for(int i=1;i<=n-1;i++) {
		         int x=sc.nextInt();
		        int idx=al[i-1].size()-1;
		        if(x!=1) {
		            while(flag) {
		                int ans=x-1;
		                if(al[i-1].get(idx)==ans) {
		                    idx--;
		                   break;
		                }
		                idx--;
		            }
		        }
		        for(int j=0;j<=idx;j++) {
		            al[i].add(al[i-1].get(j));
		        }
		        al[i].add(x);
		    }
		    
		    for(int i=0;i<=n-1;i++) {
		        out.print(al[i].get(0));
		        for(int j=1;j<=al[i].size()-1;j++) {
		            out.print("."+al[i].get(j));
		        }
		        out.println();
		    }
	
        
  }
		  
		  out.flush();
		  out.close();
		 
		  
  
		  
        }
}