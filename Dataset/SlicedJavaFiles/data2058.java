public class Main{	public static void main(String[] args)throws Exception{
	//	Scanner sc =new Scanner(new File("input.txt"));
		Scanner sc =new Scanner(System.in);
     // File file = new File("prime2.txt");
	//	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
	//	sc.useDelimiter("(\\s)+|[,]");
	//	ArrayList<Integer> lis = new ArrayList<Integer>();
	//ArrayList<String> lis = new ArrayList<String>();
	//System.out.println();
    //  for(int i=0;i<;i++)
		
   while(sc.hasNext()){
	 
	 int n=ni(sc),x[]=new int[n+1];
	 for(int i=1;i<=n;i++)x[i]=ni(sc);
	 sort(x);
	 if(x[n]==1){x[n]=2;for(int i=1;i<=n;i++)System.out.print(x[i]+" ");}
	 else{x[0]=1;
	 for(int i=0;i<n;i++)System.out.print(x[i]+" ");
	 }
      
   }
	 
	   
	  
	}
}