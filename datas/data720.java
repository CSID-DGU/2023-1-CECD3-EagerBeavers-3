public class Main{	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if ((s.charAt(0) == 'R') && 
				(s.charAt(1) >= '0' && s.charAt(1) <= '9') &&
				(s.indexOf('C') != -1)) {
				
				System.out.println(toXC(fromRC(s)));
			} else {
				System.out.println(toRC(fromXC(s)));
			}
		}
	}
}