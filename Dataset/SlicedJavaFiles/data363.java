public class Main{	public static void main(String[] args) throws IOException{
		int n = nextInt();
		byte s[] = nextStr().getBytes();
		
		int res = f(s, n);
		for (int i=1; i<n; i++){
			byte c = s[0];
			for (int j=0; j<n-1; j++)
				s[j] = s[j+1];
			s[n-1] = c;
			res = Math.min(res, f(s, n));
		}
		
		out.println(res);
		out.flush();
	}
}