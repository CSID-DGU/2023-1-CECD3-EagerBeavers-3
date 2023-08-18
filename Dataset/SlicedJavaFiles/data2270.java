public class Main{	public static void main(String[] args) throws IOException {
		int commands = sc.nextInt();
		int[][] dp = new int[5000][5000];
		int interesting = 0;
		String prgm = "";
		while (interesting < commands){
			byte q = sc.read();
			if (q == 115 ){
				interesting += 1;
				prgm += "s";
			}
			else if (q == 102){
				prgm += "f";
				interesting += 1;
			}
		}
		//System.out.println("Program: "+prgm);
		dp[0][0] = 1; // line, indentations
		for(int line = 1;line<commands;line++){
			if(prgm.charAt(line-1) == 'f'){
				for(int indent  = 1;indent<Math.min(2*line + 1, 5000);indent++){
					dp[line][indent] = dp[line-1][indent-1];
				}
			}
			else if(prgm.charAt(line-1) == 's'){
				int w = 0;
				for(int indent = Math.min(2*line + 1, 4999);indent >= 0;indent--){
					w = (w + dp[line-1][indent])% STMOD;
					
					dp[line][indent] = w ;
				}
			}
		}
		int q = 0;
		for(int i = 0;i<5000;i++){
			q  = ( q + dp[commands-1][i] ) % STMOD;
		}
		System.out.println(q);
		
	    
	}
}