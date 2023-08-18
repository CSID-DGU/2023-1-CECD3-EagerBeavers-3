public class Main{    public static void main(String[] args) throws Exception {
        FastReader sc=new FastReader();
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
//        ArrayList<Integer> prime=getPrimeSieve();
        int t=sc.nextInt();
        int po=0;
        
        dirs=new HashMap<>();
        dirs.put('U', new ArrayList<>());
        dirs.get('U').addAll(Arrays.asList('U','R','D','L'));
        dirs.put('L', new ArrayList<>());
        dirs.get('L').addAll(Arrays.asList('L','U','R','D'));
        dirs.put('D', new ArrayList<>());
        dirs.get('D').addAll(Arrays.asList('D','L','U','R'));
        dirs.put('R', new ArrayList<>());
        dirs.get('R').addAll(Arrays.asList('R','D','L','U'));
//        
        outer:while(t-- >0) {
        	po++;
        	int n=sc.nextInt();
        	int x=(int) Math.sqrt(n/2);
        	int y=(int) Math.sqrt(n/4);
        	
        	if(x*x*2 == n || y*y*4==n)
        		bw.append("YES\n");
        	else {
        		bw.append("NO\n");
        	}
//        	int x=sc.nextInt();
//        	Integer[] arr=new Integer[n];
//        	long sum=0;
//        	
//        	for(int i=0;i<n;i++) {
//        		arr[i]=sc.nextInt();
//        		sum+=arr[i];
//        	}
//        	
//        	if(sum==x) {
//    			bw.append("NO\n");
//    			continue outer;
//        	}
//
//        	Arrays.sort(arr,Collections.reverseOrder());
//        	
//        	sum=0;
//        	for(int i=0;i<n-1;i++) {
//        		sum+=arr[i];
//        		
//        		if(sum==x) {
//        			int temp=arr[i];
//        			arr[i+1]=arr[i];
//        			arr[i]=temp;
//            		sum=sum-arr[i+1]+arr[i];
//        		}
//        	}
//        	bw.append("YES\n");
        	
//        	for(int i=0;i<n;i++) {
//        		bw.append(arr[i]+" ");
//        	}
//        	bw.append("\n");
//        	bw.append("Case #"+po+": "+0+"\n");
        }
        bw.close();
    }
}