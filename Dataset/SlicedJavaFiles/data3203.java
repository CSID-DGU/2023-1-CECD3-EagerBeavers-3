public class Main{	public static void main(String[] args) throws Exception {
		
		int n = nextInt();
		String nn = Integer.toString(n);
		if(n >= 0){
			println(n);
		} else {
			println(Math.max(Integer.parseInt(nn.substring(0,nn.length() - 1)), Integer.parseInt(nn.substring(0, nn.length() - 2) + nn.charAt(nn.length() - 1))));
		}
	}
}