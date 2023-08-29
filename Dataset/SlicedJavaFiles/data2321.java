public class Main{	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			String[] ins = new String[N];
			for(int i = 0; i < N; i++){
				ins[i] = sc.next();
			}
			
			final long MOD = 1000000007;
			long[] DP = new long[N];
			long[] nextDP = new long[N];
			
			DP[0] = 1;
			
			for(int i = 1; i < N; i++){
				Arrays.fill(nextDP, 0);
				if("f".equals(ins[i - 1])){
					for(int j = 0; j < N - 1; j++){
						nextDP[j + 1] += DP[j];
						nextDP[j + 1] %= MOD;
					}
				}else{
					for(int j = N - 1; j >= 0; j--){
						nextDP[j] += DP[j];
						nextDP[j] %= MOD;
						
						if(j < N - 1){
							nextDP[j] += nextDP[j + 1];
							nextDP[j] %= MOD;
						}
					}
				}
				
				{
					long[] tmp = DP;
					DP = nextDP;
					nextDP = tmp;
				}
			}
			
			long answer = 0;
			for(int i = 0; i < N; i++){
				answer += DP[i];
				answer %= MOD;
			}
			
			System.out.println(answer);
		}
	}
}