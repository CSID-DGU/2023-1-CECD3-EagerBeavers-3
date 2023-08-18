public class Main{	public static void main(String [] args) throws IOException, InterruptedException {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		pair [] arr=new pair[x];
		for(int i=0;i<x;i++) arr[i]=new pair(i, sc.nextInt(),0);
		for(int i=0;i<x;i++) arr[i].y=sc.nextInt();
		Arrays.sort(arr);
		PriorityQueue<Integer> qq=new PriorityQueue<>();
		//pw.println(Arrays.toString(arr));
		Long [] list=new Long [x];
		long sum=0; 
		for(int i=0;i<x;i++) {
			pair w=arr[i];
			if(qq.size()<y) {
				qq.add(w.y);
				sum+=w.y;
				list[w.i]=sum;

			}else if(!qq.isEmpty()) {
				sum+=w.y;
				list[w.i]=sum;
				int first=qq.poll();
				if(w.y>first) {
					sum-=first;
					qq.add(w.y);
				}else {
					qq.add(first);
					sum-=w.y;
				}
			} else list[w.i]=(long) w.y;
			//pw.println(qq);
		}
		for(Long w:list) pw.print(w+" "); 
		pw.flush();
		pw.close();
	}
}