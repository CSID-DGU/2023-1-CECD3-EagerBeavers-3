public class Main{	public static void main(String[] args)
   {
       InputReader in=new InputReader(System.in);
       PrintWriter pw = new PrintWriter(System.out);
       int n=in.nextInt();
       long arr[]=new long[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=in.nextLong();
       }
       HashMap<Long,Integer>hm=new HashMap<>();
       int id=0;
       for(int i=0;i<n;i++) {
    	   long sum=0;
    	   for(int j=i;j<n;j++) {
    		   sum+=arr[j];
    		   if(!hm.containsKey(sum)) {
    			   hm.put(sum, id++);
    			   a[id-1]=new ArrayList<pair>();
    		   }
    		   a[hm.get(sum)].add(new pair(i,j));
    	   }
       }
       Vector<pair>fi=new Vector<>();
       for(int i=0;i<id;i++) {
    	  Vector<pair> v=schedule_it(a[i]);
    	   if(v.size()>fi.size()) {
    		   fi=v;
    	   }
       }
       pw.println(fi.size());
       for(int i=0;i<fi.size();i++) {
    	   pw.println((fi.get(i).x+1)+" "+(fi.get(i).y+1));
       }
       pw.flush();
       pw.close();
        
    }
}