public class Main{	public static void main(String[] args) throws Exception{
		StringTokenizer st=new StringTokenizer(in.readLine());
		int n=Integer.parseInt(st.nextToken());
		int r=Integer.parseInt(st.nextToken());
		int[] x=new int[n];
		st=new StringTokenizer(in.readLine());
		for(int i=0;i < n;i++){
			x[i]=Integer.parseInt(st.nextToken());
		}
		sim a=new sim(n,r);
		for(int i:x) {
			a.add(i);
		}
		for(double d:a.cy) {
			out.print(d+" ");
		}
		out.println();
		out.close();
	}
}