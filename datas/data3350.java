public class Main{	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		int max=0;
		for(int i=1;i<s.length();i++){
			for (int j = 0; j <= s.length()-i; j++) {
				String sub=s.substring(j,j+i);
				if(count(s,sub)>=2)
				max=Math.max(max, i);
			}
		}
		System.out.println(max);
	}
}