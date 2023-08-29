public class Main{	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tb;
		int n = Integer.parseInt(br.readLine());
		int x = 0,y=0;
		if(n%2==0){
			x = n-4;
			y = 4;
		}else{
			x = n-9;
			y = 9;
		}
		System.out.println(x+" "+y);
	}
}