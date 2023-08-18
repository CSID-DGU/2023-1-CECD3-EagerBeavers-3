public class Main{	public static void main(String [] argv) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		Main ma=new Main();
		String[] l1=in.readLine().split(" ");
		int n=Integer.parseInt(l1[0]);
		int q=Integer.parseInt(l1[1]);
		String[] ar=in.readLine().split(" ");
		int a1=Integer.parseInt(ar[0]);
		int b1=Integer.parseInt(ar[1]);
		for(int i=0;i<n;i++){
			ma.l.add(Integer.parseInt(ar[i]));
		}
		int m=ma.l.findmax();
		int[][] pair=new int[n][2];
		int t=0;
		for(int i=0;i<n;i++){
			if(ma.l.start.data==m)
				break;
			ma.l.myfunc();
			pair[t][0]=ma.l.start.data;
			pair[t][1]=ma.l.start.next.data;
			t++;
		}
		int rl[]=new int[n];
		node temp=ma.l.start;
		for(int i=0;i<n;i++){
			rl[i]=temp.data;
			temp=temp.next;
		}
		for(int i=0;i<q;i++){
			long a=Long.parseLong(in.readLine());
			if(a==1){
				System.out.println(a1 + " " + b1);
			}
			else{
				if(a<=t+1){
					System.out.println(pair[(int)(a-2)][0]+" "+pair[(int)(a-2)][1]);
				}
				else{
					if((a-t)%(n-1)==0){
						System.out.println(rl[0]+" "+rl[n-1]);
					}
					else{
						System.out.println(rl[0]+" "+rl[(int)((a-t)%(n-1))]);
					}
				}
			}
		}
	}
}