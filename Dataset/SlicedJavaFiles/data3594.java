public class Main{		        	public static void main(String[] args) throws IOException {
		    	
		    	 inFile=new File("input.txt");
		    	 outFile = new File ("output.txt");
			     fWriter = new FileWriter (outFile);
			    pWriter = new PrintWriter (fWriter);
			  Scanner sc = new Scanner (inFile);
			  int n=sc.nextInt();
			  int m=sc.nextInt();
			  char c[][]=new char[n][m];
			  for(int i=0;i<n;i++){
				  for(int j=0;j<m;j++){
					  c[i][j]='.';
				  }
			  }
			  setup(n, m);
			  int k=sc.nextInt();
			  for(int i=0;i<k;i++){
				  int x=sc.nextInt();
				  int y=sc.nextInt();
				  queue.add(new Pair(x-1, y-1));
				  c[x-1][y-1]='X';
			 level[x-1][y-1]=-1;
			 Visite[x-1][y-1]=true;
			  }
			BFS(c, n, m);
		    	pWriter.close();
		    	sc.close();
		    }
}