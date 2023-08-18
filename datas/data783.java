public class Main{	public static void main(String[] args) throws IOException{
	    int n = ip.i() ;
	    TreeMap<Character,Integer> map = new TreeMap<Character,Integer>() ;
	    TreeSet<Character> set = new TreeSet<Character>() ;
	    char c[] = ip.S().toCharArray() ;
	    for(char t : c)
	    	set.add(t) ;
	    int size = set.size() ;
	    for(int i=0 ; i<size ; i++)
	    	map.put(set.pollFirst(),i) ;
	    int a[] = new int[n] ;
	    for(int i=0 ; i<n ; i++)
	    	a[i]=map.get(c[i]) ;
	    int erl[][] = new int[size][n] ;
	    for(int i=0 ; i<size ; i++)
	    	for(int j=n-1 ; j>=0 ; j--)
	    		erl[i][j]=(a[j]==i) ? j : (j==n-1 ? -1 : erl[i][j+1]) ;
	    long min = Long.MAX_VALUE ;
	    for(int i=0 ; i<n ; i++){
	    	long maxt = Long.MIN_VALUE ;
	    	for(int j=0 ; j<size ; j++)		
	    		if(erl[j][i]!=-1)
	    			maxt = Long.max(maxt,(erl[j][i]-i+1)) ;
	    		else{
	    			maxt = Long.MAX_VALUE ;
	    			break ;
	    		}
	    	min = Long.min(min,maxt) ;	    	
	    }
	    op.print(min) ;
		Finish() ;
	}
}