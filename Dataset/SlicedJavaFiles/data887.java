public class Main{	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner();
		N=sc.nextInt();
		K=sc.nextInt();
		for(int i=0;i<N;i++)
			array[i]=sc.nextInt();
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		boolean flag=false;
		for(int i=0;i<N;i++){
			if (!map.containsKey(array[i])){
				map.put(array[i], i);
				if (map.size()==K){
					flag=true;
					break;
				}
			}
			else
				map.put(array[i], i);
		}
		if (!flag)
			System.out.println("-1 -1");
		else{
			Set<Integer> s=map.keySet();
			int l=Integer.MAX_VALUE;
			int r=Integer.MIN_VALUE;
			for(int k: s){
				int tmp=map.get(k);
				l=Math.min(l, tmp);
				r=Math.max(r, tmp);
			}
			System.out.println((l+1)+" "+(r+1));
		}
	}
}