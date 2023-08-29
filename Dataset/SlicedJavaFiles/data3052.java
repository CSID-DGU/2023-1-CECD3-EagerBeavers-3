public class Main{ 	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String[] s = new String[2];
		for(int i = 0; i < 2; i++){
			s[i] = scanner.next();
		}
		int n = s[0].length();
		char[][] c = new char[2][n];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < n; j++){
				c[i][j] = s[i].charAt(j);
			}
		}
		int count = 0;
		for(int i = 0; i < n-1; i++){
			if(c[0][i] == '0' && c[1][i] == '0' && c[0][i+1] == '0'){
				c[0][i] = 'X';
				c[1][i] = 'X';
				c[0][i+1] = 'X';
				count++;
			}
			if(c[0][i] == '0' && c[1][i] == '0' && c[1][i+1] == '0'){
				c[0][i] = 'X';
				c[1][i] = 'X';
				c[1][i+1] = 'X';
				count++;
			}
			if(c[0][i] == '0' && c[0][i+1] == '0' && c[1][i+1] == '0'){
				c[0][i] = 'X';
				c[0][i+1] = 'X';
				c[1][i+1] = 'X';
				count++;
			}
			if(c[0][i+1] == '0' && c[1][i+1] == '0' && c[1][i] == '0'){
				c[1][i] = 'X';
				c[0][i+1] = 'X';
				c[1][i+1] = 'X';
				count++;
			}
		}
		System.out.println(count);
	}
}